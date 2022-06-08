
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {
	protected Connection conn;

	public ConnectDb() {
		// Copy file "room_reservation_db.db" to path "C:/Users/your_user_name/Downloads".
		// Change the URL string to your user name to get connection.
		String url = "jdbc:sqlite:/Users/chinicorn/Documents/大二/資料庫管理/finals/room_reservation_db.db";
		conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection(url);
			System.out.println("Connecting to SQLite.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}