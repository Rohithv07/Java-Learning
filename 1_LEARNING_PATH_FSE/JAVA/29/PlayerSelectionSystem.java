import java.util.List;
import java.util.*;
import java.sql.*;

public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight) throws Exception{
		List<String> players = new ArrayList<>();
		    Connection myConn = null;
		    Statement myStmt = null;
		    ResultSet myRs = null;
		    myConn = DB.getConnection();
		    myStmt = myConn.createStatement();
		    myRs = myStmt.executeQuery("select playerName from player where height >= " + minHeight + " and weight <= " + maxWeight + " order by playerName");
		    while (myRs.next()) {
		        String name = myRs.getString("playerName");
		        players.add(name);
		    }
		// Fill your code here	
		
		return players;
	}
}

