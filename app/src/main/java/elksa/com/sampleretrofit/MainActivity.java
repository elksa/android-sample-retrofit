package elksa.com.sampleretrofit;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import elksa.com.sampleretrofit.model.Book;
import elksa.com.sampleretrofit.model.SearchResult;
import elksa.com.sampleretrofit.services.BookService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends ListActivity {

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

                if (response.code() == 200) {
                    SearchResult data = response.body();
                    final ArrayList<Book> books = data.getBooks();

                    ArrayAdapter<Book> adapter = new ArrayAdapter<Book> (MainActivity.this,
                            android.R.layout.simple_list_item_2, android.R.id.text1, books) {

                        @NonNull
                        @Override
                        public View getView(int position,
                                            View convertView, @NonNull ViewGroup parent) {

                            View view = super.getView(position, convertView, parent);

                            TextView text1 = view.findViewById(android.R.id.text1);
                            TextView text2 = view.findViewById(android.R.id.text2);

                            text1.setText(books.get(position).getTitle());
                            text2.setText( books.get(position).getSubTitle() );

                            return view;
                        }

                    };

                    setListAdapter(adapter);
                }
                else {
                    Toast.makeText(MainActivity.this, "Error, response code: " + response.code(),
                            Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<SearchResult> call, Throwable t) {
                Log.e("error", t.toString());
            }
        });
    }

}
