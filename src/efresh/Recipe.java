package efresh;

// -------------------------------------------------------------------------
/**
 * Recipes yay I'm putting the quantities in a list too you can't stop me
 * 
 * @author alici
 * @version May 23, 2024
 */
public class Recipe
{
    private String name;
    private DLList<Ingredient> ingredients;
    private DLList<Integer> quantity;
    private int calories;
    private int carb;
    private int protein;
    private int fat;
    private int servings;

    // ----------------------------------------------------------
    /**
     * Create a new Recipe object.
     * 
     * @param name
     *            name of recipe
     * @param ingredients
     *            list of ingredients
     * @param quantity
     *            quantity of each ingredient
     * @param calories
     *            calories per serving
     * @param carb
     *            carbs per serving
     * @param protein
     *            protein per serving
     * @param fat
     *            fat per serving
     * @param servings
     *            servings per recipes
     */
    public Recipe(
        String name,
        DLList<Ingredient> ingredients,
        DLList<Integer> quantity,
        int calories,
        int carb,
        int protein,
        int fat,
        int servings)
    {
        this.name = name;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.calories = calories;
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
        this.servings = servings;
    }


    // ----------------------------------------------------------
    /**
     * @return name of recipe
     */
    public String getName()
    {
        return name;
    }


    // ----------------------------------------------------------
    /**
     * @return list of ingredients
     */
    public DLList<Ingredient> getIngredients()
    {
        return ingredients;
    }


    // ----------------------------------------------------------
    /**
     * @return quantities of each ingredient
     */
    public DLList<Integer> getQuantity()
    {
        return quantity;
    }


    // ----------------------------------------------------------
    /**
     * @return calories per serving
     */
    public int getCalories()
    {
        return calories;
    }


    // ----------------------------------------------------------
    /**
     * @return grams of carbs per serving
     */
    public int getCarb()
    {
        return carb;
    }


    // ----------------------------------------------------------
    /**
     * @return grams fat per serving
     */
    public int getFat()
    {
        return fat;
    }


    // ----------------------------------------------------------
    /**
     * @return grams of protein per serving
     */
    public int getProtein()
    {
        return protein;
    }


    // ----------------------------------------------------------
    /**
     * @return servings per recipe
     */
    public int getServings()
    {
        return servings;
    }
}
