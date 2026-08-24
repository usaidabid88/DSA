package Tasks;


                // sum of all the nodes in the linklist

public class Task_2 {
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

        for (int i = 10; i <= 40; i += 10) {
            p.next = new Node(i);
            p = p.next;
        }

        int sum = 0;
        Node current = start;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }

        System.out.println("Sum of all nodes = " + sum);
    }
}
