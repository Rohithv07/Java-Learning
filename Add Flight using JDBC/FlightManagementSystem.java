import java.sql.*;
public class FlightManagementSystem{
    public boolean addFlight(Flight flightObj){
        try{
            Connection conn = DB.getConnection();
            Statement stmt=conn.createStatement();
            String sql="insert into flight values("+flightObj.getFlightId() +",'"+flightObj.getSource()+"','"+flightObj.getDestination()+"',"+flightObj.getNoOfSeats()+","+flightObj.getFlightFare()+")";
            int result=stmt.executeUpdate(sql);
            return (result==1)?true:false;
        }catch (Exception e){
            return false;
        }
    }
}