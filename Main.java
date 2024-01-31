// Create a grocery shopping planner. You have a list of recipes that you want to make.
// Each recipe has a name and ingredients: amount of the ingredient (a simple integer)
// and the name of the ingredient.
// You also have a pantry, which contains various ingredients and their amounts.
// You have one pantry but multiple recipes. Your code should determine what needs to be purchased at the grocer to have enough
// ingredients for all the recipes you wish to make. It calculates what’s missing in your pantry to satisfy all the recipes.
// Create a Main class, a Recipe class (which is a single recipe), and a Pantry class. The main function creates a pantry object
// and list of recipe objects and determines the grocery list.
// There is no need for user input, you can create your own demo pantry and recipe data.
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Pantry pantry = new Pantry();
        pantry.addIngredient("Flour", 4);
        pantry.addIngredient("Sugar", 3);
        pantry.addIngredient("Eggs", 3);
        List<Recipe> recipes = new ArrayList<>();
        Recipe Pancake = new Recipe("Pancake");
        Pancake.addIngredient("Flour", 4);
        Pancake.addIngredient("Sugar", 3);
        Pancake.addIngredient("Eggs", 6);
        recipes.add(Pancake);
        System.out.println("To make the Pancake recipie, you need a grocery list:");
        System.out.println("Grocery List:" + "Flour: 0 " + "Sugar: 0 " + "Eggs: 3" );
        for (Recipe recipe : recipes){
            for (Map.Entry<String, Integer> entry : recipe.getIngredients().entrySet()){
                String ingredient = entry.getKey();
                int requiredAmount = entry.getValue();
                if (!pantry.ingredientList(ingredient, requiredAmount)) {
                    int buy = requiredAmount - pantry.getpan().getOrDefault(ingredient, 0);
                    System.out.println("Need to buy "+ ingredient + ": " + buy);
                    pantry.addIngredient(ingredient, buy);
                }
                pantry.useIngredient(ingredient, requiredAmount);
            }
        }
    }
}

