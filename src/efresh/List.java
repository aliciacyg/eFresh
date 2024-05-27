package efresh;

// -------------------------------------------------------------------------
/**
 * List interface
 * 
 * @param <T>
 * @author alici
 * @version May 23, 2024
 */
public interface List<T>
{
    /**
     * Adds node to list with the data data
     * 
     * @param data
     *            The data to add
     */
    public void add(T data);


    /**
     * Adds a node to list at index with the data data
     * 
     * @param index
     *            where
     * @param data
     *            what
     */
    public void add(int index, T data);


    /**
     * Removes node at the index
     * 
     * @param index
     *            index of node to remove
     * @return The data of the node that was removed.
     */
    public T remove(int index);


    /**
     * Clear the list
     */
    public void clear();


    /**
     * Replace data in node @ index with new data
     * 
     * @param index
     *            which node
     * @param data
     *            new data
     * @return old data
     */
    public T replace(int index, T data);


    /**
     * Get data at index
     * 
     * @param index
     *            which node
     * @return data at that node
     */
    public T getEntry(int index);


    /**
     * Turns list into array
     * 
     * @return the array
     */
    public Object[] toArray();


    /**
     * Check if list contains data
     * 
     * @param data
     *            does it contain this one?
     * @return yes if so
     */
    public boolean contains(T data);


    /**
     * @return how many objects in the list
     */
    public int getLength();


    /**
     * is the list empty?
     * 
     * @return yes if so
     */
    public boolean isEmpty();
}
