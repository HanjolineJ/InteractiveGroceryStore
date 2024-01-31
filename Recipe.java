//multiple ingredients, name and number of ingredients use hashmap, write loops,
//

import java.util.HashMap;
public class Recipe {
    String name;
    HashMap<String, Integer> ingredients;
    public Recipe(String name) {
        this.name = name;
        this.ingredients = new HashMap<>();
    }
    public void addIngredient(String ingredient, int amount) {
        ingredients.put(ingredient, amount);
    }
    public HashMap<String, Integer> getIngredients() {
        return ingredients;
    }
}