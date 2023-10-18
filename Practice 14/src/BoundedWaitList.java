import java.util.Collection;

/**
 * A bounded implementation of a waitlist with a maximum capacity.
 *
 * @param <E> the type of elements held in the waitlist.
 */
public class BoundedWaitList<E> extends WaitList<E> {

    private int capacity;

    /**
     * Constructs a new instance of BoundedWaitList with the specified capacity.
     *
     * @param capacity the maximum capacity of the waitlist.
     * @throws IllegalArgumentException if the specified capacity is not greater than 0.
     */
    public BoundedWaitList(int capacity) {
        super();
        if (capacity <= 0) {
            throw new IllegalArgumentException("Maximum capacity must be greater than 0! Received value: " + capacity);
        }
        this.capacity = capacity;
    }

    /**
     * Constructs a new instance of BoundedWaitList with the elements from the provided collection.
     *
     * @param col the collection of elements to initialize the waitlist with.
     */
    public BoundedWaitList(Collection<E> col) {
        super(col);
        this.capacity = col.size();
    }

    /**
     * Gets the maximum capacity of the waitlist.
     *
     * @return the maximum capacity.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Adds an element to the waitlist if the current size is less than the maximum capacity.
     *
     * @param element the element to be added to the waitlist.
     * @throws IllegalStateException if the waitlist is already at maximum capacity.
     */
    @Override
    public void add(E element) {
        if (components.size() == capacity) {
            throw new IllegalStateException("The queue is full!");
        }
        components.add(element);
    }

    /**
     * Returns a string representation of the BoundedWaitList object, including its capacity and elements.
     *
     * @return a string representation of the BoundedWaitList.
     */
    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", components=" + components +
                '}';
    }
}
