package Queue.Basics;

public class Array_queue implements Queue {

    private int size; // Variable to keep track of the size of the queue
    private Object a[]; // Array to store the elements of the queue
    private int front; // Index of the front element in the queue
    private int rear; // Index of the rear element in the queue

    public Array_queue(int capacity) {
        a = new Object[capacity]; // Initialize the array with the given capacity
        front = 0; // Initialize front index
        rear = 0; // Initialize rear index
    }

    public Boolean isEmpty() {
        return size == 0; // Return true if the queue is empty, false otherwise
    }

    public int size() {
        return size; // Return the current size of the queue
    }

    public Object first() {
        if (size == 0) throw new IllegalStateException("Queue is empty"); // Throw an exception if the queue is empty
        return a[front]; // Return the front element of the queue without removing it
    }

    public void add(Object obj) {
        if (size == a.length) throw new IllegalStateException("Queue is full"); // Throw an exception if the queue is full
        a[rear] = obj; // Add the object to the rear of the queue
        rear = (rear + 1) % a.length; // Update rear index in a circular manner
        size++; // Increment the size of the queue
    }

    public Object remove() {
        if (size == 0) throw new IllegalStateException("Queue is empty"); // Throw an exception if the queue is empty
        Object temp = a[front]; // Store the front element
        a[front] = null; // Clear the reference to the removed element
        front = (front + 1) % a.length; // Update front index in a circular manner
        size--; // Decrement the size of the queue
        return temp; // Return the removed element
    } 
}
