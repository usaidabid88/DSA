package Link_list.DSA_test;

public class Node_B {
    int data;
    Node_B next;

    public Node_B (int data ){
        this.data = data;
    }

    public Node_B (int data , Node_B next){
        this. data = data ;
        this.next = next;
    }
    static Node_B insert(Node_B start, int x) {     // method containing the rules for inserting element into the linked list
        if (start == null || start.data > x) {
            return new Node_B(x, start);
        }

        Node_B p = start;
        while (p.next != null && p.next.data < x) {
            p = p.next;
        }

        p.next = new Node_B(x, p.next);
        return start;
    }

    

    static Node_B insertList(Node_B start, int[] values) {      // Method to insert an array of values into the linked list
        for (int value : values) {
            start = insert(start, value);
        }
        return start;
    }


public  void main(String[] args) {
    Node_B start = null;

    int [] arr1= {1,2,3,4,5};
    int[] arr2 = { 6,7,8,9,10};

    start = insertList(start, arr1);
    start = insertList(start, arr2);

    int sum = 0;
    Node_B add = start;
    while(add != null){
        sum += add.data;
        add = add.next;
    }
    int serial = 0;
    for(Node_B a = start; a != null; a = a.next)serial++;

    System.out.println(sum/serial);
    
    
}

    
}
