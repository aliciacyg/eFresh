package efresh;

import java.util.Comparator;

// -------------------------------------------------------------------------
/**
 * Compare recipes according to proteins per serving
 * 
 * @author alici
 * @version May 23, 2024
 */
public class IngredientProteinComp
    implements Comparator<Ingredient>

{
    @Override
    public int compare(Ingredient ing1, Ingredient ing2)
    {
        int protein1 = ing1.getProtein();
        int protein2 = ing2.getProtein();
        return protein2 - protein1;
    }
}
