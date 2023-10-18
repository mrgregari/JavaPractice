import java.util.Collection;

/**
 * An interface representing a waitlist that stores elements of type E.
 *
 * @param <E> the type of elements held in the waitlist.
 */
public interface IWaitList<E> {

    /**
     * Adds an element to the waitlist.
     *
     * @param element the element to be added.
     */
    void add(E element);

    /**
     * Removes and returns the next element from the waitlist.
     *
     * @return the removed element.
     */
    E remove();

    /**
     * Checks if the waitlist contains the specified element.
     *
     * @param element the element to be checked.
     * @return true if the element is found in the waitlist, otherwise false.
     */
    boolean contains(E element);

    /**
     * Checks if the waitlist contains all elements from the specified collection.
     *
     * @param collection the collection of elements to be checked.
     * @return true if all elements in the collection are found in the waitlist, otherwise false.
     */
    boolean containsAll(Collection<E> collection);

    /**
     * Checks if the waitlist is empty.
     *
     * @return true if the waitlist is empty, otherwise false.
     */
    boolean isEmpty();
}
