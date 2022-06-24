package Entity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;

public class User extends ConnectDb {
	
	public static void main(String[] args) {
		User user = new User();
		// 建立使用者: "Mary", 109306099, "abcd" ; "志明", 109405094, "haha" ; "春嬌", 109405088, "hehe" ; "龐德", 109405007, "007"
		boolean b = user.createUser("北七", 109405087, "087");
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
		String name1 = user.getName(id);
		if (name1 != null) {
			System.out.println(id + " 找到 ==> " + name1);
		} else {
			System.out.println(id + " 找無此人!!!");
		}
	}

	public String getName(long id) {
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
	
	public String[][] getUserList(){
		try {
			super.connect();
			String count = "SELECT COUNT(*) FROM User";
			String query = "SELECT user_id, user_name, user_status, violations FROM User";

			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(count);
			String[][] retVal = new String[result.getInt(1)][4];
			
			result = stmt.executeQuery(query);
			int i = 0;
			int j = 0;
			while (result.next()) {
				retVal[i][j++] = result.getString("user_id");
				retVal[i][j++] = result.getString("user_name");
				retVal[i][j++] = result.getString("user_status");
				retVal[i][j++] = result.getString("violations");
				i++;
				j = 0;
			}
			return retVal;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeConn();
		}
		return null;
	}
	
	public String[] getUserInfo(long uid) {
		String[][] list = getUserList();
		for (int i = 0; i < list.length; i++) {
			if (list[i][0].equals(String.valueOf(uid))) {
				return list[i];
			}
		}
		return null;
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
	
	public boolean deleteUser(long id) {
		String sql = "DELETE FROM User WHERE user_id = " + id;
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			if (stmt.executeUpdate(sql) != 0) {
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
	
	public boolean updateUserStatus(long user_id, String status) {
		try {
			super.connect();
			Statement stmt = conn.createStatement();
			// update user status
			String updateUser = "UPDATE User SET user_status = '" + status + "' WHERE user_id = " + user_id;
			if (stmt.executeUpdate(updateUser) != 0) {
				return true;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			super.closeConn();
		}
		return false;
	}
	
	public boolean updateUserStatus(long user_id) {
		String userStatus = null;
		try {
			super.connect();
			String query = "SELECT user_status FROM User WHERE user_id = " + user_id;

			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			userStatus = result.getString("user_status");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeConn();
		}
		
		if (userStatus.equals("T")) {
			return updateUserStatus(user_id, "F");
		} else if (userStatus.equals("F")){
			return updateUserStatus(user_id, "T");
		} else {
			return false;
		}
	}

	public static String base64Encode(String input) {
		return Base64.getEncoder().encodeToString(input.getBytes());
	}
}