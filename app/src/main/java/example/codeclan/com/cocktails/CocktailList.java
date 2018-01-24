package example.codeclan.com.cocktails;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by user on 23/01/2018.
 */

public class CocktailList{

    public ArrayList<Cocktail> list;


    public CocktailList(){
        list = new ArrayList<Cocktail>();
        list.add(new Cocktail("Espresso Martini", "2pt vodka, 1pt espresso, 1pt coffee liq"));
        list.add(new Cocktail("Sweet Manhattan", "2pt bourbon, 1pt vermouth, tsp cherry syrup, dash angostura bitters"));
        list.add(new Cocktail("Mojito", "Juice 1 lime, 1tsp sugar, mint, 60ml white rum, soda to taste"));
        list.add(new Cocktail("Margarita", "50ml tequila, juice 1 lime, 1tbs triple sec"));
        list.add(new Cocktail("Black Russian", "2pt vodka, 1pt coffee liq, on ice w cherry, top w cola"));
        list.add(new Cocktail("Sloe Gin Cocktail", "2pt sloe gin, 1pt lemon juice, ipt gin, serve on crushed ice w juniper syrup"));
    }


    public ArrayList<Cocktail> getList() {
        return new ArrayList<>(list);
    }
}
