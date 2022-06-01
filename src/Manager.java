import java.sql.SQLException;
import java.sql.Statement;

public class Manager extends ConnectDb{
	
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
