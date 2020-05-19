import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int ch;
        ArrayList<Book> list=new ArrayList<Book>();
        Book book=new Book();
        Library library=new Library();
        do{
           System.out.println("1.Add Book");
     System.out.println("2.Display all book details");
     System.out.println("3.Search Book by author ");
     System.out.println("4.Count number of books - by book name");
     System.out.println("5.Exit");
     System.out.println("Enter your choice:");
     ch=Integer.parseInt(sc.nextLine());
     switch(ch){
         case 1:{
             try{
             System.out.println("Enter the isbn no:");
             book.setIsbnno(Integer.parseInt(sc.nextLine()));
             System.out.println("Enter the book name:");
             book.setBookName(sc.nextLine());
             System.out.println("Enter the author name:");
             book.setAuthor(sc.nextLine());
             library.addBook(book);}
            catch(Exception e){
                System.out.println(e.toString());
            }
             break;
         }
         case 2:{
             try{
             list=library.viewAllBooks();
             for(Book b:list){
                  System.out.println(b.getIsbnno());
                 System.out.println(b.getBookName());
                 System.out.println(b.getAuthor());
         }
             }
             catch(Exception e){ System.out.println(e.toString());}
         break;
     }
     case 3:{
         try{
         System.out.println("Enter the author name:");
         String a=sc.nextLine();
         list=library.viewBooksByAuthor(a);
         library.setBookList(list);
         boolean f=library.isEmpty();
         if(!f)
         for(Book b:list){
             System.out.println("ISBN no:"+b.getIsbnno());
             System.out.println("Book name:"+b.getBookName());
             System.out.println("Author name:"+b.getAuthor());
         }
         else
         System.out.println("None of the book published by the author "+a);
         }
         catch(Exception e){ System.out.println(e.toString());}
         break;
         
     }
     case 4:{
         try{
         System.out.println("Enter the book name");
         int c=library.countnoofbook(sc.nextLine());
         System.out.println(c);}
          catch(Exception e){System.out.println(e.toString());}
         break;
     }
     case 5:System.exit(0);
     }   
        
    }while(ch!=5);
    
}
}