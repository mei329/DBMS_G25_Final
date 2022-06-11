# DBMS G25 Final Project

## Demo Process

1. Dah-Hsian *Booking_page* [討論室預約] → *Booking_page_1* [達賢圖書館] → *Dah_Hsian_discussion_room_1* [4F] → *Dah_Hsian_discussion_room_4F* [6/8] [401] [10:00~13:00] [下一步] → *Dah_Hsian_discussion_room_4F_2* 其他使用者:"109405088" [新增] 其他使用者:"109405007" [新增] [預約] → *Dah_Hsian_account_activity_order* [回首頁] → *Booking_page_1* [返回] → *Booking_page*

2. Study Room *Booking_page* [自習室劃位] → *Study_location_1* [A區] → *Study_location_2* [A060] [座位確認] [送出預約] → *Study_location_2* [A001] [A002] [座位確認] 其他使用者1:"109306099" [送出預約] → *Study_location_2* [A001] [A002] [座位確認] 其他使用者1:"109405088" [送出預約] → *Study_location_3* [... 地點：... 時間：...] [取消] [回首頁] → *Booking_page* *Study_location_2* [借閱紀錄] → *Study_location_3* [預約] → *Study_location_2*

3. Blacklist Management *Login_page* [管理者登入] 帳號:"1" 密碼:"111" [登入] → *Manager_1* [黑名單管理] → *Manager_2* [加入黑名單] user_id:"109405007" → *Manager_2* [取消黑名單] list_id:"新增加的list_id" [回首頁] → *Manager_1* [登出] → *Login_page*

4. User Info
   
   | Name | StudentID | Password |     | Name | ManagerID | Password |
   |:----:|:---------:|:--------:| --- |:----:|:---------:|:--------:|
   | Mary | 109306099 | abcd     |     | mngr | 1         | 111      |
   | 志明   | 109405094 | haha     |     |      |           |          |
   | 春嬌   | 109405088 | hehe     |     |      |           |          |
   | 龐德   | 109405007 | 007      |     |      |           |          |

## Feature

1. 雲端訂位
   
   + 問題：自習室沒有線上預約系統 ⇒ 雲端訂位功能
   - 問題：操作流程過於繁雜 ⇒ 批量借閱功能、一鍵續借功能
   
   - 問題：畫面不易取得所需資訊 ⇒ 快速借閱功能
   
   - 問題：無法延長已預約之時段 ⇒ 更改時段功能
   
   - 問題：已登記之同學遲到或缺席導致預約被取消 ⇒ 轉讓座位功能
   
   - 問題：暫離無法趕回圖書館導致位置被取消 ⇒ 暫離保留功能

2. 管理介面
   
   - 黑名單管理：人工管理 & 自動管理 (每次登入自動更新，解禁借用權停用一個月者)
   
   - 座位管理：更新座位狀態以便應急與維護
   
   - 訂單管理：後臺更改訂單資訊

## System Design Logic

| Class             | Purpose                                             |
|:----------------- | --------------------------------------------------- |
| ConnectDb         | To connect to SQLite Database.                      |
| User              | To get informations of the user.                    |
| Order             | To manipulate data from Order.                      |
| Blacklist         | To manipulate data from Blacklist.                  |
| Login_page        | To login as a user or manager.                      |
| Home_page         | To choose a room or seat.                           |
| Room_page         | To choose a room.                                   |
| Seat_page         | To choose a seat zone.                              |
| RoomOrder_page    | To place a normal/fast order for a room.            |
| SeatOrder_page    | To place a normal/fast order for a seat.            |
| UserActivity_page | To modify ongoing orders or browse past activities. |
| Manager_page      | To choose a management type.                        |
| Management_page   | To manipulate data from Order/Blacklist/Seat/Room.  |

## Encountered Problems (Solved)

1. ErrorMsg：*[SQLITE_BUSY] The database file is locked (database is locked)*
   Solution：Make sure the connections to database are closed properly.
   
   ```java
   public class ConnectDb {
       protected Connection conn;
   
       public void connect() {
           String url = "jdbc:sqlite:C:/Users/your_user_name/Downloads/room_reservation_db.db";
           conn = null;
           try {
               if (conn == null) {
                   Class.forName("org.sqlite.JDBC");
                   conn = DriverManager.getConnection(url);
               }
           } catch (SQLException e) {
               System.out.println(e.getMessage());
           }
       }
   
       public void closeConn() {
           try {
               conn.close();
           } catch (SQLException e) {
               System.out.println(e.getMessage());
           }
       }
   }
   
   public class class_name extends ConnectDb {
      public boolean method_name(String query) {
          try {
              super.connect();
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
   }
   ```
