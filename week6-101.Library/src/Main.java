
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Library library = new Library();
        
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing",2007);
        library.addBook(cheese);
        Book nhl = new Book("NHL Hockey", "Stanley Kupp",1952);
        library.addBook(nhl);
        
        library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        
        ArrayList<Book> result = library.searchByTitle("Cheese");
        for (Book book: result) {
            System.out.println(book);
        }
        
        System.out.println("---");
        for (Book book: library.searchByPublisher("Penguin Group   ")) {
            System.out.println(book);
        }
       
        }
        
              
        
    }

