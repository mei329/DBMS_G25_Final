package fpj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Location extends  ConnectDb{


    public boolean createLocation(String name, String type , int floor , String zone  ) {
        String sql =
                "INSERT INTO "
                        + "Location( locat_name , type , floor , zone) " +
                        "VALUES(?,?,?,?)";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, type);
            pstmt.setInt(3, floor);
            pstmt.setString(4, zone);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false ;
        }

        return true ;
    }

    public static void main(String[] args) {
        Location loc = new Location() ;
        loc.createLocation("達賢" , "討論室" , 4,"") ;
        loc.createLocation("達賢" , "討論室" , 5,"") ;
        loc.createLocation("達賢" , "討論室" , 6,"") ;
        loc.createLocation("中正" , "自習室" , -1,"A") ;
        loc.createLocation("中正" , "自習室" , -1,"B") ;
        loc.createLocation("中正" , "自習室" , -1,"A1") ;
        loc.createLocation("中正" , "自習室" , -1,"C") ;


    }
}