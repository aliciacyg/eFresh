package efresh;

import java.util.Comparator;

// -------------------------------------------------------------------------
/**
 * Compare recipes according to calories per serving
 * 
 * @author alici
 * @version May 23, 2024
 */
public class RecipeCalorieComp
    implements Comparator<Recipe>

{
    @Override
    public int compare(Recipe recipe1, Recipe recipe2)
    {
        int calorie1 = recipe1.getCalories();
        int calorie2 = recipe1.getCalories();
        return calorie2 - calorie1;
    }
}
