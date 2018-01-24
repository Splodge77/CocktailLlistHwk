package example.codeclan.com.cocktails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Cocktail> cocktailList = new CocktailList().getList();

        CocktailListAdapter cocktailsAdapter = new CocktailListAdapter(this, cocktailList);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(cocktailsAdapter);
    }
}
