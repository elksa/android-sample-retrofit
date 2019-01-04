package elksa.com.sampleretrofit.services;

import elksa.com.sampleretrofit.config.AppConstants;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Alejandro Casanova Mutis on 27/2/16.
 */
public class BookService {

    // Fields
    private IBookApi bookApi;

    // Singleton
    private static BookService instance;

    private BookService() {

        // Create interceptor and set the log level
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        // Associate the interceptor to the requests
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(interceptor);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.IT_EBOOKS_SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();
        this.bookApi = retrofit.create(IBookApi.class);
    }

    public static BookService getInstance() {
        if (instance == null) {
            instance = new BookService();
        }

        return instance;
    }

    public IBookApi getApi() {
        return this.bookApi;
    }

}
