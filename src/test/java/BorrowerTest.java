import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp(){
        borrower = new Borrower();
        book = new Book("Jane Eyre", "Charlotte Bronte", "novel");
        library = new Library(100);
        library.addBook(book);
    }

    @Test
    public void checkBorrowersBook(){
        assertEquals(0, borrower.borrowerBookCount());
    }

    @Test
    public void canBorrowBooks(){
        borrower.borrowsBook(book);
        assertEquals(1, borrower.borrowerBookCount());
    }

    @Test
    public void canReturnBooks(){
        borrower.borrowsBook(book);
        borrower.returnsBook();
        assertEquals(0, borrower.borrowerBookCount());
    }

    @Test
    public void CanBorrowBooksFromLibrary(){
        borrower.borrowsBookFromLibrary(library);
        assertEquals(1, borrower.borrowerBookCount());
        assertEquals(0, library.booksCount());
    }
}
