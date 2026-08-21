package Link_list.Inserction_2.Tasks;

            //code to print even numbers in the linked list

public class Print_even{
    static class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;

        }
        public Node (int data , Node next ){
            this.data = data;
            this.next = next;
        }
    }
    static Node insert(Node start , int x){
        if(start == null || start.data > x){
            return new Node(x , start);
        }
        Node p = start;
        while(p.next != null && p.next.data < x){
            p = p.next;
        }
        p.next = new Node(x, p.next);
        return start;
    }
    
    public static void main(String[] args) {
        Node start = null;
        int[] values = {50, 40, 30, 20, 10};

        for(int value : values){
            start = insert(start , value);
        }

        Node temp = start;
        System.out.println("Even numbers in the linked list: ");
        while(temp != null){
            if(temp.data % 2 == 0){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }


    }
}
