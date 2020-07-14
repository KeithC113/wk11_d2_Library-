import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    public static void main(String[] args) {
        HashMap<String, String> books = new HashMap<String, String > ();

        books.put("Animal Farm", "Fiction");
        books.put("5 Ingredients", "Cooking");
        books.put("Mexico", "Cooking");
        books.put("The Gruffalo", "Childrens");
        books.put("Blue Moon", "Fiction");

        System.out.println(books.containsValue("Cooking"));

        for (String book : books.keySet());
        String output = String.format

    }
    private ArrayList<Book> book;
    private int capacity;
    private int stock;

    public Library() {
        this.book = new ArrayList<Book>();
        this.capacity = 100;
    }
    public int getCapacity(){
        return capacity;
    }

    public int bookCount(){
        return this.book.size();
    }

    public void addBook(Book book) {
        if(this.bookCount() < this.capacity){
            this.book.add(book);
        }
    }
    public void removeBook (Book book) {
        this.book.remove(book);
    }

}
