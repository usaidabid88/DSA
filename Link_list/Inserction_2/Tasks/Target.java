package Link_list.Inserction_2.Tasks;

public class Target {

    Integer data=null;
    Node next=null;

    public Target(){}

    public Target(int data){
    this.data=data;
    }

   public Target(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }

    public Node Insert(Node start,int x)
    {
        if(start==null || start.data>x)
        {   start=new Node(x,start);
            return start;
        }
        Node p=start;
        while (p.next!=null)
        {
            if(p.next.data>x)
                break;
            p=p.next;
        }
        p.next=new Node(x,p.next);
        return start;
    }
    boolean search(Node a,int target)
    { for (Node i=a;i!=null;i=i.next)//loop for traversing
        {
            if(target==i.data)
                return true;
        }
        return false;
        
    }
    Node insertList(Node start, int[] values) {      // Method to insert an array of values into the linked list
        for (int value : values) {
            start = Insert(start, value);
        }
        return start;
    }
    void main(String[] args) {
        Node start =null;
        int [] firstList={50,40,30,20,10};
        start = insertList(start,firstList);



        boolean found=search(start,10);
        System.out.println("element 10 found "+found);

        

    }
    
}
