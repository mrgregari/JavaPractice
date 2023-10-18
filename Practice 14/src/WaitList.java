import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * A generic implementation of a waitlist that stores elements of type E.
 *
 * @param <E> the type of elements held in the waitlist.
 */
public class WaitList<E> implements IWaitList<E> {

    protected ConcurrentLinkedQueue<E> components;

    /**
     * Constructs a new instance of WaitList with an empty queue.
     */
    public WaitList() {
        components = new ConcurrentLinkedQueue<>();
    }

    /**
     * Constructs a new instance of WaitList with elements from the provided collection.
     *
     * @param collection the collection of elements to initialize the waitlist with.
     */
    public WaitList(Collection<E> collection) {
        components = new ConcurrentLinkedQueue<>(collection);
    }

    /**
     * Returns a string representation of the WaitList object, including its components.
     *
     * @return a string representation of the WaitList.
     */
    @Override
    public String toString() {
        return "WaitList{" +
                "components=" + components +
                '}';
    }

    /**
     * Adds an element to the waitlist.
     *
     * @param element the element to be added.
     */
    @Override
    public void add(E element) {
        components.add(element);
    }

    /**
     * Removes and returns the next element from the waitlist.
     *
     * @return the removed element.
     * @throws IllegalStateException if the waitlist is empty.
     */
    @Override
    public E remove() {
        if (isEmpty()) {
            throw new IllegalStateException("The queue is empty!");
        }
        return components.remove();
    }

    /**
     * Checks if the waitlist contains the specified element.
     *
     * @param element the element to be checked.
     * @return true if the element is found in the waitlist, otherwise false.
     */
    @Override
    public boolean contains(E element) {
        boolean res = false;
        for (int i = 0; i < components.size(); i++) {
            E el = components.remove();
            if (el.equals(element)) {
                res = true;
            }
            components.add(el);
        }
        return res;
    }

    /**
     * Checks if the waitlist contains all elements from the specified collection.
     *
     * @param collection the collection of elements to be checked.
     * @return true if all elements in the collection are found in the waitlist, otherwise false.
     */
    @Override
    public boolean containsAll(Collection<E> collection) {
        ArrayList<E> al = new ArrayList<>(collection);
        for (int i = 0; i < collection.size(); i++) {
            boolean res = false;
            for (int j = 0; j < components.size(); j++) {
                E el = components.remove();
                if (el.equals(al.get(i))) {
                    res = true;
                }
                components.add(el);
            }
            if (!res) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the waitlist is empty.
     *
     * @return true if the waitlist is empty, otherwise false.
     */
    @Override
    public boolean isEmpty() {
        return components.isEmpty();
    }
}
