package Queue.Basics;

/**
 * Array-based implementation of the {@link Queue} interface.
 *
 * Uses a fixed-size circular array to store elements. The front and rear
 * indices wrap around using modular arithmetic, so the queue reuses slots
 * freed by {@code remove()} without shifting elements.
 *
 * Time complexity:
 *   - add()    : O(1)
 *   - remove() : O(1)
 *   - first()  : O(1)
 *   - size()   : O(1)
 *
 * @author usaid88
 */
public class Array_queue implements Queue {

    private int size;       // Current number of elements in the queue
    private Object a[];     // Circular array backing the queue
    private int front;      // Index of the front (oldest) element
    private int rear;       // Index of the next open slot at the back

    /**
     * Creates an empty queue with the given fixed capacity.
     *
     * @param capacity maximum number of elements the queue can hold
     */
    public Array_queue(int capacity) {
        a = new Object[capacity]; // Allocate the backing array
        front = 0;                // Both pointers start at index 0
        rear = 0;
    }

    /**
     * Checks whether the queue contains no elements.
     *
     * @return {@code true} if the queue is empty, {@code false} otherwise
     */
    public Boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of elements currently in the queue.
     *
     * @return current size of the queue
     */
    public int size() {
        return size;
    }

    /**
     * Returns the front element without removing it.
     *
     * @return the element at the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    public Object first() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        return a[front];
    }

    /**
     * Adds an element to the rear of the queue.
     * The rear index wraps around circularly when it reaches the end of the array.
     *
     * @param obj the element to enqueue
     * @throws IllegalStateException if the queue is already at full capacity
     */
    public void add(Object obj) {
        if (size == a.length) throw new IllegalStateException("Queue is full");
        a[rear] = obj;                  // Place the element at the rear slot
        rear = (rear + 1) % a.length;   // Wrap rear index circularly
        size++;
    }

    /**
     * Removes and returns the front element of the queue.
     * The front index wraps around circularly when it reaches the end of the array.
     *
     * @return the element that was at the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    public Object remove() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        Object temp = a[front];             // Save the front element
        a[front] = null;                    // Help GC by clearing the reference
        front = (front + 1) % a.length;     // Wrap front index circularly
        size--;
        return temp;
    }

}
