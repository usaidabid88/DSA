package Queue.Basics;

/**
 * Interface defining the basic operations of a queue (FIFO) data structure.
 *
 * Using an interface allows different implementations (e.g., linked list, array)
 * while providing a consistent set of methods to interact with the queue.
 */
public interface Queue {

    int size(); // Number of elements currently in the queue

    Object first(); // Returns the first element without removing it

    Object remove(); // Removes and returns the first element

    void add(Object object); // Adds an object to the end of the queue

}
