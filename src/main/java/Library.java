import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int booksCount() {
        return books.size();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void checkStockCapacity(Book book) {
        if (booksCount() <= this.capacity) {
            books.add(book);
        }
    }

    public Book lendBook(){
        return this.books.remove(0);
    }
}
