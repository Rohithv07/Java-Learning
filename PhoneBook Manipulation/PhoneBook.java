import java.util.*;
public class PhoneBook{
    private List<Contact> phoneBook=new ArrayList<Contact>();
    public void setPhoneBook(List<Contact> phoneBook){
        this.phoneBook=phoneBook;
    }
    public List<Contact> getPhoneBook(){
        return this.phoneBook;
    }
    public void addContact(Contact contactObj){
        phoneBook.add(contactObj);
    }
    public List<Contact> viewAllContacts(){
        return phoneBook;
    }
    public Contact viewContactGivenPhone(long phoneNumber){
        Contact cc=new Contact(" "," ",0," ");
        for(Contact c:phoneBook)
            if(phoneNumber==c.getPhoneNumber())
                cc=c;
        return cc;
    }
    public boolean removeContact(long phoneNumber){
        int f=0;
        Iterator<Contact> itr=phoneBook.iterator();
        while(itr.hasNext()){
            Contact c=itr.next();
            if(phoneNumber==c.getPhoneNumber()){
                phoneBook.remove(c);
                f=1;
                break;
            }
        }
        if(f==1)
            return true;
        else
            return false;
    }
}