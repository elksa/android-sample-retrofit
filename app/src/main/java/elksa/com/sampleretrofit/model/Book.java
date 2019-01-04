package elksa.com.sampleretrofit.model;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alejandro Casanova Mutis on 3/29/16.
 */
public class Book {

    @SerializedName("ID")
    private long id;
    @SerializedName("Title")
    private String title;
    @SerializedName("SubTitle")
    private String subTitle;
    @SerializedName("Description")
    private String description;
    @SerializedName("Image")
    private String image;
    private String isbn;

    // Custom fields
    private Bitmap cover;

    public Book() {
    }

    public Book(String description, long id, String image, String isbn, String subTitle, String title) {
        this.description = description;
        this.id = id;
        this.image = image;
        this.isbn = isbn;
        this.subTitle = subTitle;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Bitmap getCover() {
        return cover;
    }

    public void setCover(Bitmap cover) {
        this.cover = cover;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
