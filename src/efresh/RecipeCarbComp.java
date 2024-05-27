package efresh;

import java.util.Comparator;

// -------------------------------------------------------------------------
/**
 * Compare recipes according to carbs per serving
 * 
 * @author alici
 * @version May 23, 2024
 */
public class RecipeCarbComp
    implements Comparator<Recipe>

{
    @Override
    public int compare(Recipe recipe1, Recipe recipe2)
    {
        int carb1 = recipe1.getCarb();
        int carb2 = recipe1.getCarb();
        return carb2 - carb1;
    }
}
