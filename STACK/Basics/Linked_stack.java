package STACK.Basics;

public class Linked_stack implements Stack {

    private int size; // Variable to keep track of the size of the stack
    private Node top; // Variable to keep track of the top node of the stack

    public int size(){
        return size; // Return the current size of the stack
    }

    public Object peek() {
        return top.data; // Return the data of the top node without removing it
    }  
    
    public void push(Object obj){
        top = new Node(obj, top); // Create a new node with the object and set it as the new top
        size++; // Increment the size of the stack
    }

    public Object pop(){
        if(size ==0)throw new IllegalStateException("Stack is empty"); // Throw an exception if the stack is empty
        Object temp = top.data; // Store the data of the top node
        top = top.next; // Move the top pointer to the next node
        size--; // Decrement the size of the stack
        return temp; // Return the data of the removed top node
    }
    public static class Node{
        Object data; // Variable to store the data of the node
        Node next; // Variable to store the reference to the next node

        public Node(Object data, Node next){
            this.data = data; // Initialize the data of the node
            this.next = next; // Initialize the reference to the next node
        }
    }
}
