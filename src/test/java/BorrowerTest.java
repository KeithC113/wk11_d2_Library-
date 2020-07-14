import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower ();
        book = new Book ("Goldfinger", "Ian Fleming", "Crime");
        library = new Library();
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBookToCollection(){
        borrower.addBookToCollection(book);
        assertEquals(1, borrower.bookCount());
    }



}
