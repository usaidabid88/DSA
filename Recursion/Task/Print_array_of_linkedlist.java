package Recursion.Task;

// Demonstrates recursive traversal and printing of an array of linked list chains
public class Print_array_of_linkedlist {

    // Singly linked list Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Creates a linked list of length 'count' with multiples of 'multiplier'
    static Node createList(int count, int multiplier) {
        Node head = new Node(multiplier);
        Node current = head;

        for (int value = 2; value <= count; value++) {
            current.next = new Node(value * multiplier);
            current = current.next;
        }
        return head;
    }

    // Recursively prints the elements of a single linked list chain
    static void printList(Node node) {
        if (node == null) {
            System.out.println();
            return;
        }
        System.out.print(node.data + " ");
        printList(node.next); // Recursive call for the next node
    }

    // Recursively iterates through an array of linked list heads
    static void printArray(Node[] lists, int index) {
        if (index == lists.length) {
            return;
        }
        System.out.print("Index " + (index + 1) + ": ");
        printList(lists[index]);
        printArray(lists, index + 1); // Recursive call for the next index
    }

    public static void main(String[] args) {
        Node[] lists = new Node[10];

        // Populate array with dynamic linked lists
        for (int i = 0; i < lists.length; i++) {
            lists[i] = createList(i + 2, i + 1);
        }
        // Recursively print the entire array of linked lists
        printArray(lists, 0);
    }
}
