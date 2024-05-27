package efresh;

// -------------------------------------------------------------------------
/**
 * So many ingredients every season wow
 * 
 * @author alici
 * @version May 23, 2024
 */
public class Ingredient
    implements Comparable<Ingredient>
{
    private String name;
    private Boolean pantry;
    private Season season;
    private int serving;
    private int calories;
    private int carb;
    private int protein;
    private int fat;

    @Override
    public int compareTo(Ingredient o)
    {
        return name.compareTo(o.getName());
    }


    // ----------------------------------------------------------
    /**
     * Create a new Ingredient object.
     * 
     * @param name
     *            of ingredient
     * @param pantry
     *            is it a pantry item
     * @param season
     *            what season
     * @param serving
     *            how much is a serving
     * @param calories
     *            how many calories per serving
     * @param carb
     *            how many carbs per serving
     * @param fat
     *            how many fat per serving
     * @param protein
     *            how many protein per serving
     */
    public Ingredient(
        String name,
        Boolean pantry,
        Season season,
        int serving,
        int calories,
        int carb,
        int fat,
        int protein)
    {
        this.name = name;
        this.pantry = pantry;
        this.season = season;
        this.serving = serving;
        this.calories = calories;
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }


    // ----------------------------------------------------------
    /**
     * @return name of ingredient
     */
    public String getName()
    {
        return name;
    }


    // ----------------------------------------------------------
    /**
     * @return is it a pantry item
     */
    public Boolean isPantry()
    {
        return pantry;
    }


    // ----------------------------------------------------------
    /**
     * @return what season
     */
    public Season getSeason()
    {
        return season;
    }


    // ----------------------------------------------------------
    /**
     * @return what is a serving size
     */
    public int getServing()
    {
        return serving;
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
     * @return carbs per serving
     */
    public int getCarb()
    {
        return carb;
    }


    // ----------------------------------------------------------
    /**
     * @return protein per serving
     */
    public int getProtein()
    {
        return protein;
    }


    // ----------------------------------------------------------
    /**
     * @return fat per serving
     */
    public int getFat()
    {
        return fat;
    }
}
