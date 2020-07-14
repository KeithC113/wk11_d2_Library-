import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;
    private int capacity;
    private int stock;

    public Library() {
        this.book = new ArrayList<Book>();
        this.stock = stock;
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

}
