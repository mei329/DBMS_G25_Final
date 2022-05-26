import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		String query = "UPDATE " + attr + " = " + value + " FROM " + db + " WHERE " + db + "_id = " + id;
		return execute(query);
	}
	
	public boolean add(String db, String values) {
		String query = "INSERT INTO " + db + " VALUES(" + values + ")" ;
		return execute(query);
	}
	
	public boolean del(String db, int id) {
		String query = "DELETE FROM " + db + "WHERE " + db + "_id = " + id;
		return execute(query);
	}
}
