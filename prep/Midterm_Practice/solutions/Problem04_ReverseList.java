package prep.Midterm_Practice.solutions;

// Problem 4: Reverses a singly linked list in-place using iterative pointer manipulation
public class Problem04_ReverseList {

    // Node definition for the singly linked list
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // In-place iterative reversal of pointer links
    static Node reverse(Node start) {
        Node previous = null;
        Node current = start;

        while (current != null) {
            Node next = current.next; // Store next node
            current.next = previous;  // Reverse pointer
            previous = current;       // Move previous forward
            current = next;           // Move current forward
        }
        return previous; // New head of the reversed list
    }

    // Helper method to traverse and print the linked list
    static void printList(Node start) {
        for (Node current = start; current != null; current = current.next) {
            System.out.print(current.data + " -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Construct initial list: 10 -> 20 -> 30 -> null
        Node start = new Node(10, new Node(20, new Node(30, null)));

        // Reverse the list in place
        start = reverse(start);
        printList(start);
    }
}
