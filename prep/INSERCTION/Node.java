package prep.INSERCTION;

// Demonstrates singly linked list insertion, array batching, search, reverse printing, and merging
public class Node {
    private int data;
    private String data1;
    private Node next;

    public Node(int data) { // Constructor to initialize a node with an integer value
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(String data1) { // Constructor to initialize a node with a string value
        this.data1 = data1;
        this.next = null;
    }

    public Node(String data1, Node next) {
        this.data1 = data1;
        this.next = next;
    }

    // Method to insert a new node with value x into the linked list in sorted order
    static Node insert(Node start, int x) {
        if (start == null || start.data > x) {
            return new Node(x, start);
        }
        Node p = start;

        while (p.next != null && p.next.data < x) {
            p = p.next;
        }
        p.next = new Node(x, p.next);
        return start;
    }

    // Method to insert an array of values into the linked list
    static Node insertlist(Node start, int[] value) {
        for (int values : value) {
            start = insert(start, values);
        }
        return start;
    }

    // Method to print the linked list of integers
    static void printint(Node start) {
        while (start != null) {
            System.out.print(start.data + " -> ");
            start = start.next;
        }
        System.out.println("null");
    }

    // Method to print the linked list of strings
    static void printstring(Node start) {
        while (start != null) {
            System.out.print(start.data1 + " -> ");
            start = start.next;
        }
        System.out.println("null");
    }

    // Method to search for a target value in the linked list
    boolean search(Node current, int target) {
        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to print the linked list in reverse order using recursion
    static void printreverse(Node start) {
        if (start == null) {
            return;
        }
        printreverse(start.next);
        System.out.print(start.data + " ");
    }

    // Method to merge two linked lists into a new linked list
    static void meargelist(Node start1, Node start2) {
        Node mergedlist = null;

        Node temp1 = start1;
        while (temp1 != null) {
            mergedlist = insert(mergedlist, temp1.data);
            temp1 = temp1.next;
        }
        Node temp2 = start2;
        while (temp2 != null) {
            mergedlist = insert(mergedlist, temp2.data);
            temp2 = temp2.next;
        }
        printint(mergedlist);
    }

    public static void main(String[] args) {
        Node start = null;
        int[] values = {10, 20, 30, 40, 50};

        start = insert(start, 25);
        start = insertlist(start, values);
        printint(start);

        int serial = 0;
        int sum = 0;
        Node temp = start;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
            serial++;
        }
        System.out.println("Average of the linked list: " + sum / serial);

        Node temp1 = start;
        while (temp1 != null) {
            if (temp1.data % 2 == 0) {
                System.out.println("Even number: " + temp1.data);
            } else {
                System.out.println("Odd number: " + temp1.data);
            }
            temp1 = temp1.next;
        }

        Node head = null;
        Node tail = null;
        for (Node current = start; current != null; current = current.next) {
            int first = 20;
            int end = 40;

            if (current.data >= first && current.data <= end) {
                Node copy = new Node(current.data);
                if (head == null) {
                    head = copy;
                    tail = head;
                } else {
                    copy = tail.next;
                    tail = copy;
                }
                current = current.next;
            }
        }

        printint(head);

        String[] values2 = {"ali", "usaid", "sami", "asfasdfs", "bdshbshadsad"};
        Node start2 = null;
        for (String value : values2) {
            start2 = new Node(value, start2);
        }
        printstring(start2);

        System.out.println(new Node(0).search(start, 30));

        printreverse(start);
        System.out.print("\n");

        int[] merge1 = {10, 20, 30, 40, 50};
        int[] merge2 = {15, 25, 35, 45, 55};

        Node mergeStart1 = insertlist(null, merge1);
        Node mergeStart2 = insertlist(null, merge2);
        meargelist(mergeStart1, mergeStart2);
    }
}
