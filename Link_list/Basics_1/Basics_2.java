package Link_list.Basics_1;
public class Basics_2 {

    static class Node {

         int data;
         Node next;

        public Node (int data ){
            this .data = data;
        }
        public static void main(String[] args) {
            
            Node start = new Node (10);
            Node p = start;

            p.next = new Node(20);
            p = p.next;

            p.next = new Node (30);
            p = p.next;
            
            System.out.println("Linked List: " + start.data + " -> "
            + start.next.data + " -> " + start.next.next.data);

        }   
    } 
    
}
