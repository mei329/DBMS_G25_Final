package Entity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Order extends ConnectDb {
	private Blacklist blck = new Blacklist();

	public static void main(String[] args) {
		Order o = new Order();

		ArrayList<Long> users = new ArrayList<Long>();
		users.add(109405007l);

		long oid = o.createOrder("A001", "2022-06-21", 9, 10, users);
		System.out.println("createOrder: " + oid);

		System.out.println("checkSeat: " + o.checkSeat("A001", 109405007l));
		
		System.out.println("modifyUser: " + o.modifyUser(oid, 109405007l, 109405088l));

		System.out.println("modifyUser: add a blacklist user: " + o.modifyUser(oid, 109405088l, 109306099l));

		System.out.println("modifyTime: " + o.modifyTime(oid, "borrow_end", 12));

		System.out.println("delOrder: " + oid + " " + o.delOrder(oid));

		System.out.println("checkSeat: " + o.checkSeat("A001", 109405088l));

		users.add(109405088l);
		System.out.println("checkRoom: " + o.checkRoom("401", users));
		users.add(109405094l);
		System.out.println("checkRoom: " + o.checkRoom("401", users));
		users.add(109306099l);
		System.out.println("checkRoom: " + o.checkRoom("401", users));
	}

	public long createOrder(String seat_id, String orderDate, int borrow_start, int borrow_end, ArrayList<Long> users) {
		// remember to call checkSeat or checkRoom method before placing order!!!

		long timestamp = new Date().getTime();
		String sql = "INSERT INTO "
				+ "Orders(order_id , seat_id , order_status , order_date , borrow_start , borrow_end) "
				+ "VALUES(?,?,?,?,?,?)";
		String sql2 = "INSERT INTO " + "OrderUsers(order_id , user_id) " + "VALUES(?,?)";

		try {
			super.connect();
			// Update to Room
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, timestamp);
			pstmt.setString(2, seat_id);
			pstmt.setString(3, "T");
			pstmt.setString(4, orderDate);
			pstmt.setInt(5, borrow_start);
			pstmt.setInt(6, borrow_end);

			// Update to OrderUsers
			if (pstmt.executeUpdate() != 0) {
				for (Long uid : users) {
					pstmt = conn.prepareStatement(sql2);
					pstmt.setLong(1, timestamp);
					pstmt.setLong(2, uid);
					if (users.size() > 1 && uid == users.get(0)) {
						// The 1st user_id in users is the lender.
						pstmt.setString(3, "T");
					}
					if (pstmt.executeUpdate() == 0) {
						delOrder(timestamp);
						return -1l;
					}
				}
				updateSeatStatus(seat_id, "F");
				updateUserStatus(users, "F");
				return timestamp;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			delOrder(timestamp);
		} finally {
			super.closeConn();
		}
		return -1l;
	}

	public boolean addUser(long order_id, long user_id) {
		try {
			super.connect();
			String query = "INSERT INTO OrderUsers(order_id, user_id) VALUES(" + order_id + ", " + user_id + ")";
			Statement stmt = conn.createStatement();
			if (checkUserStatus(user_id) && !blck.isBanned(user_id)) {
				if (stmt.executeUpdate(query) != 0) {
					updateUserStatus(user_id, "F");
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean modifyUser(long order_id, long before_user, long after_user) {
		// set before_user to after_user from OrderUsers
		try {
			super.connect();
			String query = "UPDATE OrderUsers SET user_id = " + after_user + " WHERE user_id = " + before_user
					+ " AND order_id = " + order_id;
			Statement stmt = conn.createStatement();
			if (checkUserStatus(after_user) && !blck.isBanned(after_user)) {
				if (stmt.executeUpdate(query) != 0) {
					updateUserStatus(before_user, "T");
					updateUserStatus(after_user, "F");
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean modifyTime(long order_id, String attr, int time) {
		// attr == "borrow_start" or "borrow_end"
		try {
			super.connect();
			String query = "UPDATE Orders SET " + attr + " = " + time + " WHERE order_id = " + order_id;
			Statement stmt = conn.createStatement();

			String status = select("order_status", "Orders", "order_id", Long.toString(order_id))[0];
			if (status.equals("T")) {
				if (stmt.executeUpdate(query) != 0) {
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean delOrder(long order_id) {
		// Delete from Orders and OrderUsers
		try {
			super.connect();
			String query = "DELETE from Orders where order_id = " + order_id;
			Statement stmt = conn.createStatement();

			String[] seat_id = select("seat_id", "Orders", "order_id", Long.toString(order_id));

			if (stmt.executeUpdate(query) != 0 && delUser(order_id) == true) {
				if (seat_id.length != 0) {
					updateSeatStatus(seat_id[0], "T");
				}
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean delUser(long order_id) {
		try {
			super.connect();
			String query = "DELETE FROM OrderUsers WHERE order_id = " + order_id;
			Statement stmt = conn.createStatement();

			String[] users = select("user_id", "OrderUsers", "order_id", Long.toString(order_id));

			if (stmt.executeUpdate(query) != 0) {
				for (String u : users) {
					updateUserStatus(Long.parseLong(u), "T");
				}
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean delUser(long order_id, long user_id) {
		try {
			super.connect();
			String query = "DELETE FROM OrderUsers WHERE order_id = " + order_id + " AND user_id = " + user_id;
			Statement stmt = conn.createStatement();
			if (stmt.executeUpdate(query) != 0) {
				updateUserStatus(user_id, "T");
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean updateSeatStatus(String place_id, String status) {
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			// update seat or room status
			if (place_id.matches("^[ABC].*")) {
				String updateSeat = "UPDATE Seat SET seat_status = '" + status + "' WHERE seat_id = '" + place_id + "'";
				if (stmt.executeUpdate(updateSeat) != 0) {
					return true;
				}
			} else {
				String updateRoom = "UPDATE Room SET room_status = '" + status + "' WHERE room_id = " + place_id + "";
				if (stmt.executeUpdate(updateRoom) != 0) {
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean updateUserStatus(long user_id, String status) {
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			// update user status
			String updateUser = "UPDATE User SET user_status = '" + status + "' WHERE user_id = " + user_id;
			if (stmt.executeUpdate(updateUser) != 0) {
				return true;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean updateUserStatus(ArrayList<Long> users, String status) {
		for (Long uid : users) {
			if (!updateUserStatus(uid, status)) {
				return false;
			}
		}
		return true;
	}

	public boolean checkUserStatus(long user_id) {
		String query = "SELECT user_status FROM User WHERE user_id = " + user_id + " AND user_status = 'T'";
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			if (stmt.executeQuery(query).next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean checkSeatStatus(String seat_id) {
		try {
			super.connect();
			String query = "SELECT seat_status FROM Seat WHERE seat_id = '" + seat_id + "' AND seat_status = 'T'";
			Statement stmt = conn.createStatement();
			if (stmt.executeQuery(query).next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean checkRoomStatus(String room_id) {
		String query = "SELECT room_status FROM Room WHERE room_id = " + room_id + " AND room_status = 'T'";
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			if (stmt.executeQuery(query).next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean checkAttendance(String room_id, ArrayList<Long> users) {
		// check minimum and maximum attendance
		String query = "SELECT min_user, max_user FROM Room WHERE room_id = " + room_id;
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			if (stmt.execute(query)) {
				ResultSet result = stmt.getResultSet();
				int min = result.getInt("min_user");
				int max = result.getInt("max_user");
				if (min <= users.size() && users.size() <= max) {
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public String checkSeat(String seat_id, long user_id) {
		String errMsg = "Not available: ";
		// check seat status
		if (!checkSeatStatus(seat_id)) {
			errMsg += seat_id + ", ";
		}

		// check user status
		if (!checkUserStatus(user_id) || blck.isBanned(user_id)) {
			errMsg += user_id + ", ";
		}

		// return error message
		if (errMsg.equals("Not available: ")) {
			return "true";
		} else {
			return errMsg.substring(0, errMsg.length() - 2);
		}
	}

	public String checkRoom(String room_id, ArrayList<Long> users) {
		String errMsg1 = "Not available: ";
		// check room status
		if (!checkRoomStatus(room_id)) {
			errMsg1 += room_id + ", ";
		}
		// check user status
		for (Long user_id : users) {
			if (!checkUserStatus(user_id) || blck.isBanned(user_id)) {
				errMsg1 += user_id + ", ";
			}
		}

		// check minimum and maximum attendance
		String errMsg2 = "true";
		if (!checkAttendance(room_id, users)) {
			errMsg2 = "Fail to meet the attendance constraint.";
		}

		// return error message
		if (!errMsg1.equals("Not available: ")) {
			errMsg1 = errMsg1.substring(0, errMsg1.length()-2);
			if (errMsg2.equals("true")) {
				return errMsg1;
			} else {
				return errMsg1 + "\n" + errMsg2;
			}
		} else {
			return errMsg2;
		}
	}

	public String[] select(String select, String db, String attr, String value) {
		// String db = Orders or OrderUsers
		// String select = one attribute that you want to select
		String count = "SELECT COUNT(order_id) FROM " + db + " WHERE " + attr + " = '" + value + "'";
		String query = "SELECT " + select + " FROM " + db + " WHERE " + attr + " = '" + value + "'";
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(count);
			int size = 0;
			if (result.next()) {
				size = result.getInt(1);
			}
			String[] retVal = new String[size];
			int i = 0;
			result = stmt.executeQuery(query);
			while (result.next()) {
				retVal[i] = result.getString(1);
				i++;
			}
			return retVal;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeConn();
		}
		return null;
	}
}
