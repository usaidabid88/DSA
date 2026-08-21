package STACK.tasks;


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

                //methods of our desives
                

    public Object getlast(){ // Method to get the last element in the array stack
        if(size == 0) throw new IllegalStateException("Stack is empty"); // Throw an exception if the stack is empty
        {
            return a[size - 1]; // Return the last element in the stack
        }
    }

    public Object getMin(){ // Method to find the minimum element in the array stack
        if(size == 0) throw new RuntimeException("stack is empty");
        {
            int min = (int) a[0];
            for(int i = 1; i < size; i++){
                int val = (int) a[i];
                if(val < min){
                    min = val;
                }
            }
            return min;
        } 
    }

    public Object getmid(){ // Method to get the middle element in the array stack
        if(size == a.length / 2) throw new IllegalStateException("Stack is empty"); // Throw an exception if the stack is empty
        {
            return a[size - 1]; // Return the last element in the stack
        }
    }

    public void sortStack() { //sort the array stack 
    // temporary array-based stack to hold sorted elements
    int[] temp = new int[size];
    int tempTop = -1; // -1 means empty, tracks top index of temp stack

    while (size != 0) {
        int popped = (int) pop(); // pop from the original stack

        // shift bigger elements from temp back into original stack
        while (tempTop != -1 && temp[tempTop] > popped) {
            push(temp[tempTop]);
            tempTop--;
        }

        // push popped element onto temp stack
        temp[++tempTop] = popped;
    }

    // move everything back from temp into the original stack
    for (int i = 0; i <= tempTop; i++) {
        push(temp[i]);
    }
}

    @Override
    public String toString() { // Override the toString method to provide a string representation of the stack
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(a[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean equal(Array_stack other){ // Method to check if two Array_stack instances are equal
        if(this.size() != other.size()){
            return false; // If sizes are different, stacks are not equal
        }
        for(int i = 0; i < this.size(); i++){
            if(this.a[i] != other.a[i]){
                return false;
            }
        }
        return true;
    }   

    public Array_stack split() { // Method to split the Array_stack into two halves and return the second half as a new Array_stack
    int totalSize = this.size;
    int halfSize = totalSize / 2;

    Array_stack secondStack = new Array_stack(totalSize); // capacity can just match original

    for (int i = 0; i < halfSize; i++) {
        Object value = this.pop();
        secondStack.push(value);
    }

    return secondStack;
}
    
}
