package efresh;

import java.util.Comparator;

// -------------------------------------------------------------------------
/**
 * Just a DLL data struct, comparable to sort
 * 
 * @param <T>
 * @author alici
 * @version May 23, 2024
 */
public class DLList<T extends Comparable<T>>
    implements List<T>
{
    private int size;
    private Node<T> head;
    private Node<T> tail;

    // ----------------------------------------------------------
    /**
     * Constructor
     */
    public DLList()
    {
        size = 0;
        head = null;
        tail = null;
    }


    @Override
    public void add(T data)
    {
        Node<T> newNode;
        if (head == null)
        {
            newNode = new Node<T>(data);
            head = newNode;
            tail = newNode;
        }
        else
        {
            Node<T> currentNode = head;
            while (currentNode.getNext() != null)
            {
                currentNode = currentNode.getNext();
            }
            newNode = new Node<T>(data, currentNode);
            currentNode.setNext(newNode);
            tail = newNode;
        }
        size++;
    }


    @Override
    public void add(int index, T data)
    {
        Node<T> newNode;
        if (index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        else if (index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0)
        {
            newNode = new Node<T>(data, head, null);
            head = newNode;
            if (newNode.getNext() != null)
            {
                newNode.getNext().setPrevious(newNode);
            }

        }
        else
        {
            int count = 0;
            Node<T> currentNode = head;
            while (count + 1 < index)
            {
                currentNode = currentNode.getNext();
                count++;
            }
            newNode = new Node<T>(data, currentNode.getNext(), currentNode);
            currentNode.setNext(newNode);
            if (newNode.getNext() != null)
            {
                newNode.getNext().setPrevious(newNode);
            }
        }
        if (size == index)
        {
            tail = newNode;
        }
        size++;
    }


    @Override
    public T remove(int index)
    {
        Node<T> oldNode;
        if (index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        else if (index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0)
        {
            oldNode = head;
            head = head.getNext();
            if (head != null)
            {
                head.setPrevious(null);
            }
        }
        else
        {
            int count = 0;
            Node<T> currentNode = head;
            while (count + 1 < index)
            {
                currentNode = currentNode.getNext();
                count++;
            }
            oldNode = currentNode.getNext();
            currentNode.setNext(currentNode.getNext().getNext());
            if (currentNode.getNext() != null)
            {
                currentNode.getNext().setPrevious(currentNode);
            }
        }
        if (size == index)
        {
            tail = oldNode.getPrev();
        }
        size--;
        return oldNode.getData();
    }


    /**
     * Removes the first node in the list that contains data
     * 
     * @param data
     *            data to remove
     * @return data of node that was removed
     */
    @SuppressWarnings("null")
    public T remove(T data)
    {
        Node<T> oldNode = null;
        if (size <= 0)
        {
            throw new IndexOutOfBoundsException();
        }
        else if (head.getData().equals(data))
        {
            oldNode = head;
            head = head.getNext();
            if (head != null)
            {
                head.setPrevious(null);
            }
            size--;
        }
        else
        {
            Node<T> currentNode = head;
            while (currentNode != null && currentNode.getNext() != null)
            {
                if (currentNode.getNext().getData().equals(data))
                {
                    oldNode = currentNode.getNext();
                    currentNode.setNext(currentNode.getNext().getNext());
                    if (currentNode.getNext() != null)
                    {
                        currentNode.getNext().setPrevious(currentNode);
                    }
                    size--;
                }
                currentNode = currentNode.getNext();
            }
        }
        if (oldNode == tail)
        {
            tail = tail.getPrev();
        }
        return oldNode.getData();
    }


    @Override
    public void clear()
    {
        head = null;
        tail = null;
        size = 0;
    }


    @Override
    public T replace(int index, T data)
    {
        Node<T> newNode;
        Node<T> oldNode;
        if (index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        else if (index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0)
        {
            oldNode = head;
            newNode = new Node<T>(data, head.getNext(), null);
            head = newNode;
            newNode.getNext().setPrevious(newNode);
        }
        else
        {
            int count = 0;
            Node<T> currentNode = head;
            while (count + 1 < index)
            {
                currentNode = currentNode.getNext();
                count++;
            }
            oldNode = currentNode.getNext();
            newNode =
                new Node<T>(data, currentNode.getNext().getNext(), currentNode);

            currentNode.setNext(newNode);
            if (newNode.getNext() != null)
            {
                newNode.getNext().setPrevious(newNode);
            }
        }
        if (oldNode == tail)
        {
            tail = newNode;
        }
        return oldNode.getData();
    }


    /**
     * Get node that is at index
     * 
     * @param index
     *            which index
     * @return node at that index
     */
    public Node<T> getNodeAt(int index)
    {
        if (index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        Node<T> currentNode = head;
        while (count < index)
        {
            currentNode = currentNode.getNext();
            count++;
        }
        return currentNode;
    }


    @Override
    public T getEntry(int index)
    {
        if (index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        Node<T> currentNode = head;
        while (count < index)
        {
            currentNode = currentNode.getNext();
            count++;
        }
        return currentNode.getData();
    }


    /**
     * index of last instance of data
     * 
     * @param data
     *            the target data
     * @return index where data is last
     */
    public int lastIndexOf(T data)
    {
        int index = -1;
        int count = size - 1;
        Node<T> currentNode = tail;
        while (currentNode != null)
        {
            if (currentNode.getData().equals(data))
            {
                index = count;
            }
            count--;
            currentNode = currentNode.getPrev();
        }
        return index;
    }


    @Override
    public Object[] toArray()
    {
        Object[] output = new Object[size];
        int count = 0;
        Node<T> currentNode = head;
        while (currentNode != null)
        {
            output[count] = currentNode.getData();
            currentNode = currentNode.getNext();
            count++;
        }
        return output;
    }


    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("[");

        Node<T> currentNode = head;
        boolean gate = false;
        for (int i = 0; i < size; i++)
        {
            if (gate)
            {
                s.append(", ");
            }
            else
            {
                gate = true;
            }
            s.append(currentNode.getData().toString());
            currentNode = currentNode.getNext();
        }
        s.append("]");
        return s.toString();
    }


    @Override
    public boolean contains(T data)
    {
        Node<T> currentNode = head;
        while (currentNode != null)
        {
            if (currentNode.getData().equals(data))
            {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }


    @Override
    public int getLength()
    {
        return size;
    }


    /**
     * Get head *smirk*
     * 
     * @return head of list
     */
    public Node<T> getHead()
    {
        return head;
    }


    /**
     * Get tail *smirk*
     * 
     * @return tail of the list
     */
    public Node<T> getTail()
    {
        return tail;
    }


    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }


    /**
     * Default sort
     */
    public void sort()
    {
        if (size > 1)
        {
            DLList<T> output = new DLList<T>();
            for (int i = 0; i < size; i++)
            {
                int index = i;
                for (int j = 0; j < i; j++)
                {
                    if (output.getEntry(j).compareTo(getEntry(i)) > 0)
                    {
                        index = j;
                        break;
                    }
                }
                output.add(index, getEntry(i));
            }
            size = output.getLength();
            head = output.getHead();
            tail = output.getTail();
        }
    }


    /**
     * Sorts list based on comparator
     * 
     * @param comparator
     *            how to sort the list
     */
    public void sort(Comparator<T> comparator)
    {
        if (size > 1)
        {
            DLList<T> output = new DLList<T>();
            for (int i = 0; i < size; i++)
            {
                int index = i;
                for (int j = 0; j < i; j++)
                {
                    if (comparator.compare(output.getEntry(j), getEntry(i)) > 0)
                    {
                        index = j;
                        break;
                    }
                }
                output.add(index, getEntry(i));
            }
            size = output.getLength();
            head = output.getHead();
            tail = output.getTail();
        }
    }
}
