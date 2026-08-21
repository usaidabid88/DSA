package Link_list.Inserction_2;

// insertion of complete list into a linked list

public class Basics_2 {

    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    static Node insert(Node start, int x) {     // method containing the rules for inserting element into the linked list
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

    static Node insertList(Node start, int[] values) {      // Method to insert an array of values into the linked list
        for (int value : values) {
            start = insert(start, value);
        }
        return start;
    }

    static void printList(Node start) {     // Method to print the linked list
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node start = null;
        int[] firstList = {50, 40, 30, 20, 10};
        int[] secondList = {39, 13, 28, 46};
        int [] thirdList = {5, 15, 25, 35, 45};

        start = insertList(start, firstList);
        start = insertList(start, secondList);
        start = insertList(start, thirdList);

        start = insert(start, 10000);
        start = insert(start, 0);

        printList(start);
    }
}
