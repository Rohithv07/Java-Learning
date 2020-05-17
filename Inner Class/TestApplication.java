import java.util.*;
public class TestApplication {

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    long phoneNumber;
	    String name,city,street,state;
	    System.out.println("Enter the permanent address");
	    System.out.println("Enter the house name");
	    name=scanner.nextLine();
	    System.out.println("Enter the street");
	    street=scanner.nextLine();
	    System.out.println("Enter the city");
	    city=scanner.nextLine();
	    System.out.println("Enter the state");
	    state=scanner.nextLine();
	    AddressBook adb=new AddressBook();
	    adb.getPermAddress().setName(name);
	    adb.getPermAddress().setStreet(street);
	    adb.getPermAddress().setCity(city);
	    adb.getPermAddress().setState(state);
	    System.out.println("Enter the temporary address");
	    System.out.println("Enter the house name");
	    name=scanner.nextLine();
	    System.out.println("Enter the street");
	    street=scanner.nextLine();
	    System.out.println("Enter the city");
	    city=scanner.nextLine();
	    System.out.println("Enter the state");
	    state=scanner.nextLine();
	    adb.getTempAddress().setName(name);
	    adb.getTempAddress().setStreet(street);
	    adb.getTempAddress().setCity(city);
	    adb.getTempAddress().setState(state);
	    System.out.println("Enter the phone number");
	    phoneNumber=Long.parseLong(scanner.nextLine());
	    adb.setPhoneNumber(phoneNumber);
	    System.out.println("Permanent address");
	    System.out.println("House name:" +adb.getPermAddress().getName());
	    System.out.println("Street:" +adb.getPermAddress().getStreet());
	    System.out.println("City:" +adb.getPermAddress().getCity());
	    System.out.println("State:" +adb.getPermAddress().getState());
	    System.out.println("Temporary address");
	    System.out.println("House name:" +adb.getTempAddress().getName());
	    System.out.println("Street:" +adb.getTempAddress().getStreet());
	    System.out.println("City:" +adb.getTempAddress().getCity());
	    System.out.println("State:" +adb.getTempAddress().getState());
	    System.out.println("phone number");
	    System.out.println(adb.getPhoneNumber());
	    
	}
}