package Entity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Order extends ConnectDb {
	
	public static void main(String[] args) {
		Order o = new Order();
		Object[] oid = o.select("order_id", "order_date", "'2022-06-09'");
		for (int i = 0; i < oid.length; i++) {
			Long id = (Long) oid[i];
			o.delOrder(id);
		}
	}

	// A. 討論室
	public boolean createRoomOrder(int roomId, String oStatus, String orderDate, int borrow_start, int borrow_end,
			ArrayList<Long> users) {

		long time = createRoomOrder(roomId, oStatus, orderDate, borrow_start, borrow_end);
		if (time != -1) {
			// 新增訂單使用者
			boolean b = createOrderUsers(time, users);
			if (b == true) {
				return true;
			} else {
				// 刪除訂單
				delOrder(time);
				return false;
			}
		}
		return false;
	}

	public long createRoomOrder(int roomId, String oStatus, String orderDate, int borrow_start, int borrow_end) {
		
		super.connect();
		long timestamp = new Date().getTime();
		String sql = "INSERT INTO "
				+ "Orders(order_id , room_id , order_status , order_date , borrow_start , borrow_end) "
				+ "VALUES(?,?,?,?,?,?)";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, timestamp);
			pstmt.setInt(2, roomId);
			pstmt.setString(3, oStatus);
			pstmt.setString(4, orderDate);
			pstmt.setInt(5, borrow_start);
			pstmt.setInt(6, borrow_end);
			pstmt.executeUpdate();
			System.out.println("Create room order.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return -1l;
		} finally {
			super.closeConn();
		}

		return timestamp;
	}
	

	private boolean createOrderUsers(long order_id, ArrayList<Long> users) {
		
		super.connect();
		for (Long uid : users) {
			String sql = "INSERT INTO " + "OrderUsers( order_id , user_id) " + "VALUES(?,?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, order_id);
				pstmt.setLong(2, uid);
				if (users.size() > 1 && uid == users.get(0)) {
					// The 1st user_id in users is the lender.
					pstmt.setString(3, "T");
				}
				pstmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return false;
			} finally {
				super.closeConn();
			}
		}
		return true;
	}

	// B. 自習室
	public boolean createSeatOrder(String seatId, String oStatus, String orderDate, int borrow_start, int borrow_end,
			long user_id) {

		long time = createSeatOrder(seatId, oStatus, orderDate, borrow_start, borrow_end);
		if (time != -1) {
			 // 新增訂單使用者
			ArrayList<Long> users = new ArrayList<Long>();
			users.add(user_id);
			boolean b = createOrderUsers(time, users);
			if (b == true) {
				return true;
			} else {
				// 刪除訂單
				delOrder(time);
				return false;
			}
		}
		return false;
	}

	public long createSeatOrder(String seatId, String oStatus, String orderDate, int borrow_start, int borrow_end) {

		super.connect();
		long timestamp = new Date().getTime();
		String sql = "INSERT INTO "
				+ "Orders(order_id , seat_id , order_status , order_date , borrow_start , borrow_end ) "
				+ "VALUES(?,?,?,?,?,?)";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, timestamp);
			pstmt.setString(2, seatId);
			pstmt.setString(3, oStatus);
			pstmt.setString(4, orderDate);
			pstmt.setInt(5, borrow_start);
			pstmt.setInt(6, borrow_end);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return -1l;
		} finally {
			super.closeConn();
		}

		return timestamp;
	}
	
	public Object[] select(String select, String attr, String value) {
		// String select = one attribute that you want to select
		super.connect();
		String count = "SELECT COUNT(order_id) FROM Orders WHERE " + attr + " = " + value;
		String query = "SELECT " + select + " FROM Orders WHERE " + attr + " = " + value;
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(count);
			int size = 0;
			if (result.next()) {
				size = result.getInt(1);
			}
			Object[] retVal = new Object[size];
			int i = 0;
			result = stmt.executeQuery(query);
			while (result.next()) {
				retVal[i] = result.getObject(1);
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

	public boolean delOrder(long order_id) {
		
		super.connect();
		String sql = "DELETE from Orders where order_id = ?";
		String sql2 = "DELETE from OrderUsers where order_id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, order_id);
			int row = pstmt.executeUpdate();
			pstmt = conn.prepareStatement(sql2);
			pstmt.setLong(1, order_id);
			int row2 = pstmt.executeUpdate();
			
			if (row != 0 && row2 != 0) {
				System.out.println("DELETE from Orders AND OrderUsers where order_id = " + order_id + "  ==> SUCCESS!!");
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		
		return false;
	}

	public boolean delUser(int order_id, int user_id) {

		super.connect();
		try {
			String query = "DELETE FROM OrderUsers WHERE order_id = " + order_id + "AND user_id = " + user_id;
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean addUser(int order_id, int user_id) {

		super.connect();
		try {
			String query = "INSERT INTO OrderUsers VALUES(" + order_id + user_id + ")";
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean modifyTime(int order_id, String attr, Date time) {
		super.connect();
		// attr == "borrow_start" or "borrow_end"
		String getStart = "SELECT borrow_start FROM Orders WHERE order_id = " + order_id;
		try {
			Statement stmt = conn.createStatement();
			boolean hasResultSet = stmt.execute(getStart);
			if (hasResultSet == true) {
				ResultSet result = stmt.getResultSet();
				long borrowStart = result.getInt("borrow_start");
				long now = System.currentTimeMillis();
				if (Long.compare(borrowStart, now) > 0) {
					String query = "UPDATE Orders SET " + attr + " = " + time + " WHERE order_id = " + order_id;
					stmt.execute(query);
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

	public boolean checkUserStatus(long user_id) {
		Blacklist blck = new Blacklist();
		if (blck.isBanned(user_id)) {
			return false;
		} else {
			return true;
		}
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

	public boolean checkAttendance() {
		// check minimum attendance

		// check maximum attendance
		return false;
	}

	public boolean checkRoom(int room_id, ArrayList<Long> users) {
		super.connect();
		try {
			Statement stmt = conn.createStatement();

			// check room status
			String query1 = "SELECT room_status FROM Room WHERE room_id = " + room_id + " AND room_status = 'T'";
			if (!stmt.execute(query1)) {
				return false;
			}

			for (long user_id : users) {
				// check user status
				if (!checkUserStatus(user_id)) {
					return false;
				}

				// 每人於二週內至多可申請三個時段
				java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
				String query2 = "SELECT COUNT(order_id) FROM Orders AS o INNER JOIN OrderUsers AS u ON o.order_id = u.order_id "
						+ "WHERE user_id = " + user_id + " AND is_lender = 'T' AND order_status != 'cancelled'"
						+ " AND DATEDIFF(" + date + ", order_date) <= 14 HAVING COUNT(order_id) = 3";
				if (stmt.execute(query2)) {
					return false;
				}
			}
			
			// 每一時段以四小時為上限???

			// check minimum and maximum attendance
			String query3 = "SELECT min_user, max_user FROM Room WHERE room_id = " + room_id;
			if (stmt.execute(query3)) {
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
}
