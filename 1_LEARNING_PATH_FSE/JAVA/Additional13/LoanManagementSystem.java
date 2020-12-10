import java.sql.*;
import java.util.*;
public class LoanManagementSystem {

	public int  viewLoanCountBasedOnType (String loanType){
		int count=-1;
		try {
		    Connection myConn = null;
		    Statement myStmt = null;
		    ResultSet myRs = null;
		    myConn = DB.getConnection();
		    myStmt = myConn.createStatement();
		    myRs = myStmt.executeQuery("select count(loanId) from loan where loanType = '" + loanType + "'");
		    myRs.next();
		    count = myRs.getInt("count(loanId)");
		    return count;
		} catch(Exception e) {
		    return count;
		}
		
		// Fill your code here	
	}
}
