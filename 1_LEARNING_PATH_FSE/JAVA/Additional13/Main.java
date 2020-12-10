import java.sql.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fill your code here
		LoanManagementSystem ls = new LoanManagementSystem();
		String choice = "";
		do {
		    System.out.println("Enter the type of loan to be searched");
		    String loanType = sc.nextLine();
		    int count = ls.viewLoanCountBasedOnType(loanType);
		    if (count == -1 || count == 0)
		        System.out.println("No customer has acquired " + loanType + " loan");
		    else
		        System.out.println("Number of customers who have taken " + loanType + " loan : " + count);
		    System.out.println("Do you want to searched again the loan type (yes/no)");
		    choice = sc.nextLine();
		} while (!choice.equals("no"));
		System.out.println("Thank you for using the Application");

		
	}
}
