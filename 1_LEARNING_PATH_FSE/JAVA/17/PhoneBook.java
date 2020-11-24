import java.util.*;
public class PhoneBook {
    private List<Contact> phoneBook = new ArrayList<Contact>();
    public void setPhoneBook(List<Contact> phoneBook) {
        this.phoneBook = phoneBook;
    }
    public List<Contact> getPhoneBook() {
        return this.phoneBook;
    }
    public void addContact(Contact contactObj) {
        this.phoneBook.add(contactObj);
    }
    public List<Contact> viewAllContacts() {
        return this.phoneBook;
    }
    public Contact viewContactGivenPhone(long phoneNumber) {
        Contact contact = new Contact("", "", 0, "");
        for (Contact cont: phoneBook) {
            if (phoneNumber == cont.getPhoneNumber())
                contact = cont;
        }
        return contact;
    }
    public boolean removeContact(long phoneNumber) {
        for (Contact contact: phoneBook) {
            if (contact.getPhoneNumber() == phoneNumber) {
                phoneBook.remove(contact);
                return true;
            }
        }
        return false;
    }
}