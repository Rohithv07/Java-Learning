//import necessary packages
import java.util.*;
import java.io.*;


 @SuppressWarnings("unchecked")//Do not delete this line
public class Main {
	public static void main(String[] args) throws IOException{
	    Scanner sc = new Scanner(System.in);
	    File file = FileManager.createFile();
	    String choice;
	    String records = "";
	    do {
	        System.out.println("Enter Name");
	        String name = sc.nextLine();
	        System.out.println("Enter Phone Number");
	        String phone = sc.nextLine();
	        System.out.println("Enter Email");
	        String email = sc.nextLine();
	        records += name + "," + phone + "," + email + ";";
	        System.out.println("Do you want to enter another record(yes/no)");
	        choice = sc.nextLine();
	    } while (!choice.equals("no"));
	    FileManager.writeFile(file, records);
	    String [] everyRecord = FileManager.readFile(file);
	    for (String record: everyRecord) 
	        System.out.println(record);
	    
	}
    
}
