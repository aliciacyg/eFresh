package efresh;

import java.util.Comparator;

// -------------------------------------------------------------------------
/**
 * Compare recipes according to carbs per serving
 * 
 * @author alici
 * @version May 23, 2024
 */
public class RecipeFatComp
    implements Comparator<Recipe>

{
    @Override
    public int compare(Recipe recipe1, Recipe recipe2)
    {
        int fat1 = recipe1.getFat();
        int fat2 = recipe1.getFat();
        return fat2 - fat1;
    }
}
