package Entity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order extends ConnectDb {
	private Blacklist blck = new Blacklist();
	private String today = java.time.LocalDate.now().toString();

	public static void main(String[] args) {
		Order o = new Order();

		ArrayList<Long> users = new ArrayList<Long>();
		users.add(109405007l);

		long oid = o.createOrder("A001", "2022-06-23", 16, 18, users);
		System.out.println("createOrder: " + oid + "\n");

		System.out.println("checkSeat: " + o.checkSeat("A001", 109405007l, "2022-06-08", 10, 13) + "\n");

		System.out.println("modifyUser: " + o.modifyUser(oid, 109405007l, 109405088l) + "\n");
		System.out.println("modifyUser: add a blacklist user: " + o.modifyUser(oid, 109405088l, 109306099l) + "\n");

		System.out.println("modifyTime: " + o.modifyTime(oid, "borrow_end", 19) + "\n");

		System.out.println("extendBorrow: " + o.extendBorrow(oid, 1) + "\n");
		System.out.println("extendBorrow: " + o.extendBorrow(1655942669372l, 5) + "\n");

		System.out.println("delOrder (" + oid + "): " + o.delOrder(oid) + "\n");

		users.add(109405088l);
		System.out.println("checkRoom: " + o.checkRoom("401", users, "2022-06-08", 10, 13) + "\n");
		users.add(109405094l);
		System.out.println("checkRoom: " + o.checkRoom("401", users, "2022-06-08", 10, 13) + "\n");
		users.add(109306099l); // add a blacklist user
		System.out.println("checkRoom: " + o.checkRoom("401", users, "2022-06-08", 10, 13) + "\n");
	}

	public Order() {
		renew();
	}

	public long createOrder(String seat_id, String orderDate, double borrow_start, double borrow_end,
			ArrayList<Long> users) {
		// remember to call checkSeat or checkRoom method before placing order!!!

		long timestamp = new Date().getTime();

		String sql = "INSERT INTO "
				+ "Orders(order_id , seat_id , order_status , order_date , borrow_start , borrow_end) "
				+ "VALUES(?,?,?,?,?,?)";
		String sql2 = "INSERT INTO " + "OrderUsers(order_id , user_id, is_lender) " + "VALUES(?,?,?)";

		try {
			super.connect();
			// Update to Room
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, timestamp);
			pstmt.setString(2, seat_id);
			pstmt.setString(3, "T");
			pstmt.setString(4, orderDate);
			pstmt.setDouble(5, borrow_start);
			pstmt.setDouble(6, borrow_end);

			// Update to OrderUsers
			if (pstmt.executeUpdate() != 0) {
				for (Long uid : users) {
					pstmt = conn.prepareStatement(sql2);
					pstmt.setLong(1, timestamp);
					pstmt.setLong(2, uid);
					// The 1st user_id in users is the lender.
					if (users.size() > 1 && uid == users.get(0)) {
						pstmt.setString(3, "T");
					} else if (users.size() == 1) {
						pstmt.setString(3, "T");
					} else {
						pstmt.setString(3, "F");
					}

					if (pstmt.executeUpdate() == 0) {
						delOrder(timestamp);
						return -1l;
					}
				}
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
			String query = "INSERT INTO OrderUsers(order_id, user_id, is_lender) VALUES(" + order_id + ", " + user_id
					+ ", 'F')";
			Statement stmt = conn.createStatement();
			if (checkUserStatus(user_id)) {
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

	public boolean modifyUser(long order_id, long before_user, long after_user) {
		// set before_user to after_user from OrderUsers
		try {
			boolean status = checkUserStatus(after_user);
			if (status) {
				super.connect();
				String query = "UPDATE OrderUsers SET user_id = " + after_user + " WHERE user_id = " + before_user
						+ " AND order_id = " + order_id;
				Statement stmt = conn.createStatement();
				if (stmt.executeUpdate(query) != 0) {
					return true;
				}
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean modifyTime(long order_id, String attr, double time) {
		// attr == "borrow_start" or "borrow_end"

		// check time coverage
		boolean checked = false;
		try {
			super.connect();
			String checkQuery = "SELECT seat_id, order_date, borrow_start, borrow_end FROM Orders WHERE order_id = "
					+ order_id;
			Statement stmt = conn.createStatement();

			ResultSet result = stmt.executeQuery(checkQuery);
			if (result.next()) {
				String sid = result.getString("seat_id");
				String date = result.getString("order_date");
				double start, end;
				if (attr.equals("borrow_start")) {
					start = time;
					end = result.getDouble("borrow_end");
				} else if (attr.equals("borrow_end")) {
					start = result.getDouble("borrow_start");
					end = time;
				} else {
					return false;
				}
				super.closeConn();

				if (checkTime(sid, date, start, end, String.valueOf(order_id)) == true) {
					checked = true;
				}
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}

		// modify time
		renew();
		try {
			String status = select("order_status", "Orders", "order_id", Long.toString(order_id))[0];

			if (status.equals("T") && checked) {
				super.connect();
				String query = "UPDATE Orders SET " + attr + " = " + time + " WHERE order_id = " + order_id;
				Statement stmt = conn.createStatement();
				if (stmt.executeUpdate(query) != 0) {
					return true;
				}
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean extendBorrow(long order_id, int nHrs) {
		// continue borrowing for nHrs
		String getEnd = select("borrow_end", "Orders", "order_id", String.valueOf(order_id))[0];
		if (getEnd != null) {
			double end = Double.parseDouble(getEnd) + nHrs;
			return modifyTime(order_id, "borrow_end", end);
		}
		return false;
	}

	public boolean delOrder(long order_id) {
		// Delete from Orders and OrderUsers
		try {
			super.connect();
			String query = "DELETE from Orders where order_id = " + order_id;
			Statement stmt = conn.createStatement();

			if (stmt.executeUpdate(query) != 0 && delUser(order_id) == true) {
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

			if (stmt.executeUpdate(query) != 0) {
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
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public ArrayList<Long> getUserOrder(long uid) {
		// get the orderId list of the given user
		ArrayList<Long> oid = new ArrayList<Long>();
		String query = "SELECT order_id FROM OrderUsers AS o INNER JOIN User AS u ON o.user_id = u.user_id WHERE u.user_id = "
				+ uid;
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			ResultSet result = stmt.getResultSet();
			while (result.next()) {
				oid.add(result.getLong("order_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeConn();
		}
		return oid;
	}

	public String[] getOrderInfo(long oid) {
		// get the orderInfo list of the given order
		renew();
		String query = "SELECT seat_id, order_date, borrow_start, borrow_end, order_status FROM Orders WHERE order_id = "
				+ oid;
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			ResultSet result = stmt.getResultSet();

			String[] retVal = new String[6];
			if (result.next()) {
				retVal[0] = String.valueOf(oid);
				retVal[1] = String.format("%4s", result.getString("seat_id"));
				retVal[2] = result.getString("order_status");
				retVal[3] = result.getString("order_date");
				retVal[4] = formatTime(result.getDouble("borrow_start"));
				retVal[5] = formatTime(result.getDouble("borrow_end"));
			}
			return retVal;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeConn();
		}
		return null;
	}

	public String getOrderString(long oid) {
		String[] info = getOrderInfo(oid);
		if (info != null) {
			return oid + "  地點：" + info[1] + "  時間：" + info[3] + " " + info[4] + "~" + info[5];
		} else {
			return null;
		}
	}

	public ArrayList<double[]> getOrderTime(String seat_id, String order_date) {
		// get the borrow time of a given seat on the given date
		renew();
		ArrayList<double[]> time = new ArrayList<double[]>();
		
		String query = "SELECT borrow_start, borrow_end, order_id FROM Orders WHERE order_status = 'T' AND order_date = '"
				+ order_date + "' AND seat_id = '" + seat_id + "'";
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);


			while (result.next()) {
				double[] t = new double[3];
				t[0] = result.getDouble("borrow_start");
				t[1] = result.getDouble("borrow_end");
				t[2] = result.getLong("order_id");
				time.add(t);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return time;
	}

	public ArrayList<double[]> getOrderTime(long user_id, String order_date) {
		// get the borrow time of a given user on the given date
		renew();
		ArrayList<double[]> time = new ArrayList<double[]>();
		
		ArrayList<Long> oid = getUserOrder(user_id);
		String query = "SELECT borrow_start, borrow_end, order_id FROM Orders WHERE order_status = 'T' AND order_date = '"
				+ order_date + "' AND order_id = ";
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			ResultSet result;

			for (long order_id : oid) {
				result = stmt.executeQuery(query + order_id);
				if (result.next()) {
					double[] t = new double[3];
					t[0] = result.getDouble("borrow_start");
					t[1] = result.getDouble("borrow_end");
					t[2] = result.getLong("order_id");
					time.add(t);
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return time;
	}

	public ArrayList<String> getBannedSeats(String zone, String order_date, double start, double end) {
		// get the closed seats list of a given zone on the given date
		renew();
		ArrayList<String> seats = new ArrayList<String>();
		try {
			super.connect();
			String query = "SELECT DISTINCT(seat_id) FROM Orders WHERE order_status = 'T' AND order_date = '"
					+ order_date + "'";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);

			while (result.next()) {
				String sid = result.getString("seat_id");
				if (sid.matches("^" + zone + ".*")) {
					if (!checkTime(sid, order_date, start, end, null)) {
						seats.add(sid);
					}
				}
			}

			if (order_date.equals(today)) {
				String query2 = "SELECT seat_id FROM Seat WHERE seat_status = 'F'";
				result = stmt.executeQuery(query2);
				while (result.next()) {
					String sid = result.getString("seat_id");
					if (!seats.contains(sid) && sid.matches("^" + zone + ".*")) {
						seats.add(sid);
					}
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return seats;
	}

	public ArrayList<String> getOpenRoom(String order_date, double borrow_start, double borrow_end,
			ArrayList<Long> users) {
		// get the open room list on the given date
		ArrayList<String> rooms = new ArrayList<String>();
		try {
			super.connect();
			String getRoom = "SELECT room_id FROM Room";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(getRoom);

			while (result.next()) {
				String rid = result.getString("room_id");
				String msg = checkRoom(rid, users, order_date, borrow_start, borrow_end);
				if (msg.equals("true")) {
					rooms.add(rid);
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return rooms;
	}

	public boolean updateOrderStatus(long order_id, String status) {
		try {
			super.connect();
			String query = "UPDATE Orders SET order_status = '" + status + "' WHERE order_id = " + order_id;
			Statement stmt = conn.createStatement();
			if (stmt.executeUpdate(query) != 0) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}

	public boolean updatePlaceStatus(String place_id, String status) {
		// update the status of given seat or room
		try {
			super.connect();
			Statement stmt = conn.createStatement();
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

	public boolean updatePlaceStatus(int locat_id, String status) {
		// update all seats' status of the given location

		// get seatId list of the given location
		ArrayList<String> seats = new ArrayList<String>();
		try {
			String getId;
			if (locat_id <= 3) {
				getId = "SELECT room_id FROM Room WHERE locat_id = " + locat_id;
			} else {
				getId = "SELECT seat_id FROM Seat WHERE locat_id = " + locat_id;
			}

			super.connect();
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(getId);
			while (result.next()) {
				seats.add(result.getString(1));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			super.closeConn();
		}

		// update seat status
		for (String sid : seats) {
			if (!updatePlaceStatus(sid, status)) {
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
			if (stmt.executeQuery(query).next() && !blck.isBanned(user_id)) {
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
		String query = "SELECT seat_status FROM Seat WHERE seat_id = '" + seat_id + "' AND seat_status = 'T'";
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

	public boolean checkAttendance(String room_id, int userSize) {
		// check minimum and maximum attendance
		String query = "SELECT min_user, max_user FROM Room WHERE room_id = " + room_id;
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			if (stmt.execute(query)) {
				ResultSet result = stmt.getResultSet();
				int min = result.getInt("min_user");
				int max = result.getInt("max_user");
				if (min <= userSize && userSize <= max) {
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

	public boolean checkTime(String target_id, String order_date, double borrow_start, double borrow_end,
			String ignore_oid) {
		// check time coverage for user or seat

		ArrayList<double[]> time;
		if (target_id.length() == 9) {
			// target_id = user_id
			time = getOrderTime(Long.parseLong(target_id), order_date);
		} else {
			// target_id = seat_id
			time = getOrderTime(target_id, order_date);
		}

		for (double[] t : time) {
			if (ignore_oid == null || t[2] != Long.parseLong(ignore_oid)) {
				if (borrow_start <= t[0] && borrow_end <= t[0]) {
				} else if (borrow_start >= t[1] && borrow_end >= t[1]) {
				} else {
					// return false if the time interval overlaps other orders
					System.out.println("overlapping: (" + (long) t[2] + ") " + t[0] + " ~ " + t[1]);
					return false;
				}
			}
		}
		return true;
	}

	public String checkCurrentTime(String order_date, double borrow_start) {
		// check if the given time has passed
		long timestamp = new Date().getTime();
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm").parse(order_date + " " + formatTime(borrow_start));
			if (date.getTime() - timestamp < 0) {
				return "Can't place order from the past.";
			}
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		return "true";
	}

	public String checkSeat(String seat_id, long user_id, String order_date, double borrow_start, double borrow_end) {
		// check before booking a seat

		String errMsg1 = "Not available: ";
		// check seat status
		if (!checkSeatStatus(seat_id)
				|| !checkTime(String.valueOf(seat_id), order_date, borrow_start, borrow_end, null)) {
			errMsg1 += seat_id + ", ";
		}

		// check user status
		if (!checkUserStatus(user_id)
				|| !checkTime(String.valueOf(user_id), order_date, borrow_start, borrow_end, null)) {
			errMsg1 += user_id + ", ";
		}

		// check time coverage
		String errMsg2 = checkCurrentTime(order_date, borrow_start);

		// return error message
		if (!errMsg1.equals("Not available: ")) {
			errMsg1 = errMsg1.substring(0, errMsg1.length() - 2);
			if (errMsg2.equals("true")) {
				return errMsg1;
			} else {
				return errMsg2 + "\n" + errMsg1;
			}
		} else {
			return errMsg2;
		}
	}

	public String checkRoom(String room_id, ArrayList<Long> users, String order_date, double borrow_start,
			double borrow_end) {
		// check before booking a room

		String errMsg1 = "Not available: ";
		// check room status
		if (!checkRoomStatus(room_id) || !checkTime(room_id, order_date, borrow_start, borrow_end, null)) {
			errMsg1 += room_id + ", ";
		}
		// check user status
		for (Long user_id : users) {
			if (!checkUserStatus(user_id)
					|| !checkTime(String.valueOf(user_id), order_date, borrow_start, borrow_end, null)) {
				errMsg1 += user_id + ", ";
			}
		}

		// check minimum and maximum attendance
		String errMsg2 = "true";
		if (!checkAttendance(room_id, users.size())) {
			errMsg2 = "Fail to meet the attendance constraint.";
		}

		// check time coverage
		String errMsg3 = checkCurrentTime(order_date, borrow_start);
		if (errMsg2.equals("true")) {
			errMsg2 = errMsg3;
		} else {
			if (!errMsg3.equals("true")) {
				errMsg2 = "" + errMsg3 + "\n" + errMsg2;
			}
		}

		// return error message
		if (!errMsg1.equals("Not available: ")) {
			errMsg1 = errMsg1.substring(0, errMsg1.length() - 2);
			if (errMsg2.equals("true")) {
				return errMsg1;
			} else {
				return errMsg2 + "\n" + errMsg1;
			}
		} else {
			return errMsg2;
		}
	}

	public String getLender(String orderID) {
		// check if the given user is the lender of the given order
		String query = "SELECT user_id FROM OrderUsers WHERE order_id = " + orderID + " and is_lender = 'T'";
		try {
			super.connect();
			Statement stat = super.conn.createStatement();
			ResultSet result = stat.executeQuery(query);
			if (result.next()) {
				return result.getString("user_id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeConn();
		}
		return null;
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

	public String formatTime(double time) {
		if (time < 0 || time > 24) {
			return "24:00";
		} else {
			return String.format("%05.2f", time).replace('.', ':');
		}
	}

	public boolean renew() {
		// renew order status

		// get initial data
		String[] dates = select("order_date", "Orders", "order_status", "T");
		long[] oids = new long[dates.length];
		double[] starts = new double[dates.length];
		try {
			super.connect();
			String query = "SELECT order_id, borrow_start FROM Orders WHERE order_status = 'T'";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			int i = 0;
			while (result.next()) {
				oids[i] = result.getLong("order_id");
				starts[i] = result.getDouble("borrow_start");
				i++;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			super.closeConn();
		}

		// update order status to "F" if it's expired
		try {
			for (int i = 0; i < dates.length; i++) {
				Date odate = new SimpleDateFormat("yyyy-MM-dd").parse(dates[i]);
				double bstart = starts[i] + Math.ceil(starts[i] % 1) * 0.2;

				if (odate.getTime() + bstart * 1000 * 60 * 60 - System.currentTimeMillis() < 0) {
					if (!updateOrderStatus(oids[i], "F")) {
						return false;
					}
				}
			}
		} catch (ParseException pe) {
			pe.printStackTrace();
			return false;
		}
		return true;
	}
}
