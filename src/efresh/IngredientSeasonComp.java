package efresh;

import java.util.Comparator;

// -------------------------------------------------------------------------
/**
 * Compare recipes according to season
 * 
 * @author alici
 * @version May 23, 2024
 */
public class IngredientSeasonComp
    implements Comparator<Ingredient>

{
    @Override
    public int compare(Ingredient ing1, Ingredient ing2)
    {
        return ing1.getSeason().compareTo(ing2.getSeason());
    }
}
