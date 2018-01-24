package example.codeclan.com.cocktails;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/01/2018.
 */

public class CocktailListTest {

    @Test
    public void getListTest(){
        CocktailList cocktailList = new CocktailList();
        assertEquals(6, cocktailList.getList().size());
    }
}
