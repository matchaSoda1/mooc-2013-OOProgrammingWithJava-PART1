
import java.util.*;

public class Library {
    private ArrayList<Book> books;
    
    public Library() {
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book book) {
        this.books.add(book);
    }
    
    public void printBooks() {
        for (Book b : this.books) {
            System.out.println(b);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> results = new ArrayList<Book>();
        
        for (Book b : this.books) {
            if (StringUtils.included(b.title(),title)) {
                results.add(b);
            }
        } return results;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> results = new ArrayList<Book>();
        
        for (Book b : this.books) {
            if (StringUtils.included(b.publisher(),publisher)) {
                results.add(b);
            }
        } return results;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> results = new ArrayList<Book>();
        
        for (Book b : this.books) {
            if (b.year() == year) {
                results.add(b);
            }
        } return results;
    }
}
