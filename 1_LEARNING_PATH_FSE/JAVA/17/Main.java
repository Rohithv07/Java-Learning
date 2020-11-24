import java.util.*;
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Contact contact = new Contact("", "", 0, "");
        PhoneBook phoneBook = new PhoneBook();
        //List<Contact> result = new ArrayList<>();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Add Contact");
            System.out.println("2.Display all contacts");
            System.out.println("3.Search contact by phone");
            System.out.println("4.Remove contact");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice) {
                case 1: {
                    try {
                    System.out.println("Add a Contact:");
                    System.out.println("Enter the First Name:");
                    contact.setFirstName(sc.nextLine());
                    System.out.println("Enter the Last Name:");
                    contact.setLastName(sc.nextLine());
                    System.out.println("Enter the Phone No.:");
                    contact.setPhoneNumber(sc.nextLong());
                    System.out.println("Enter the Email:");
                    contact.setEmailId(sc.nextLine());
                    phoneBook.addContact(contact);
                    }catch (Exception e) {
                        System.out.println(e.toString());
                    }
                    break;
            }
            case 2: {
                try {
                    List<Contact> result = phoneBook.viewAllContacts();
                    System.out.println("The contacts in the List are:");
                    for (Contact c : result) {
                        System.out.println("First Name: " + c.getFirstName());
                        System.out.println("Last Name: " + c.getLastName());
                        System.out.println("Phone No.: " + c.getPhoneNumber());
                        System.out.println("Email: " + c.getEmailId());
                    }
                }catch (Exception e) {
                    System.out.println(e.toString());
                }
                break;
            }
            case 3: {
                try {
                    System.out.println("Enter the Phone number to search contact:");
                    long phone = sc.nextLong();
                    contact = phoneBook.viewContactGivenPhone(phone);
                    System.out.println("The contact is:");
                    System.out.println("First Name: " + contact.getFirstName());
                    System.out.println("Last Name: " + contact.getLastName());
                    System.out.println("Phone No.: " + contact.getPhoneNumber());
                    System.out.println("Email: " + contact.getEmailId());
                }catch (Exception e) {
                    System.out.println(e.toString());
                }
                break;
            }
            case 4: {
                try {
                    System.out.println("Enter the Phone number to remove :");
                    long phone = sc.nextLong();
                    System.out.println("Do you want to remove the contact (Y/N):");
                    char yesNo = sc.next().charAt(0);
                    if (phoneBook.removeContact(phone))
                        System.out.println("The contact is successfully deleted.");
                    else
                        System.out.println("The phone number is not available");
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                break;
            }
            case 5 :
                System.exit(1);
            }
        }while (choice != 5);
    }
}