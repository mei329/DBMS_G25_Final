package Entity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;

public class Manager extends ConnectDb{
	
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
	
	public boolean update(String db, int id, String attr, Object value) { 
		String query = "UPDATE " + db + " SET " + attr + " = " + value + " WHERE " + db + "_id = " + id;
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
