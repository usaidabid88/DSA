package prep.Midterm_Practice.solutions;

// Problem 5: Merges two pre-sorted linked lists into a single consolidated sorted list
public class Problem05_MergeLists {

    // Node definition for the singly linked list
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Merges two sorted lists in O(m + n) time using a dummy head pointer
    static Node merge(Node first, Node second) {
        Node dummy = new Node(0, null); // Dummy node to simplify head handling
        Node tail = dummy;

        while (first != null && second != null) {
            if (first.data <= second.data) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes from either list
        tail.next = (first != null) ? first : second;
        return dummy.next;
    }

    // Helper method to traverse and print the linked list
    static void printList(Node start) {
        for (Node current = start; current != null; current = current.next) {
            System.out.print(current.data + " -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // List 1: 10 -> 30 -> 50 -> null
        Node first = new Node(10, new Node(30, new Node(50, null)));
        // List 2: 20 -> 40 -> 60 -> null
        Node second = new Node(20, new Node(40, new Node(60, null)));

        // Merge and print the combined sorted list
        printList(merge(first, second));
    }
}
