package example.codeclan.com.cocktails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 23/01/2018.
 */

public class CocktailListAdapter extends ArrayAdapter<Cocktail> {

    public CocktailListAdapter(Context context, ArrayList<Cocktail> cocktails){
        super(context, 0, cocktails);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.cocktail_item, parent, false);
        }

        Cocktail currentCocktail = getItem(position);

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentCocktail.getName().toString());

        TextView recipe = listItemView.findViewById(R.id.recipe);
        recipe.setText(currentCocktail.getRecipe().toString());

        return listItemView;
    }
}
