package STACK.tasks;

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

                //methods of our desives

    public Object getlast(){ // Method to get the last element in the linked stack
        if(top == null) throw new IllegalStateException("Stack is empty"); // Throw an exception if the stack is empty
        {
            Node current = top;
            while(current.next != null){
                current = current.next;
            }
            return  current.data; 
        }
    }

    public Object getMin(){ // Method to find the minimum element in the linked stack
        if(top == null) throw new RuntimeException("stack is empty");
        {
            int min = (int) top.data;
            Node current = top.next;
            while(current != null){
                int val = (int) current.data;
                if(val < min){
                    min = val;
                }
                current = current.next;
            }
            return min;
        }

    }

    public Object getmid(){ // Method to get the middle element in the linked stack
        if(top == null) throw new IllegalStateException("Stack is empty"); // Throw an exception if the stack is empty
        {
            Node slow = top;
            Node fast = top;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data; // Return the data of the middle node
        }
    }

    public static void sortStack(Stack stack) { // Method to sort the linked stack
    Stack tempStack = new Linked_stack();
    // or: Stack tempStack = new Linked_stack();
    // works either way, since both implement Stack

    while (stack.size() != 0) {
        Object popped = stack.pop();
        int temp = (int) popped;

        while (tempStack.size() != 0 && (int) tempStack.peek() > temp) {
            stack.push(tempStack.pop());
        }
        tempStack.push(temp);
    }

    // Move sorted elements back into the original stack
    while (tempStack.size() != 0) {
        stack.push(tempStack.pop());
    }
    }

    @Override
    public String toString() {// Override the toString method to provide a string representation of the linked stack
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = top;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
}

    public boolean equal(Linked_stack other){ // Method to check if two linked stacks are equal

        if(this.size != other.size){ // If sizes are different, stacks are not equal
            return false;
        }
        Node current1 = this.top;// Start from the top of the first stack
        Node current2 = other.top;// Start from the top of the second stack

        while(current1 != null && current2 != null){// Traverse both stacks simultaneously

            if(current1.data != current2.data){// If data of the current nodes are different, stacks are not equal
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return true;
    }

    public Linked_stack split(){// Method to split the linked stack into two halves and return the second half as a new linked stack
        int totalsize = this.size();
        int halfsize = totalsize / 2 ;

        Linked_stack secoundStack = new Linked_stack();

        for(int i = 0; i < halfsize; i ++ ){
            Object value = this.pop();
            secoundStack.push(value);
        }
        return secoundStack; 
    } 

}



