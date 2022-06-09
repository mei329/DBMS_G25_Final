package Entity;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Blacklist extends ConnectDb {

	public static void main(String[] args) {
		Blacklist blck = new Blacklist();

		if (blck.add(109306099l, 1651334400000l)) {
			System.out.println("Successfully add to blacklist");
		} else {
			System.out.println("Fail.");
		}
		
		if (blck.isBanned(109306099l)) {
			System.out.println("108306099 is banned");
		} else {
			System.out.println("108306099 not banned");
		}
		
		if (blck.renew()) {
			System.out.println("Successfully renew blacklist");
		} else {
			System.out.println("Fail.");
		}
	}

	public int countViolations() {
		String query = "SELECT COUNT(blcklst_id) FROM Blacklist WHERE blcklst_status = 'T'";
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			return result.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeConn();
		}
		return 0;
	}

	public String[][] getBlacklist() {
		renew();
		try {
			super.connect();
			String query = "SELECT blcklst_id, blcklst_status, banned_date, user_id FROM Blacklist WHERE blcklst_status = 'T'";
			
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			result = stmt.executeQuery(query);

			String[][] retVal = new String[countViolations()][4];
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd  HH:mm");
			int i = 0;
			int j = 0;
			while (result.next()) {
				retVal[i][j++] = String.valueOf(result.getInt(1));
				retVal[i][j++] = result.getString(2);
				retVal[i][j++] = String.valueOf(fmt.format(new Date(result.getLong(3))));
				retVal[i][j++] = String.valueOf(result.getInt(4));
				i++;
				j = 0;
			}
			return retVal;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeConn();
		}
		return null;
	}

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

	public boolean update(long blcklst_id, String attr, Object value) {
		String query = "UPDATE Blacklist SET " + attr + " = " + value + " WHERE blcklst_id = " + blcklst_id;
		return execute(query);
	}

	public boolean add(long user_id) {
		return add(user_id, System.currentTimeMillis());
	}

	public boolean add(long user_id, long banned_date) {
		String query = "INSERT INTO Blacklist (user_id, banned_date) VALUES(" + user_id + ", " + banned_date + ")";
		String query2 = "UPDATE User SET user_status = 'F' WHERE user_id = " + user_id;
		if (execute(query) && execute(query2)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean del(long blcklst_id) {
		String query = "DELETE FROM Blacklist WHERE blcklst_id = " + blcklst_id;
		return execute(query);
	}

	public boolean isBanned(long id) {
		super.connect();
		String query = "SELECT user_id FROM Blacklist WHERE blcklst_status = 'T' AND user_id = " + id;
		try {
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

	public boolean expire(long blacklist_id) {
		long user_id = 0;
		try {
			super.connect();
			String getID = "SELECT user_id FROM Blacklist WHERE blcklst_id = " + blacklist_id;
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(getID);
			if (result.next()) {
				user_id = result.getLong("user_id");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		// Update to Blacklist and User DB
		if (update(blacklist_id, "blcklst_status", "'F'")) {
			String query = "UPDATE User SET user_status = 'T' WHERE user_id = " + user_id;
			return execute(query);
		}
		return false;
	}

	public boolean renew() {
		int size = countViolations();
		long[] bid = new long[size];
		long[] date = new long[size];
		
		try {
			super.connect();
			String query = "SELECT blcklst_id, banned_date FROM Blacklist WHERE blcklst_status = 'T'";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			int i = 0;
			while (result.next()) {
				bid[i] = result.getLong("blcklst_id");
				date[i] = result.getLong("banned_date");
				i++;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		
		long now = System.currentTimeMillis();
		// 一個月的停止借用權到期
		for (int i = 0; i < size; i++) {
			if (now - date[i] >= 2629800000l) {
				if (expire(bid[i])) {
					System.out.println(bid[i] + " is expired.");
				} else {
					return false;
				}
			}
		}		
		return true;
	}
}
