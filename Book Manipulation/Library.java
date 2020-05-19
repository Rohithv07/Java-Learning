import java.util.*;
public class Library{
    private ArrayList<Book> bookList=new ArrayList<Book>();
    public void setBookList(ArrayList<Book> bookList){
        this.bookList=bookList;
    }
    public ArrayList<Book> getBookList(){
        return this.bookList;
    }
    public void addBook(Book bobj){
        bookList.add(bobj);
    }
    public boolean isEmpty(){
        if(bookList.isEmpty())
            return true;
        else    
            return false;
    }
    public ArrayList<Book> viewAllBooks(){
        return bookList;
    }
    public ArrayList<Book> viewBooksByAuthor(String author){
        ArrayList<Book> l=new ArrayList<Book>();
        int c=0;
        for(Book b:bookList)
            if(author.compareTo(b.getAuthor())==0)
                l.add(b);
            return l;
    }
    public int countnoofbook(String bname){
        int  c=0;
        for(Book b:bookList){
            if(bname.compareTo(b.getBookName())==0)
                c++;
        }
        return c;
    }
}