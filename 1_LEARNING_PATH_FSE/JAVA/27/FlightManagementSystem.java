import java.sql.*;
public class FlightManagementSystem {
    public boolean addFlight(Flight flightObj) {
        try {
            Connection myConn = null;
            Statement myStmt = null;
            // create connection
            myConn = DB.getConnection();
            // create statement
            myStmt = myConn.createStatement();
            // add the values
            int rowsEffected = myStmt.executeUpdate("insert into flight values("+flightObj.getFlightId() +",'"+flightObj.getSource()+"','"+flightObj.getDestination()+"',"+flightObj.getNoOfSeats()+","+flightObj.getFlightFare()+")");
            return (rowsEffected == 1) ? true : false;
        } catch (Exception e) {
            return false;
        }
    }
}
