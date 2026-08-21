package STACK.tasks;

public class Linked_main {
    public static void main(String[] args) {
        

     // Create an instance of Linked_stack
        System.out.println("\nTesting Linked_stack implementation:");
        Linked_stack linkedStack1 = new Linked_stack();

        Linked_stack linkedStack2 = new Linked_stack();

        // Push elements onto the linked stack
        int [] elements1 = {1,2,3,4,5,6,7,8,9,10};
        for (int element : elements1) {
            linkedStack1.push(element);
        }

        int [] elements2 = {1};
        for (int element : elements2) {
            linkedStack2.push(element);
        }

        
        linkedStack1.push(145);
        linkedStack1.push(2554);
        linkedStack1.push(311);
        linkedStack1.push(310);
        linkedStack1.push(3550);
        linkedStack1.push(30);
        linkedStack1.push(4);
        linkedStack1.push(40);



        // Peek at the top element
        System.out.println("Top element (peek): " + linkedStack1.peek());

        // Pop an element from the linked stack
        System.out.println("Popped element: " + linkedStack1.pop());

        // Check the size of the linked stack
        System.out.println("Current stack size: " + linkedStack1.size());

        //to get last element in the linked stack
        System.out.println("Last element in the linked stack: " + linkedStack1.getlast());

        //to get minimum element in the linked stack
        System.out.println("Minimum element in the linked stack: " + linkedStack1.getMin());

        //to get middle element in the linked stack
        System.out.println("Middle element in the linked stack: " + linkedStack1.getmid());

        // Sort the linked stack
        Linked_stack.sortStack(linkedStack1);
        System.out.println("Stack after sorting:");
        while (linkedStack1.size() > 0) {
            System.out.println(linkedStack1.pop());
        }
       
        // Check if the two stacks are equal
        System.out.println("Are the two stacks equal? " + linkedStack1.equal(linkedStack2));

        // Split the stack into two halves
        System.out.println("after spliting " + linkedStack1.split());

    }
}
