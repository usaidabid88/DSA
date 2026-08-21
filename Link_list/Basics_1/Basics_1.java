
public class Basics_1 {

    // Basics of linklist 
    // without any complexity 

    static class Node { // Node class to represent each element in the linked list
        private int data;
        private Node next;

        public Node(int data) { // Constructor to initialize the node with data
            this.data = data;
        }
    }

    public static void main(String[] args) { // Main method to demonstrate the linked list
        Node start = new Node(10);
        start.next = new Node(20);
        start.next.next = new Node(30);
        start.next.next.next = new Node(40);

    
            // TO PRINT NODES OF LINKED LIST
        System.out.println("Linked List: " + start.data + " -> " 
         + start.next.data + " -> " 
         + start.next.next.data + " -> " 
         + start.next.next.next.data);
    }
}