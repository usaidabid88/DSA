package Link_list.Basics_1;

public class Basics_3 {
    static class Node{
        private int data;
        private Node next;

        public Node(int data ){
            this.data = data;
        }

        public static void main(String[] args) {
            
            Node start = new Node(10);
            Node p = start;

            for(int i = 10; i <= 100; i +=10){
                p.next = new Node (i);
                p = p.next;
                System.out.println("YOOOOOO: " + " -> " + p.data);

            }
        }
    }
    
}
