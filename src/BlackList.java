import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BlackList {
	private Connection conn = null;
	
	public BlackList() {
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
	
	public boolean update(int id, String attr, Object value) { 
		String query = "UPDATE " + attr + " = " + value + " FROM Blacklist WHERE blacklist_id = '" + id + "'";
		return execute(query);
	}
	
	public boolean add(int user_id, int banned_date) {
		String query = "INSERT INTO Blacklist (user_id, banned_date) VALUES(" + user_id + "," + banned_date + ")" ;
		return execute(query);
	}
	
	public boolean del(int id) {
		String query = "DELETE FROM Blacklist WHERE blacklist_id = '" + id + "'";
		return execute(query);
	}
	
	public boolean expire(int blacklist_id, int user_id) {
		if (update(blacklist_id, "blacklist_status", "open")) {
			String query = "UPDATE status = 'open' FROM User WHERE user_id = '" + user_id + "'";
			return execute(query);
		}
		return false;
	}
	
	public boolean renew() {
		String query = "SELECT blacklist_id, user_id, banned_date FROM Blacklist WHERE blacklist_status = 'banned'";
		try {
			Statement stmt = conn.createStatement();
			boolean hasResultSet = stmt.execute(query);
			if (hasResultSet == true) {
				ResultSet result = stmt.getResultSet();
				while (result.next()) {
					long banDate = result.getInt("banned_date");
					long now = System.currentTimeMillis();
					// 停止其借用權一個月到期
					if (now - banDate >= 26298 * 100000) {
						return expire(result.getInt("blacklist_id"), result.getInt("user_id"));
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
