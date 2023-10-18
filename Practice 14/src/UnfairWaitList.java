/**
 * An implementation of a waitlist that allows for unfair removal and moving elements to the back.
 *
 * @param <E> the type of elements held in the waitlist.
 */
public class UnfairWaitList<E> extends WaitList<E> {

    /**
     * Constructs a new instance of UnfairWaitList.
     */
    public UnfairWaitList() {
        super();
    }

    /**
     * Removes the specified element from the waitlist. If the element is found,
     * it is removed from its current position, and the rest of the elements are
     * shifted accordingly. If the element is not found, no changes are made.
     *
     * @param element the element to be removed from the waitlist.
     */
    public void remove(E element) {
        boolean removed = false;
        for (int i = 0; i < components.size(); i++) {
            E el = components.remove();
            if (!removed && el.equals(element)) {
                removed = true; // i--
            } else {
                components.add(el);
            }
        }
        if (removed) {
            components.add(components.remove());
        }
    }

    /**
     * Moves the specified element to the back of the waitlist if it exists in the list.
     *
     * @param element the element to be moved to the back of the waitlist.
     */
    public void moveToBack(E element) {
        int prevSize = components.size();
        remove(element);
        if (components.size() < prevSize) {
            components.add(element);
        }
    }
}
