package efresh;

import java.util.Comparator;

// -------------------------------------------------------------------------
/**
 * Compare recipes according to carbs per serving
 * 
 * @author alici
 * @version May 23, 2024
 */
public class IngredientCarbComp
    implements Comparator<Ingredient>

{
    @Override
    public int compare(Ingredient ing1, Ingredient ing2)
    {
        int carb1 = ing1.getCarb();
        int carb2 = ing2.getCarb();
        return carb2 - carb1;
    }
}
