import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Blacklist extends ConnectDb{
	
	public static void main(String[] args) {
		Blacklist blck = new Blacklist();
		if (blck.add(108306000, System.currentTimeMillis())) {
			System.out.println("Successly add to blaclist");
		} else {
			System.out.println("Fail.");
		}
	}
	
	public boolean execute(String query) {
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean update(int id, String attr, Object value) {
		String query = "UPDATE " + attr + " = " + value + " FROM Blacklist WHERE blacklist_id = " + id;
		return execute(query);
	}

	public boolean add(int user_id, long banned_date) {
		String query = "INSERT INTO Blacklist (user_id, banned_date) VALUES(" + user_id + "," + banned_date + ")";
		return execute(query);
	}

	public boolean del(int id) {
		String query = "DELETE FROM Blacklist WHERE blacklist_id = " + id;
		return execute(query);
	}
	
	public boolean banned(long id) {
		String query = "SELECT user_id FROM Blacklist WHERE blcklst_status = 'T' AND user_id = " + id;
		try {
			Statement stmt = conn.createStatement();
			return stmt.execute(query);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean expire(int blacklist_id, int user_id) {
		if (update(blacklist_id, "blacklist_status", "open")) {
			String query = "UPDATE status = 'open' FROM User WHERE user_id = " + user_id;
			return execute(query);
		}
		return false;
	}

	public boolean renew() {
		String query = "SELECT blacklist_id, user_id, banned_date FROM Blacklist WHERE blacklist_status = 'T'";
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
			System.out.println(e.getMessage());
		}
		return false;
	}
}
