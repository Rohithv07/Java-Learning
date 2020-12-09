
import java.util.ArrayList;
import java.sql.*;

public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
	    ArrayList<Train> train = new ArrayList<>();
	    try {
	        Connection myConn = null;
	        Statement myStmt = null;
	        ResultSet myRs = null;
	        // 1. make Connection
	        myConn = DB.getConnection();
	        // 2. make statement
	        myStmt = myConn.createStatement();
	        // 3. Execute query
	        myRs = myStmt.executeQuery("select * from train where source = '" + source + "' and destination = '" + destination + "' and " + coachType + " > 0 order by train_number");
	        // 4. process the query
	        while (myRs.next()) {
	            int trainNumber = myRs.getInt("train_number");
	            String trainName = myRs.getString("train_name");
	            String currentSource = myRs.getString("source");
	            String currentDestination = myRs.getString("destination");
	            int ac1 = myRs.getInt("ac1");
	            int ac2 = myRs.getInt("ac2");
	            int ac3 = myRs.getInt("ac3");
	            int sleeper = myRs.getInt("sleeper");
	            int seater = myRs.getInt("seater");
	            train.add(new Train(trainNumber, trainName, currentSource, currentDestination, ac1, ac2, ac3, sleeper, seater));
	            
	        }
	    }catch (Exception e) {};
		
		// Fill your code here	
		return train;
		
	}

}

