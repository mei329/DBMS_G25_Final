package Entity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;

public class User extends ConnectDb {
	Blacklist blcklst = new Blacklist();

	public User() {
		blcklst.renew();
	}

	public String getUser(long id) {
		String name = null;
		String sql = "SELECT user_name from User " + "where user_id = ?";
		try {
			super.connect();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);

			// Query
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				name = rs.getString("user_name");
				break;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return name;
	}

	public ArrayList<Long> getOrders(long id) {
		ArrayList<Long> oid = new ArrayList<Long>();
		String query = "SELECT order_id FROM OrderUsers AS o INNER JOIN User AS u ON o.user_id = u.user_id WHERE u.user_id = "
				+ id;
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

	public String getOrderInfo(long oid) {
		String retVal = "";
		String query = "SELECT seat_id, order_date, borrow_start, borrow_end FROM Orders WHERE order_id = "
				+ oid;
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			ResultSet result = stmt.getResultSet();
			if (result.next()) {
				retVal = oid + "   ";
				if (result.getString("seat_id") != null) {
					retVal += "地點：" + result.getString("seat_id");
				}
				retVal += "   時間：" + result.getString("order_date") + " " + result.getInt("borrow_start") + "~"
						+ result.getInt("borrow_end");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeConn();
		}
		return retVal;
	}
	
	public boolean managerLogin(long id, String pwd) {
		String sql = "SELECT mngr_id , mngr_psswrd FROM Manager WHERE mngr_id = ? AND mngr_psswrd = ?";
		try {
			super.connect();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			pstmt.setString(2, pwd);
			
			ResultSet rs = pstmt.executeQuery();
			int count = 0;
			while (rs.next()) {
				count++;
			}

			if (count == 1) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			super.closeConn();
		}
	}

	public boolean userLogin(long id, String pwd) {
		String sql = "SELECT user_id , user_psswrd FROM User " + "WHERE user_id = ? AND user_psswrd = ?";
		try {
			super.connect();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			pwd = base64Encode(pwd);
			pstmt.setString(2, pwd);

			ResultSet rs = pstmt.executeQuery();
			int count = 0;
			while (rs.next()) {
				count++;
			}

			if (count == 1) {
				// Renew Blacklist database to remove expired penalty
				blcklst.renew();
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			super.closeConn();
		}
	}

	public boolean createUser(String name, long id, String pwd) {
		String sql = "INSERT INTO " + "User(user_id, user_name , user_psswrd , user_status , violations) "
				+ "VALUES(?,?,?,?,?)";

		try {
			super.connect();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			pstmt.setString(2, name);
			pwd = base64Encode(pwd);
			pstmt.setString(3, pwd);
			pstmt.setString(4, "T");
			pstmt.setInt(5, 0);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			super.closeConn();
		}

		return true;
	}

	public static String base64Encode(String input) {
		return Base64.getEncoder().encodeToString(input.getBytes());
	}

	public static void main(String[] args) {

		User user = new User();

		// 建立使用者
		// "Mary", 109306099, "abcd"
		// "志明", 109405094, "haha"
		// "春嬌", 109405088, "hehe"
		// "龐德", 109405007, "007"

		boolean b = user.createUser("Mary", 109306099, "abcd");
		if (b) {
			System.out.println("新增使用者 :成功 ");
		} else {
			System.out.println("新增使用者 :失敗 ");
		}

		// 測試登入
		b = user.userLogin(109306099, "abcd1");
		if (b) {
			System.out.println("使用者登入(錯誤密碼) :成功 ");
		} else {
			System.out.println("使用者登入(錯誤密碼) :失敗 ");
		}
		b = user.userLogin(109306099, "abcd");
		if (b) {
			System.out.println("使用者登入(正確密碼) :成功 ");
		} else {
			System.out.println("使用者登入(正確密碼) :失敗 ");
		}

		// 測試取得使用者名稱
		long id = 109405094;// 志明
		String name1 = user.getUser(id);
		if (name1 != null) {
			System.out.println(id + " 找到 ==> " + name1);
		} else {
			System.out.println(id + " 找無此人!!!");
		}
		id = 9999;
		name1 = user.getUser(id);
		if (name1 != null) {
			System.out.println(id + " 找到 ==> " + name1);
		} else {
			System.out.println(id + " 找無此人!!!");
		}

	}
}