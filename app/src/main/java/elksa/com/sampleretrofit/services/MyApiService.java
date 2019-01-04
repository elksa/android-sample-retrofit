package elksa.com.sampleretrofit.services;

import elksa.com.sampleretrofit.model.DiseasesResponse;
import elksa.com.sampleretrofit.model.LoginResponse;
import elksa.com.sampleretrofit.model.SimpleResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MyApiService {

    @GET("diseases")
    Call<DiseasesResponse> getDiseases();

    @FormUrlEncoded
    @POST("upload/photo")
    Call<SimpleResponse> postPhoto(
            @Field("image") String base64,
            @Field("extension") String extension,
            @Field("user_id") String userId
    );

    @GET("login")
    Call<LoginResponse> getLogin(
            @Query("username") String username,
            @Query("password") String password
    );

    @POST("product")
    Call<SimpleResponse> postNewProduct(
            @Field("code") String code,
            @Field("name") String name,
            @Field("descriotion") String description
    );

}
