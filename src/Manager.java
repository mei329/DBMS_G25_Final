import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Manager {
	private Connection conn = null;
	
	public Manager() {
		String url = "jdbc:sqlite:C:/Users/maggi/Programming/Java_workspace/DBMS_G25_Final/room_reservation_db.db";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("Connecting to SQLite.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean execute(String query) {
		try {
			Statement stmt = conn.createStatement();
			return stmt.execute(query);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public boolean update(String db, int id, String attr, Object value) { 
		String query = "UPDATE " + attr + " = " + value + " FROM " + db + " WHERE " + db + "_id = '" + id + "'";
		return execute(query);
	}
	
	public boolean add(String db, String values) {
		String query = "INSERT INTO " + db + " VALUES(" + values + ")" ;
		return execute(query);
	}
	
	public boolean del(String db, int id) {
		String query = "DELETE FROM " + db + "WHERE " + db + "_id = '" + id + "'";
		return execute(query);
	}
	
	public boolean modifyUser(int order_id, int num, int user_id) {
		String attr = "user" + num;
		String getSeat = "SELECT seat_id FROM Order WHERE order_id = '" + order_id + "'";
		
		try {
			Statement stmt = conn.createStatement();
			boolean hasResultSet = stmt.execute(getSeat);
			if (hasResultSet == true) {
				ResultSet result = stmt.getResultSet();
				int seat_id = result.getInt("seat_id");
				return update("Seat", seat_id, attr, user_id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public boolean modifyTime(int order_id, String attr, Date time) {
		String getStart = "SELECT borrow_start FROM Order WHERE order_id = " + order_id + "'";
		try {
			Statement stmt = conn.createStatement();
			boolean hasResultSet = stmt.execute(getStart);
			if (hasResultSet == true) {
				ResultSet result = stmt.getResultSet();
				long borrowStart = result.getInt("borrow_start");
				long now = System.currentTimeMillis();
				if (Long.compare(borrowStart, now) > 0) {
					return update("Order", order_id, attr, time);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return false;		
	}
}
