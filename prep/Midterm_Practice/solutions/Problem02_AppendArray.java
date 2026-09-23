package prep.Midterm_Practice.solutions;

// Problem 2: Appends an array of values to the end of a linked list, preserving original order
public class Problem02_AppendArray {

    // Node definition for the singly linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Appends all array elements sequentially to the tail of the list
    static Node appendList(Node start, int[] values) {
        Node tail = start;
        // Find existing tail if list is not empty
        while (tail != null && tail.next != null) {
            tail = tail.next;
        }

        // Append each value to the tail
        for (int value : values) {
            Node newNode = new Node(value);
            if (start == null) {
                start = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
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
        Node start = null;
        int[] values = {70, 20, 90, 10, 40};

        // Append array elements to the list
        start = appendList(start, values);
        printList(start);
    }
}
