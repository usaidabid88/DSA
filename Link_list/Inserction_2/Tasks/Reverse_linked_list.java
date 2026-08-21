package Link_list.Inserction_2.Tasks;

                //progream to reverse a linked list using array

public class Reverse_linked_list {

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
    static Node InsertList(Node start, int[] values) {      // Method to insert an array of values into the linked list
        for (int value : values) {
            start = insert(start, value);
        }
        return start;
    }
    public static void main(String[] args) {

        Node start = null;
        int[] firstList = { 50, 40, 30, 20, 10 };
        start = InsertList(start, firstList);

        // compute size
        int size = 0;
        for (Node n = start; n != null; n = n.next) size++;

        int[] array = new int[size];
        int index = 0;
        for (Node i = start; i != null; i = i.next) {
            array[index] = i.data;
            index++;
        }

        // reverse
        System.out.println("REVERSE ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

   