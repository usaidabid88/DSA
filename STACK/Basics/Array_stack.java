package STACK.Basics;

public class Array_stack implements Stack{

    private int size; // Variable to keep track of the size of the stack
    private Object a[]; // Array to store the elements of the stack

    public Array_stack(int capacity){
        a = new Object[capacity]; // Initialize the array with the given capacity
    }

    public Boolean isEmpty(){
        return size == 0; // Return true if the stack is empty, false otherwise
    }

    public int size(){
        return size; // Return the current size of the stack
    }

    public Object peek(){
        if(size == 0) throw new IllegalStateException("Stack is empty"); // Throw an exception if the stack is empty
        return a[size - 1]; // Return the top element of the stack without removing it
    }

    public void push(Object obj){
        if(size == a.length) throw new IllegalStateException("Stack is full"); // Throw an exception if the stack is full
        {
            resize(); // Resize the array if needed
        }
        a[size++] = obj; // Add the object to the top of the stack and increment the size
    }

    public Object pop(){
        if(size == 0) throw new IllegalStateException("Stack is empty"); // Throw an exception if the stack is empty
        Object temp = a[--size]; // Store the top element and decrement the size
        a[size] = null; // Clear the reference to the removed element
        return temp; // Return the removed element
    }

    void resize(){
        Object[] aa = new Object[a.length * 2]; // Create a new array with double the capacity
        System.arraycopy(a, 0, aa, 0, a.length); // Copy the elements from the old array to the new array
        a = aa; // Update the reference to point to the new array
    }

    
}
