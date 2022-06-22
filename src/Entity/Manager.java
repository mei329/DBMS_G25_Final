package Entity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Manager extends ConnectDb {

	public boolean execute(String query) {
		super.connect();
		try {
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

	public String updateOrder(String userID, String orderID, String roomID, String action) {
		int cUserNum;
		int min;
		String s = "";
		super.connect();

		try {
			Statement stat = super.conn.createStatement();
			String queryCount = "SELECT count(user_id)\r\n" + "from OrderUsers\r\n" + "where order_id = " + orderID
					+ ";";
			if (action =="seat") {
				String query = "UPDATE OrderUsers SET user_id = \"" + userID + "\" WHERE order_id = \"" + orderID + "\"";
				stat.execute(query);
				s = "success";
			}else if (action == "del") {
				String getMinUser = "Select min_user from Room where room_id = " + "\"" + roomID + "\";";
				stat.execute(queryCount);
				ResultSet result = stat.getResultSet();
				cUserNum = Integer.parseInt(result.getString("count(user_id)"));

				stat.execute(getMinUser);
				ResultSet result1 = stat.getResultSet();
				min = Integer.parseInt(result1.getString("min_user"));

				if ((cUserNum - 1) >= min) {
					String query = "DELETE From OrderUsers Where user_id = " + "\"" + userID + "\" and order_id = "
							+ "\"" + orderID + "\"";
					stat.execute(query);
					s = "success";
					System.out.print("successfully deleted");
				} else {
					s = "minUserError";
				}
			} else if (action == "add") {
				String getMaxUser = "Select max_user from Room where room_id = " + "\"" + roomID + "\"";
				stat.execute(queryCount);
				ResultSet result = stat.getResultSet();
				cUserNum = Integer.parseInt(result.getString("count(user_id)"));
				stat.execute(getMaxUser);
				ResultSet result1 = stat.getResultSet();
				int max = Integer.parseInt(result1.getString("max_user"));

				if ((cUserNum + 1) <= max) {
					String query = "Insert into OrderUsers values (\"" + orderID + "\" " + ",\"" + userID + "\" "
							+ ",null)";
					try {
						stat.execute(query);
					} catch (SQLException e) {
						e.printStackTrace();
						s = "pkey";
					}
					s = "success";
				} else {
					s = "maxUserError";
				}
			}
		}catch(SQLException e)
		{
		e.printStackTrace();
	}finally
	{
		super.closeConn();
	}return s;
	}

	public boolean seatUpdate(String location, String id, String newStatus) {
		String query = "UPDATE Seat SET " + "Seat_status = \"" + newStatus + "\" WHERE " + "locat_id = \"" + location
				+ "\" and " + "seat_id = \"" + id + "\"";
		return execute(query);
	}

	public boolean delOrder(String orderID) {
		String query = "DELETE FROM Orders WHERE order_id " + "= \"" + orderID + "\"";
		return execute(query);
	}

	public ArrayList getUserOrders(String id) {
		String query = "select o.order_id,order_date, seat_id, borrow_start,borrow_end \r\n"
				+ "from Orders  as o LEFT JOIN OrderUsers as ou  \r\n" + "ON o.order_id = ou.order_id\r\n"
				+ "where ou.user_id = \"" + id + "\";";
		ArrayList<String> list = new ArrayList<String>();
		super.connect();
		try {
			Statement stat = super.conn.createStatement();
			stat.execute(query);
			ResultSet result = stat.getResultSet();

			while (result.next()) {

				list.add(result.getString("order_id") + " " + result.getString("order_date") + " "
						+ result.getString("borrow_start") + "~" + result.getString("borrow_end") + " "
						+ result.getString("seat_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeConn();
		}

		return list;
	}

	public boolean isSeat(String roomID) {
		if (roomID.matches("^[ABC].*")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean getLender(String orderID, String userID) {
		String query = "Select is_lender From orderusers where order_id = " + orderID + " and user_id = " + userID;
		boolean i = false;
		try {
			super.connect();
			Statement stat = super.conn.createStatement();
			stat.execute(query);
			ResultSet result = stat.getResultSet();
			if (result.getString("is_lender") == null) {
				i = false;
			} else {
				i = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeConn();
		}
		return i;

	}

}
