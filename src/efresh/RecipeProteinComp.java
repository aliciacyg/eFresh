package efresh;

import java.util.Comparator;

// -------------------------------------------------------------------------
/**
 * Compare recipes according to protein per serving
 * 
 * @author alici
 * @version May 23, 2024
 */
public class RecipeProteinComp
    implements Comparator<Recipe>

{
    @Override
    public int compare(Recipe recipe1, Recipe recipe2)
    {
        int protein1 = recipe1.getProtein();
        int protein2 = recipe1.getProtein();
        return protein2 - protein1;
    }
}
