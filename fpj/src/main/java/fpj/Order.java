package fpj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


public class Order extends ConnectDb {

    // A. 討論室

    // B. 自習室
    public boolean createSeatOrder( String seatId, String oStatus , String orderDate
            , int borrow_start , int borrow_end , ArrayList<Long> users){

        long time=createSeatOrder(seatId,oStatus,orderDate,borrow_start,borrow_end) ;
        if( time!=-1 ){
            // 新增訂單使用者
            boolean b = createOrderUsers( time ,users );
            if(b==true){
                return true ;
            }else{
                // 刪除訂單
                return false ;
            }
        }
        return false ;
    }

    private boolean createOrderUsers(long order_id, ArrayList<Long> users) {
        Connection conn = this.connect();
        for (Long uid:  users) {
            String sql =
                    "INSERT INTO "
                            + "OrderUsers( order_id , user_id) " +
                            "VALUES(?,?)";
            try{
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setLong(1, order_id);
                pstmt.setLong(2, uid);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return false ;
            }
        }
        return true ;
    }

    public long createSeatOrder( String seatId, String oStatus , String orderDate , int borrow_start , int borrow_end ) {

        long timestamp = new Date().getTime() ;
        String sql =
                "INSERT INTO "
                        + "Orders(order_id , seat_id , order_status , order_date , borrow_start , borrow_end ) " +
                        "VALUES(?,?,?,?,?,?)";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, timestamp);
            pstmt.setString(2, seatId);
            pstmt.setString(3, oStatus);
            pstmt.setString(4, orderDate);
            pstmt.setInt(5, borrow_start);
            pstmt.setInt(6, borrow_end);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return -1l ;
        }

        return timestamp ;
    }

    public static void main(String[] args) {
        Order o  = new Order() ;
        ArrayList<Long> users = new ArrayList<Long>() ;
        users.add(109306028l) ;
        users.add(109306029l) ;
//        users.add(109306030l) ;
        o.createSeatOrder("A002" , "T" , "2022-05-25" , 10,12 ,users ) ;
    }

}