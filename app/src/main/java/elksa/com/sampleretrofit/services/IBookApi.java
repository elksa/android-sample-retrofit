package elksa.com.sampleretrofit.services;

import elksa.com.sampleretrofit.config.AppConstants;
import elksa.com.sampleretrofit.model.SearchResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IBookApi {

    @GET(AppConstants.OPERATION_GET_BOOKS + "{query}")
    Call<SearchResult> getSearchResult(@Path("query") String query);

    @GET(AppConstants.OPERATION_GET_BOOKS + "{query}" + AppConstants.OPERATION_PARAMETER_PAGE + "{page}")
    Call<SearchResult> getSearchResult(
            @Path("query") String query,
            @Path("page") int page
    );

}
