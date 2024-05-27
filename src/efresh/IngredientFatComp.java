package efresh;

import java.util.Comparator;

// -------------------------------------------------------------------------
/**
 * Compare recipes according to fats per serving
 * 
 * @author alici
 * @version May 23, 2024
 */
public class IngredientFatComp
    implements Comparator<Ingredient>

{
    @Override
    public int compare(Ingredient ing1, Ingredient ing2)
    {
        int fat1 = ing1.getFat();
        int fat2 = ing2.getFat();
        return fat2 - fat1;
    }
}
