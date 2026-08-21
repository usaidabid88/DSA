package Link_list.Delection_3;

public class Basics_1 {
    int data;
    Basics_1 next;

    public Basics_1(int data) {
        this.data = data;
    }
    public Basics_1(int data, Basics_1 next) {
        this.data = data;
        this.next = next;
    }

     Basics_1 insert(Basics_1 start, int x) {     // method containing the rules for inserting element into the linked list
        if (start == null || start.data > x) {
            return new Basics_1(x, start);
        }

        Basics_1 p = start;
        while (p.next != null && p.next.data < x) {
            p = p.next;
        }

        p.next = new Basics_1(x, p.next);
        return start;
    }

    Basics_1 delete (Basics_1 start, int x){
        if(start == null || start.data > x)
            return start;
        if(start.data == x )
            return start.next;
        for(Basics_1 i = start; i.next != null; i = i.next){
            if(i.data > x)
                break;
            if(i.next.data == x){
                i.next = i.next.next;
                break;
            }
        }
        return start;
    }
    
    // Helper to print list contents
     static void printList(Basics_1 start) {
        Basics_1 p = start;
        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println("null");
    }

    // Simple test driver demonstrating sorted insertion and deletion
    public void main(String[] args) {
        Basics_1 helper = new Basics_1(0); // helper instance to call instance methods
        Basics_1 Node = null;

        

        // build a sorted list
        Node = helper.insert(Node, 10);
        Node = helper.insert(Node, 20);
        Node = helper.insert(Node, 30);
        Node = helper.insert(Node, 40);
        Node = helper.insert(Node, 50);

        System.out.println("Original sorted list:");
        printList(Node);

        // delete head
        Node = helper.delete(Node, 10);
        System.out.println("After deleting head (10):");
        printList(Node);

        // delete middle
        Node = helper.delete(Node, 30);
        System.out.println("After deleting 30:");
        printList(Node);

        // attempt delete missing value
        Node = helper.delete(Node, 99);
        System.out.println("After attempting to delete 99 (not present):");
        printList(Node);

        // delete last
        Node = helper.delete(Node, 50);
        System.out.println("After deleting last (50):");
        printList(Node);
    }
    
}
