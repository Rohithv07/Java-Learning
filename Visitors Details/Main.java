//import necessary packages
import java.io.*;
import java.util.*;
 @SuppressWarnings("unchecked")//Do not delete this line
public class Main
{
	public static void main(String[] args) throws IOException
	{
	 File file=FileManager.createFile();
	 Scanner sc=new Scanner(System.in);
	 String choice;
	 String records="";
	 do{
	     System.out.println("Enter Name");
	     String name=sc.nextLine();
	     System.out.println("Enter Phone Number");
	     String phone=sc.nextLine();
	     System.out.println("Enter Email");
	     String email=sc.nextLine();
	     records+=name+","+phone+","+email+";";
	     System.out.println("Do you want to enter another record(yes/no)");
	     choice=sc.nextLine();
	 }while(!choice.equals("no"));
	 FileManager.writeFile(file,records);
	 String [] allRecords=FileManager.readFile(file);
	 for(String record:allRecords){
	     System.out.println(record);
	 }
	} 
}