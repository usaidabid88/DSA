package Link_list.Inserction_2.Tasks;

                //code to merge two linked lists

public class Merge_the_Lists {

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

        Node start1 = null;
        Node start2 = null;

        int[] values1 = {50, 40, 30, 20, 10};
        int[] values2 = {55, 45, 35, 25, 15};

        for(int value : values1){
            start1 = insert(start1 , value);
        }

        for(int value : values2){
            start2 = insert(start2 , value);
        }

        Node meargedlist = null;
        
        Node temp1 = start1;
        while(temp1 != null){
            meargedlist = insert(meargedlist , temp1.data);
            temp1 = temp1.next;
        }
         Node temp2 = start2;
        while(temp2 != null){
            meargedlist = insert(meargedlist , temp2.data);
            temp2 = temp2.next;
        }
        Node temp = meargedlist;    
        System.out.println("Mearged list: ");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        
        
    }
    
}

