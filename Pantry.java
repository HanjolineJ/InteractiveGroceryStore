import java.util.HashMap;
import java.util.Map;
public class Pantry {
    private Map<String, Integer> pan;
    public Pantry() {
        this.pan = new HashMap<>();
    }
    public void addIngredient(String ingredient, int amount) {
        pan.put(ingredient, pan.getOrDefault(ingredient, 0) + amount);
    }
    public boolean ingredientList(String ingredient, int amount) {
        return pan.getOrDefault(ingredient, 0) >= amount;
    }
    public void useIngredient(String ingredient, int amount) {
        if (ingredientList(ingredient, amount)) {
            pan.put(ingredient, pan.get(ingredient) - amount);
        }
    }
    public Map<String, Integer> getpan() {
        return pan;
    }
}