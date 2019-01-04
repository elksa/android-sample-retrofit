package elksa.com.sampleretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alejandro Casanova Mutis on 3/30/16.
 */
public class BookDetails {

    @SerializedName("Error")
    private String error;
    @SerializedName("ID")
    private long id;
    @SerializedName("Title")
    private String title;
    @SerializedName("SubTitle")
    private String subTitle;
    @SerializedName("Description")
    private String description;
    @SerializedName("Author")
    private String author;
    @SerializedName("ISBN")
    private String isbn;
    @SerializedName("Page")
    private int pages;
    @SerializedName("Year")
    private int year;
    @SerializedName("Publisher")
    private String publisher;
    @SerializedName("Image")
    private String image;
    @SerializedName("Download")
    private String download;

    public BookDetails() {
    }

    public BookDetails(String author, String description, String download, String error, long id,
                       String image, String isbn, int pages, String publisher, String subTitle,
                       String title, int year) {
        this.author = author;
        this.description = description;
        this.download = download;
        this.error = error;
        this.id = id;
        this.image = image;
        this.isbn = isbn;
        this.pages = pages;
        this.publisher = publisher;
        this.subTitle = subTitle;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
