package efresh;

import java.util.Comparator;

// -------------------------------------------------------------------------
/**
 * Compare recipes according to calories per serving
 * 
 * @author alici
 * @version May 23, 2024
 */
public class IngredientCalorieComp
    implements Comparator<Ingredient>

{
    @Override
    public int compare(Ingredient ing1, Ingredient ing2)
    {
        int calorie1 = ing1.getCalories();
        int calorie2 = ing2.getCalories();
        return calorie2 - calorie1;
    }
}
