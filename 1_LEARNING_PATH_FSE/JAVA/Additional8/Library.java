import java.util.*;
public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();
    
    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    
    public ArrayList<Book> getBookList() {
        return bookList;
    }
    
    public void addBook(Book obj) {
        bookList.add(obj);
    }
    
    public boolean isEmpty() {
        return bookList.size() == 0;
    }
    
    public ArrayList<Book> viewAllBooks() {
        return bookList;
    }
    
    public ArrayList<Book> viewBooksByAuthor(String author) {
        ArrayList<Book> authorWise = new ArrayList<>();
        for (Book b: bookList) {
            if (author.equals(b.getAuthor()))
                authorWise.add(b);
        }
        return authorWise;
    }
    
    public int countnoofbook(String bname) {
        int count = 0;
        for (Book b: bookList) {
            if (bname.equals(b.getBookName()))
                count += 1;
        }
        return count;
    }
    
}
