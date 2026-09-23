package prep.stack;

// Interface defining standard LIFO (Last-In, First-Out) Stack operations
public interface Stack {
    int size();               // Returns the number of elements in the stack
    void push(Object object); // Pushes an element onto the top of the stack
    Object pop();             // Removes and returns the top element
    Object peek();            // Retrieves the top element without removing it
}
