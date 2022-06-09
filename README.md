# DBMS G25 FinalProject

>### Demo Process
>1. Dah-Hsian <br>
>*Booking_page* [討論室預約] → *Booking_page_1* [達賢圖書館] → *Dah_Hsian_discussion_room_1* [4F] → *Dah_Hsian_discussion_room_4F* [6/8] [401] [10:00\~13:00] [下一步] → *Dah_Hsian_discussion_room_4F_2* 其他使用者:"109405088" [新增] 其他使用者:"109405007" [新增] [預約] → *Dah_Hsian_account_activity_order* [回首頁] → *Booking_page_1* [返回]  → *Booking_page*
>2. Study Room <br>
>*Booking_page* [自習室劃位] → *Study_location_1* [A區] → *Study_location_2* [A060] [座位確認] [送出預約] → *Study_location_2* [A001] [A002] [座位確認] 其他使用者1:"109306099" [送出預約] → *Study_location_2* [A001] [A002] [座位確認] 其他使用者1:"109405088" [送出預約] → *Study_location_3* [... 地點：... 時間：...] [取消] [回首頁] → *Booking_page* <br>
>*Study_location_2* [借閱紀錄] → *Study_location_3* [預約] → *Study_location_2*
>3. Blacklist Management <br>
>*Login_page* [管理者登入] 帳號:"1" 密碼:"111" [登入] → *Manager_1* [黑名單管理] → *Manager_2* [加入黑名單] user_id:"109405007" → *Manager_2* [取消黑名單] list_id:"新增加的list_id" [回首頁] →  *Manager_1* [登出] → *Login_page*
>4. User Infro <br>
>
>| Name | StudentID | Password| | Name | ManagerID | Password|
>|:----:|:---------:|:-------:|-|:----:|:---------:|:-------:|
>| Mary | 109306099 |   abcd  | | mngr |     1     |   111   |
>| 志明 | 109405094 |   haha  |
>| 春嬌 | 109405088 |   hehe  |
>| 龐德 | 109405007 |    007  |

>### Feature
>1. 黑名單管理 <br>
>管理者人工管理 + 系統自動管理 (每次登入都會自動更新黑名單，當借用權停用達一個月就解開權限) <br>
>人工管理示範：管理者介面；自動管理示範：執行 *Blacklist.java*
>2. 雲端訂位 <br>
>批量借閱 + 線上即時狀況查詢 + 暫離及續借功能 + 修改時段或是人員 + 取消訂單

>### Encountered Problems
>1. ErrorMsg：*[SQLITE_BUSY] The database file is locked (database is locked)* <br>
>Solution：Make sure the connections to database are closed properly.
>```java
> public class ConnectDb {
>   protected Connection conn;
>
>	  public void connect() {
>		  String url = "jdbc:sqlite:C:/Users/your_user_name/Downloads/room_reservation_db.db";
>		  conn = null;
>		  try {
>			  if (conn == null) {
>			  	Class.forName("org.sqlite.JDBC");
>			  	conn = DriverManager.getConnection(url);
>			  }
>		  } catch (SQLException e) {
>		  	System.out.println(e.getMessage());
>		  }
>	  }
>
>	  public void closeConn() {
>		  try {
>			  conn.close();
>		  } catch (SQLException e) {
>		  	System.out.println(e.getMessage());
>		  }
>	  }
> }
>```
>```java
> public class class_name extends ConnectDb {
>   public boolean method_name(String query) {
>		  try {
>		    super.connect();
>			  Statement stmt = conn.createStatement();
>			  if (stmt.executeUpdate(query) != 0) {
>				  return true;
>		  	}
>	  	} catch (SQLException e) {
>			  System.out.println(e.getMessage());
>	  	} finally {
>		  	super.closeConn();
>		  }
>		  return false;
>	  }
> }
>```
