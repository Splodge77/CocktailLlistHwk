package example.codeclan.com.cocktails;

/**
 * Created by user on 23/01/2018.
 */

public class Cocktail {

    private String name;
    private String recipe;

    public Cocktail(String name, String recipe){
        this.name = name;
        this.recipe = recipe;
    }

    public String getName() {
        return this.name;
    }


    public String getRecipe() {
        return this.recipe;
    }

    @Override
    public String toString(){
        return this.getName();
    }
}
