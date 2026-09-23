package prep.Queue;

// Interface defining standard FIFO (First-In, First-Out) Queue operations
public interface Queue {
    int size();              // Returns the number of elements in the queue
    Object first();          // Retrieves the front element without removing it
    Object remove();         // Removes and returns the front element
    void add(Object object); // Appends an element to the rear of the queue
}
