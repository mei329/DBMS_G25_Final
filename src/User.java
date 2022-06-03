import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

public class User extends ConnectDb {
	Blacklist blcklst;
	
	public String getUser(long id) {
		String sql = "SELECT user_name from User " + "where user_id = ?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);

			// Query
			ResultSet rs = pstmt.executeQuery();
			String name = null;
			while (rs.next()) {
				name = rs.getString("user_name");
				break;
			}

			return name;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public boolean checkUser(long id, String pwd) {
		String sql = "SELECT user_id , user_psswrd from User " + "where user_id = ? and user_psswrd= ?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			pwd = base64Encode(pwd);
			pstmt.setString(2, pwd);

			// Query
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
		}
	}

	public boolean createUser(String name, long id, String pwd) {
		String sql = "INSERT INTO " + "User(user_id, user_name , user_psswrd , user_status , violations) "
				+ "VALUES(?,?,?,?,?)";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			pstmt.setString(2, name);
			pwd = base64Encode(pwd);
			pstmt.setString(3, pwd);
			pstmt.setString(4, "NEW");
			pstmt.setInt(5, 0);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}

		return true;
	}

	public static String base64Encode(String input) {
		return Base64.getEncoder().encodeToString(input.getBytes());
	}

	public static void main(String[] args) {

		User user = new User();

		// 建立使用者
		boolean b = user.createUser("Mary", 109306099, "abcd");
		if (b) {
			System.out.println("新增使用者 :成功 ");
		} else {
			System.out.println("新增使用者 :失敗 ");
		}

		// 測試登入
		b = user.checkUser(109306099, "abcd1");
		if (b) {
			System.out.println("使用者登入(錯誤密碼) :成功 ");
		} else {
			System.out.println("使用者登入(錯誤密碼) :失敗 ");
		}
		b = user.checkUser(109306099, "abcd");
		if (b) {
			System.out.println("使用者登入(正確密碼) :成功 ");
		} else {
			System.out.println("使用者登入(正確密碼) :失敗 ");
		}

		// 測試取得使用者名稱
		long id = 109306099;// Mary
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
