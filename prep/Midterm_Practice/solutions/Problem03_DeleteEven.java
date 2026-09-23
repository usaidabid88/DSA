package prep.Midterm_Practice.solutions;

// Problem 3: Deletes all even-valued nodes from a singly linked list
public class Problem03_DeleteEven {

    // Node definition with constructor
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Removes all nodes containing even values and returns the new head
    static Node deleteEven(Node start) {
        // Remove leading even-valued nodes from the head
        while (start != null && start.data % 2 == 0) {
            start = start.next;
        }

        // Remove intermediate and trailing even-valued nodes
        Node current = start;
        while (current != null && current.next != null) {
            if (current.next.data % 2 == 0) {
                current.next = current.next.next; // Bypass even node
            } else {
                current = current.next;
            }
        }
        return start;
    }

    // Helper method to traverse and print the linked list
    static void printList(Node start) {
        for (Node current = start; current != null; current = current.next) {
            System.out.print(current.data + " -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Construct initial list: 5 -> 10 -> 15 -> 20 -> 25 -> 30 -> null
        Node start = new Node(5, new Node(10, new Node(15,
                new Node(20, new Node(25, new Node(30, null))))));

        // Delete all even values
        start = deleteEven(start);
        printList(start);
    }
}
