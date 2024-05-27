package efresh;

// -------------------------------------------------------------------------
/**
 * It's a node yknow?
 * 
 * @param <T>
 * @author alici
 * @version May 23, 2024
 */
public class Node<T>
{
    private T data;
    private Node<T> nextNode;
    private Node<T> prevNode;

    /**
     * Constructor
     * 
     * @param data
     *            The data
     */
    public Node(T data)
    {
        this.data = data;
        nextNode = null;
        prevNode = null;
    }


    /**
     * Constructor with prev node
     * 
     * @param data
     *            data for the node
     * @param prevNode
     *            the previous node
     */
    public Node(T data, Node<T> prevNode)
    {
        this.data = data;
        nextNode = null;
        this.prevNode = prevNode;
    }


    /**
     * Constructor with prev and next node
     * 
     * @param data
     *            data for the node
     * @param nextNode
     *            the next node
     * @param prevNode
     *            the previous node
     */
    public Node(T data, Node<T> nextNode, Node<T> prevNode)
    {
        this.data = data;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }


    /**
     * Gets the data from the node
     * 
     * @return data in node
     */
    public T getData()
    {
        return data;
    }


    /**
     * Gets the next node
     * 
     * @return node after this node
     */
    public Node<T> getNext()
    {
        return nextNode;
    }


    /**
     * Gets the previous node
     * 
     * @return node before this node
     */
    public Node<T> getPrev()
    {
        return prevNode;
    }


    /**
     * Set node to data
     * 
     * @param data
     *            the data
     */
    public void setData(T data)
    {
        this.data = data;
    }


    /**
     * Set next node
     * 
     * @param node
     *            yknow?
     */
    public void setNext(Node<T> node)
    {
        this.nextNode = node;
    }


    /**
     * Set prev node
     * 
     * @param node
     *            yknow?
     */
    public void setPrevious(Node<T> node)
    {
        this.prevNode = node;
    }

}
