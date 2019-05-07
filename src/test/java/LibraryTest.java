import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(100);
        book = new Book("Jane Eyre", "Charlotte Bronte", "novel");
    }

    @Test
    public void checkNumberOfBooksInLibrary(){
        assertEquals(0, library.booksCount());
    }

    @Test
    public void shouldBeAbleToAddBooks(){
        library.addBook(book);
        assertEquals(1, library.booksCount());
    }

    @Test
    public void shouldBeAbleToLendBooks(){
        library.addBook(book);
        library.lendBook();
        assertEquals(0, library.booksCount());
    }

    @Test
    public void checkLibraryStockCapacity(){
        library.checkStockCapacity(book);
        assertEquals(1, library.booksCount());
    }

}
