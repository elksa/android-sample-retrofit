package elksa.com.sampleretrofit.model;

import java.util.List;

/**
 * Created by Alejandro Casanova Mutis on 5/7/16.
 */
public class BookDownloader {

    // Singleton
    private static BookDownloader ourInstance = new BookDownloader();

    public static BookDownloader getInstance() {
        return ourInstance;
    }

    private BookDownloader() {
    }

    // Fields
    private List<Book> books;

    // Getters and setters
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books, boolean add) {
        if (add) {
            this.books.addAll(books);
        }
        else {
            this.books = books;
        }
    }

    // Methods
    public Book getBookById(long id) {

        Book result;

        if (this.books != null) {

            int pos = 0;
            while (pos < this.books.size() && this.books.get(pos).getId() != id) {
                pos++;
            }

            result = pos < this.books.size() ? this.books.get(pos) : null;
        }
        else {
            result = null;
        }

        return result;
    }
}
