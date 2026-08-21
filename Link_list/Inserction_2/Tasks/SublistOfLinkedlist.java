package Link_list.Inserction_2.Tasks;

public class SublistOfLinkedlist {
    private int data;
    private SublistOfLinkedlist next;

    public SublistOfLinkedlist(int data) {
        this.data = data;
    }
    public SublistOfLinkedlist(int data, SublistOfLinkedlist next) {
        this.data = data;
        this.next = next;
    }
        public static void main(String[] args) {
    SublistOfLinkedlist start = new SublistOfLinkedlist(10);
    SublistOfLinkedlist p = start;
    for(int i=2;i<=5;i++){
        p.next = new SublistOfLinkedlist(i*10);
        p = p.next;
    }
    System.out.println("Original list elements are:");
    for(SublistOfLinkedlist i=start;i!=null;i=i.next){
        System.out.println(i.data);
    }
    SublistOfLinkedlist head= null;
    SublistOfLinkedlist tail= null;

    for(SublistOfLinkedlist i=start;i!=null;i=i.next){
        if(i.data==40 || i.data==50){         //if we want every element except 10 then if(i.data!=10) or if we want every element except 10 and 20 then if(i.data!=10 && i.data!=20) and so on
            if(head==null){
                head=new SublistOfLinkedlist(i.data);
                tail=head;
            }
            else{
                tail.next=new SublistOfLinkedlist(i.data);
                tail=tail.next;
            }
        }
    }
    System.out.println("Sublist elements are:");
    for(SublistOfLinkedlist i=head;i!=null;i=i.next){
        System.out.println(i.data);
    }

}
}
