package Entity;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

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

	public Blacklist() {
		renew();
	}

	public String[][] getBlckList() {
		// get the list of all Blacklist's data
		renew();
		try {
			super.connect();
			String count = "SELECT COUNT(*) FROM Blacklist";
			String query = "SELECT blcklst_id, blcklst_status, banned_date, user_id FROM Blacklist";

			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(count);
			String[][] retVal = new String[result.getInt(1)][4];

			result = stmt.executeQuery(query);
			int i = 0;
			int j = 0;
			while (result.next()) {
				retVal[i][j++] = result.getString(1);
				retVal[i][j++] = result.getString(2);
				retVal[i][j++] = String
						.valueOf(new SimpleDateFormat("yyyy-MM-dd  HH:mm").format(new Date(result.getLong(3))));
				retVal[i][j++] = result.getString(4);
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
	
	public String[] getBlckInfo(int row) {
		int bid = getListID(row);
		
		String[][] list = getBlckList();
		for (int i = 0; i < list.length; i++) {
			if (list[i][0].equals(String.valueOf(bid))) {
				return list[i];
			}
		}
		return null;
	}
	
	public int getListID(int row) {
		String[][] list = getBlckList();
		if (list != null) {
			return Integer.parseInt(list[row][0]);
		} else {
			return 0;
		}
	}
	
	public int count() {
		// get the total size of the list
		String query = "SELECT COUNT(blcklst_id) FROM Blacklist";
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

	public int countViolations() {
		// get the counts of blacklist that is currently banned
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

	public boolean execute(String query) {
		// return the execute update result
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
		User user = new User();
		if (user.getName(user_id) != null) {
			String query = "INSERT INTO Blacklist (user_id, banned_date) VALUES(" + user_id + ", " + banned_date + ")";
			if (execute(query)) {
				return true;
			}
		}
		return false;
	}

	public boolean del(long blcklst_id) {
		String query = "DELETE FROM Blacklist WHERE blcklst_id = " + blcklst_id;
		return execute(query);
	}

	public boolean isBanned(long user_id) {
		// return true if it is on the blacklist
		String query = "SELECT user_id FROM Blacklist WHERE blcklst_status = 'T' AND user_id = " + user_id;
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

	public boolean renew() {
		// update the blacklist status if it's expired
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
				if (update(bid[i], "blcklst_status", "'F'")) {
					System.out.println(bid[i] + " is expired.");
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
