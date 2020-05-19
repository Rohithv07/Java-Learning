import java.util.*;
import java.lang.*;
public class Main{
    public static void main (String[] args){
     Scanner sc=new Scanner(System.in);
     int ch;
     List<Contact> list=new ArrayList<Contact>();
     Contact contact=new Contact(" "," ",0," ");
     PhoneBook phonebook=new PhoneBook();
     do{
         System.out.println("Menu");
     System.out.println("1.Add Contact");
     System.out.println("2.Display all contacts");
     System.out.println("3.Search contact by phone");
     System.out.println("4.Remove contact");
     System.out.println("5.Exit");
     System.out.println("Enter your choice:");
     ch=Integer.parseInt(sc.nextLine());
     switch(ch){
         case 1:{
             try{
               System.out.println("Add Contact:");   
             System.out.println("Enter the First Name:");
             contact.setFirstName(sc.nextLine());
             System.out.println("Enter the Last Name:");
             contact.setLastName(sc.nextLine());
             System.out.println("Enter the Phone No:");
             contact.setPhoneNumber(Long.parseLong(sc.nextLine()));
             System.out.println("Enter the Email:");
             contact.setEmailId(sc.nextLine());
             phonebook.addContact(contact);}
            catch(Exception e){
                System.out.println(e.toString());
            }
             break;
         }
         case 2:{
             try{
                 System.out.println("The contacts in the List are:");
             list=phonebook.viewAllContacts();
             for(Contact c:list){
                  System.out.println("First Name:"+c.getFirstName());
                 System.out.println("Last Name:"+c.getLastName());
                 System.out.println("Email:"+c.getEmailId());
                 System.out.println("Phone No.:"+c.getPhoneNumber());
         }
             }
             catch(Exception e){ System.out.println(e.toString());}
         break;}
         case 3:{
             try{
         System.out.println("Enter the Phone number to search contact:");
         long p=Long.parseLong(sc.nextLine());
         contact=phonebook.viewContactGivenPhone(p);
         System.out.println("The contact is:");
             System.out.println("First Name:"+contact.getFirstName());
                 System.out.println("Last Name:"+contact.getLastName());
                 System.out.println("Phone No.:"+contact.getPhoneNumber());
                 System.out.println("Email:"+contact.getEmailId());
         }
         catch(Exception e){ System.out.println(e.toString());}
         break;
     }
     case 4:{
        try{
            System.out.println("Enter the Phone number to remove:");
            long p=Long.parseLong(sc.nextLine());
            System.out.println("Do you want to remove the contact (Y/N):");
            char c=sc.next().charAt(0);
            boolean f=phonebook.removeContact(p);
            if(f)
            System.out.println("The contact is successfully deleted.");
            else
            System.out.println("The phone number is not available");
        }
         
        catch(Exception e){ System.out.println(e.toString());}
         break; 
     }
     case 5:System.exit(0);
         }
     }while(ch!=5);
    }
}
     