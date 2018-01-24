package example.codeclan.com.cocktails;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/01/2018.
 */

public class CocktailTest {

    Cocktail cocktail;

    @Before
    public void cocktailTest(){
        cocktail = new Cocktail("Espresso Martini", "2pt vodka, 1pt espresso, 1pt coffee liq");
    }

    @Test
    public void hasName(){
        assertEquals("Espresso Martini", cocktail.getName());
    }

    @Test
    public void hasRecipe(){
        assertEquals("2pt vodka, 1pt espresso, 1pt coffee liq", cocktail.getRecipe());
    }

}
