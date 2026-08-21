package Link_list.Delection_3.Tasks;

        //dividing the linked list in to two parts using array 

public class Dividing {

    int data;
    Dividing next;
    public Dividing(int data) {
        this.data = data;
    }
    public Dividing(int data, Dividing next) {
        this.data = data;
        this.next = next;
    }
    
    Dividing insert(Dividing start, int x) {     // method containing the rules for inserting element into the linked list
        if (start == null || start.data > x) {
            return new Dividing(x, start);
        }

        Dividing p = start;
        while (p.next != null && p.next.data < x) {
            p = p.next;
        }

        p.next = new Dividing(x, p.next);
        return start;
    }

    void printList(Dividing start) {
        Dividing p = start;
        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Dividing Node = new Dividing(0); // helper instance to call instance methods
        Dividing start = null;
        start = Node.insert(start, 10);
        start = Node.insert(start, 20);
        start = Node.insert(start, 30);
        start = Node.insert(start, 40);
        start = Node.insert(start, 50);
        start = Node.insert(start, 60);

        int[] array = new int[6];
        int index = 0;
        for (Dividing i = start; i != null; i = i.next) {
            array[index++] = i.data;
        }

        int mid = array.length / 2;

        Dividing firsthalf = null;
        Dividing secoundhalf = null;

        for (int j = 0; j < mid; j++) {
            firsthalf = Node.insert(firsthalf, array[j]);
        }

        for (int j = mid; j < array.length; j++) {
            secoundhalf = Node.insert(secoundhalf, array[j]);
        }

        System.out.println();
        Node.printList(firsthalf);
        Node.printList(secoundhalf);

        
    } 
}
