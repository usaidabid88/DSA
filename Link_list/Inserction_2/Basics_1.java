package Link_list.Inserction_2;

            //insection single eliment by element in a link lst 

public class Basics_1 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

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

    public static void main(String[] args) {
        Node start = null;
        int[] values = {50, 40, 30, 20, 10};

        for (int value : values) {
            start = insert(start, value);
        }

        start = insert(start, 39);
        start = insert(start, 13);
        start = insert(start, 28);
        start = insert(start, 46);

        Node temp = start;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        int c = 0;
        Node current = start;
        while(current != null){
                c++;
            current = current.next;}
        
        

        System.out.println(c);
    }
}

