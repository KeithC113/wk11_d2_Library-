import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book ("Never Look Back", "Lee Childs", "Fiction");

    }
    @Test
    public void hasTitle(){ assertEquals("Never Look Back", book.getTitle());}

    @Test
    public void hasAuthor(){assertEquals("Lee Child", book.getAuthor());}

    @Test
    public void hasGenre(){assertEquals("Crime", book.getGenre());}

}
