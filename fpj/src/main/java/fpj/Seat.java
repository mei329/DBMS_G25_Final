package fpj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Seat extends ConnectDb{

    public boolean createSeat( String seatId , int locId  , String status) {
        String sql =
                "INSERT INTO "
                        + "Seat( seat_id , locat_id ,  seat_status) " +
                        "VALUES(?,?,? )";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, seatId);
            pstmt.setInt(2, locId);
            pstmt.setString(3,status);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false ;
        }

        return true ;
    }

    public static void main(String[] args) {
        Seat seat = new Seat();
        seat.createSeat("A001",4 , "T") ;
        seat.createSeat("A002",4 , "T") ;
        seat.createSeat("A003",4 , "T") ;
        seat.createSeat("A004",4 , "T") ;
        seat.createSeat("A005",4 , "T") ;
        seat.createSeat("A006",4 , "T") ;
        seat.createSeat("AH01",4 , "T") ;
        seat.createSeat("B001",5 , "T") ;
        seat.createSeat("B002",5 , "T") ;
        seat.createSeat("BH01",5 , "T") ;
    }
}
