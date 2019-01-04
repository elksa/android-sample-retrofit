package elksa.com.sampleretrofit.services;

import elksa.com.sampleretrofit.config.AppConstants;
import elksa.com.sampleretrofit.model.Book;
import elksa.com.sampleretrofit.model.BookDetails;
import elksa.com.sampleretrofit.model.SearchResult;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IBookApi {

    @GET(AppConstants.OPERATION_GET_BOOKS + "{query}")
    Call<SearchResult> getSearchResult(@Path("query") String query);

    @GET(AppConstants.OPERATION_GET_BOOKS + "{query}" + AppConstants.OPERATION_PARAMETER_PAGE + "{page}")
    Call<SearchResult> getSearchResult(
            @Path("query") String query,
            @Path("page") int page
    );

    @GET(AppConstants.OPERATION_GET_BOOK_DETAILS + "{id}")
    Call<BookDetails> getBookDetails(@Path("id") long id);






    // Sample operations
    @GET("diseases")
    Call<SearchResult> getDiseases();

    @FormUrlEncoded
    @POST("upload/photo")
    Call<BookDetails> postPhoto(
            @Field("image") String base64,
            @Field("extension") String extension,
            @Field("user_id") String userId
    );

    @GET("login")
    Call<BookDetails> getLogin(
            @Query("username") String username,
            @Query("password") String password
    );

    @POST("product")
    Call<Book> postNewProduct(
            @Field("code") String code,
            @Field("name") String name,
            @Field("descriotion") String description
    );

}
