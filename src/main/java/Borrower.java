import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower(){
        this.books = new ArrayList<>();
    }

    public int borrowerBookCount(){
        return this.books.size();
    }


    public void borrowsBook(Book book) {
        this.books.add(book);
    }

    public Book returnsBook() {
        return this.books.remove(0);
    }

    public void borrowsBookFromLibrary(Library library) {
        Book book = library.lendBook();
        this.books.add(book);
    }
}
