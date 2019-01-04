package elksa.com.sampleretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import elksa.com.sampleretrofit.model.SearchResult;
import elksa.com.sampleretrofit.services.BookService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
    }

    private void loadData() {

        Call<SearchResult> call = BookService.getInstance().getApi().getSearchResult("java", 1);

        call.enqueue(new Callback<SearchResult>() {
            @Override
            public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {
                switch (response.code()) {
                    case 200:
                        SearchResult data = response.body();
                        // TODO view.notifyDataSetChanged(data.getResults());
                        break;
                    case 401:

                        break;
                    default:

                        break;
                }
            }

            @Override
            public void onFailure(Call<SearchResult> call, Throwable t) {
                Log.e("error", t.toString());
            }
        });
    }
}
