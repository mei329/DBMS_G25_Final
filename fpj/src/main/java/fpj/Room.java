package fpj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Room extends ConnectDb{

    public boolean createRoom(int roomId , int locId , int minUsr , int maxUsr , String status) {
        String sql =
                "INSERT INTO "
                        + "Room( room_id , locat_id , min_user , max_user , room_status) " +
                        "VALUES(?,?,?,? , ? )";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, roomId);
            pstmt.setInt(2, locId);
            pstmt.setInt(3, minUsr);
            pstmt.setInt(4, maxUsr);
            pstmt.setString(5,status);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false ;
        }

        return true ;
    }

    public static void main(String[] args) {
        Room room = new Room() ;
        room.createRoom( 501 , 2 , 1,4,"T") ;
        room.createRoom( 502 , 2 , 3,6,"T") ;
        room.createRoom( 503 , 2 , 3,6,"T") ;
        room.createRoom( 504 , 2 , 3,6,"T") ;
        room.createRoom( 505 , 2 , 3,6,"T") ;
    }
}