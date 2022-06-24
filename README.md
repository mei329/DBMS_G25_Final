# DBMS G25 Final Project

## Demo Process

1. Order
   
   ＊beforehand：checkRoom / checkSeat（檢查使用者和座位狀態 + 檢查時間重疊與人數限制）
   
   1. 達賢4F討論室：06-29 的 401~404（按鈕的設定避免同個討論室借用時間重疊）
   
   2. 自習室A區：06-25 & 06-27 的 09:00~18:00（按鈕的設定避免同個討論室借用時間重疊）
   
   3. 借用紀錄：暫離 → 續借 → 修改時段 → 修改人員 → 取消

2. Management
   
   1. 黑名單管理：加入黑名單 → 取消黑名單 → 刪除黑名單
   
   2. 使用者管理：註冊使用者 → 更改狀態 → 刪除使用者
   
   3. 訂單管理：修改人員（選討論室的order_id → 轉讓 → 新增 → 刪除） → 取消訂單
   
   4. 座位管理：禁止借閱 "達賢圖書館 401" （個別修改）→ 開放借閱 "達賢圖書館"（批量修改）

3. User Info
   
   | Name  | StudentID | Password |     | Name | ManagerID | Password |
   |:-----:|:---------:|:--------:| --- |:----:|:---------:|:--------:|
   | Mary  | 109306099 | abcd     | (黑) | mngr | 1         | 111      |
   | 志明   | 109405094 | haha     |     |      |           |          |
   | 春嬌   | 109405088 | hehe     |     |      |           |          |
   | 龐德   | 109405007 | 007      |     |      |           |          |
   | 北七   | 109405087 | 087      |     |      |           |          |

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
   
   - 訂單管理：人工管理 & 自動管理 (每次登入自動更新過期訂單的狀態)
   
   - 使用者管理：註冊與註銷使用者 & 修改使用者狀態
   
   - 座位管理：更新座位狀態以便應急與維護

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
| Management_page   | To manipulate data from Order/Blacklist/Seat/User.  |

## Encountered Problems (Solved)

1. ErrorMsg：*[SQLITE_BUSY] The database file is locked (database is locked)* <br>
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

2. ErrMsg： *class javax.swing.JTable\$1 cannot be cast to class javax.swing.table.DefaultTableModel* <br>
   Solution：invoke `JTable(TableModel)` rather that the `JTable(Object[][], Object[])` constructor to resize the table
   
   ```java
   // create table
   JTable table = new JTable(new DefaultTableModel(new Object[]{ "column_name", "column_name" }, 0));
   table.setDefaultEditor(Object.class, null);  // set table not editable
   JScrollPane sp = new JScrollPane(table);
   frame.getContentPane().add(sp);
   
   // insert data to table
   DefaultTableModel model = (DefaultTableModel) table.getModel();
   model.addRow(new Object[] { "data", "data" });        
   ```
