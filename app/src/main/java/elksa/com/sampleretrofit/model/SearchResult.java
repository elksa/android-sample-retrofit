package elksa.com.sampleretrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Alejandro Casanova Mutis on 3/30/16.
 */
public class SearchResult {

    @SerializedName("Page")
    private int page;
    @SerializedName("Total")
    private int total;
    @SerializedName("Error")
    private String error;
    @SerializedName("Books")
    private ArrayList<Book> books;

    public SearchResult() {
    }

    public SearchResult(String error, int page, int total, ArrayList<Book> books) {
        this.books = books;
        this.error = error;
        this.page = page;
        this.total = total;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
