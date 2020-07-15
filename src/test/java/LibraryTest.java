import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Library library;
//    private title title;
//    private genre genre;

    @Before
    public void before(){
        book = new Book();
    }

    @Test
    public void canCountBooks(){
        assertEquals(1, library.bookCount); // can't understand why bookCount isn't understood
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount);
    }


}
