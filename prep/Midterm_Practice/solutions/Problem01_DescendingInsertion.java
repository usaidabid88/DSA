package prep.Midterm_Practice.solutions;

// Problem 1: Inserts values into a singly linked list in descending order (largest to smallest)
public class Problem01_DescendingInsertion {

    // Node definition with value and pointer to the next node
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Inserts a new node such that descending order is maintained
    static Node insertDescending(Node start, int value) {
        // If list is empty or the new value is greater than the current head
        if (start == null || start.data < value) {
            return new Node(value, start);
        }

        // Traverse to find the correct insertion position
        Node current = start;
        while (current.next != null && current.next.data >= value) {
            current = current.next;
        }

        // Insert new node after 'current'
        current.next = new Node(value, current.next);
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
        Node start = null;
        int[] values = {15, 40, 5, 30, 20, 10};

        // Insert elements in descending order
        for (int value : values) {
            start = insertDescending(start, value);
        }

        printList(start);
    }
}
