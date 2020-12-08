
import java.util.Map;
import java.util.*;
import java.sql.*;

public class MobileManagementSystem {
	
    public Map<Integer, Integer> viewMobileWithInTheRange(int minRange,int maxRange){
		Map<Integer, Integer> details = new LinkedHashMap<>();
		try {
		    Connection myConn = null;
		    Statement myStmt = null;
		    ResultSet myRs = null;
		    myConn = DB.getConnection();
		    myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select productId, price from mobile where price between " + minRange + " and " + maxRange + " order by price");
            while (myRs.next()) {
                int id = myRs.getInt("productId");
                int respectivePrice = myRs.getInt("price");
                details.put(id, respectivePrice);
            }
		} catch (Exception e) {};
		
		return details;
		
	}

}

