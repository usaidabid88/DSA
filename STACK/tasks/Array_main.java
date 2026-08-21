package STACK.tasks;

public class Array_main {
    
    public static void main(String[] args) {
        // Create an instance of Array_stack with a capacity of 5
        System.out.println("Testing Array_stack implementation:");

        //first array stack
        Array_stack arrayStack1 = new Array_stack(5);

        //second array stack
        Array_stack arrayStack2 = new Array_stack(5);

        
        // Push elements onto the stack
        arrayStack1.push(4);
        arrayStack1.push(35);
        arrayStack1.push(3);
        arrayStack1.push(1);

        arrayStack2.push(4);
        arrayStack2.push(35);
        arrayStack2.push(3);
        arrayStack2.push(11);


        // Peek at the top element
        System.out.println("Top element (peek): " + arrayStack1.peek());
        
        // Pop an element from the stack
        System.out.println("Popped element: " + arrayStack1.pop());
        
        // Check the size of the stack
        System.out.println("Current stack size: " + arrayStack1.size());
        
        // Check if the stack is empty
        System.out.println("Is stack empty? " + arrayStack1.isEmpty());

        //to get last element in the array stack
        System.out.println("last element of the array stack:" + arrayStack1.getlast());

        //to get minimum element in the array stack
        System.out.println("Minimum element in the array stack: " + arrayStack1.getMin());

        //to get middle element in the array stack
        System.out.println("Middle element in the array stack: " + arrayStack1.getmid());

        // Sort the array stack
        System.out.println("Sorting the array stack...");arrayStack1.sortStack();
        System.out.println();

        // Check if the two stacks are equal
        System.out.println("Are the two stacks equal? " + arrayStack1.equal(arrayStack2));

        // Split the stack into two halves
        System.out.println("after spliting " + arrayStack1.split());


        



    }
}
