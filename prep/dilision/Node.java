package prep.dilision;

// Demonstrates singly linked list deletion and node replacement operations
public class Node {
    private int data;
    private Node next;

    public Node(int data) { // Constructor to initialize a node with an integer value
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) { // Constructor to initialize a node with an integer value and a reference to the next node
        this.data = data;
        this.next = next;
    }

    // Deletes the first occurrence of node with value x in a sorted list
    Node delete(Node start, int x) {
        if (start == null || start.data > x)
            return start;
        if (start.data == x)
            return start.next;
        for (Node i = start; i.next != null; i = i.next) {
            if (i.data > x)
                break;
            if (i.next.data == x) {
                i.next = i.next.next;
                break;
            }
        }
        return start;
    }

    // Replaces the first occurrence of value x with newVal in a sorted list
    Node replace(Node start, int x, int newVal) {
        if (start == null || start.data > x)
            return start;
        if (start.data == x) {
            start.data = newVal;
            return start;
        }
        for (Node i = start; i.next != null; i = i.next) {
            if (i.data > x)
                break;
            if (i.next.data == x) {
                i.next = newVal;
                break;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Node start = new Node(10);
        Node p = start;
        for (int i = 2; i <= 10; i++) {
            p.next = new Node(i * 10);
            p = p.next;
        }

        int x = 50;
        start = start.delete(start, x);
        System.out.println();

        for (Node current = start; current != null; current = current.next) {
            System.out.print(current.data + " -> ");
        }

        int y = 30;
        int z = 300;
        start = start.replace(start, y, z);
        System.out.println();

        for (Node current = start; current != null; current = current.next) {
            System.out.print(current.data + " -> ");
        }
    }
}
