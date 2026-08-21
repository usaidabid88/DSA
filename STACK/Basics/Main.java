package STACK.Basics;

public class Main {
    
    public static void main(String[] args) {
        // Create an instance of Array_stack with a capacity of 5
        System.out.println("Testing Array_stack implementation:");
        Array_stack arrayStack = new Array_stack(5);
        
        // Push elements onto the stack
        arrayStack.push("Element 1");
        arrayStack.push("Element 2");
        arrayStack.push("Element 3");
        
        // Peek at the top element
        System.out.println("Top element (peek): " + arrayStack.peek());
        
        // Pop an element from the stack
        System.out.println("Popped element: " + arrayStack.pop());
        
        // Check the size of the stack
        System.out.println("Current stack size: " + arrayStack.size());
        
        // Check if the stack is empty
        System.out.println("Is stack empty? " + arrayStack.isEmpty());

        // Create an instance of Linked_stack
        System.out.println("\nTesting Linked_stack implementation:");
        Linked_stack linkedStack = new Linked_stack();

        // Push elements onto the linked stack
        linkedStack.push("Element 1");
        linkedStack.push("Element 2");
        linkedStack.push("Element 3");

        // Peek at the top element
        System.out.println("Top element (peek): " + linkedStack.peek());

        // Pop an element from the linked stack
        System.out.println("Popped element: " + linkedStack.pop());

        // Check the size of the linked stack
        System.out.println("Current stack size: " + linkedStack.size());

    }
}
