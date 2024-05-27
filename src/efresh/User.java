package efresh;

// -------------------------------------------------------------------------
/**
 * Simple user class, keeps user's name and calorie requirements. Will add
 * macros later
 *
 * @author Alicia G
 * @version May 23, 2024
 */
public class User
{
    private String name;
    private int calories;

    // ----------------------------------------------------------
    /**
     * Create a new User object.
     *
     * @param name
     * @param calories
     */
    public User(String name, int calories)
    {
        this.name = name;
        this.calories = calories;
    }


    // ----------------------------------------------------------
    /**
     * Default constructor
     */
    public User()
    {
        this.name = "buddy";
        this.calories = 2000;
    }


    // ----------------------------------------------------------
    /**
     * @return user's name
     */
    public String getName()
    {
        return name;
    }


    // ----------------------------------------------------------
    /**
     * @return user's calories
     */
    public int getCalories()
    {
        return calories;
    }


    // ----------------------------------------------------------
    /**
     * Change calorie requirements of user
     * 
     * @param calories
     *            number of calories
     */
    public void setCalories(int calories)
    {
        this.calories = calories;
    }

}
