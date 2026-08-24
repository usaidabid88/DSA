package Tasks;

            // print all the nodes in the linklist with a serial number

public class Task_1 {
    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node start = new Node(10);
        Node p = start;

        for (int i = 20; i <= 100; i += 10) {
            p.next = new Node(i);
            p = p.next;
        }

        int serial = 1;
        Node current = start;
        while (current != null) {
            System.out.println(serial + " -> " + current.data);
            current = current.next;
            serial++;
        }
    }
}
