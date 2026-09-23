package Link_list.Inserction_2.Tasks;

public class SublistOfLinkedlist {
    public static void main(String[] args) {
    Node start = new Node(10);
    Node p = start;
    for(int i=2;i<=10;i++){
        p.next = new Node(i*10);
        p = p.next;
    }

    Node head = null;
    Node tail = null;

    System.out.println("Original list elements are:");
    for (Node current = start; current != null; current = current.next) {
        System.out.println(current.data);
        
        int first = 20;
        int end = 60;

        if (current.data >= first && current.data <= end) {
            Node copy = new Node(current.data);
            if (head == null) {
                head = copy;
                tail=head;
            } else {
                tail.next = copy;
                tail = copy;
            }
        }
    }

    System.out.println("Sublist elements are:");
    for (Node current = head; current != null; current = current.next) {
        System.out.println(current.data);
    }

}
}
