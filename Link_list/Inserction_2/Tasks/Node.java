package Link_list.Inserction_2.Tasks;

        //example of linked list with insertion, searching, merging and reversing using array by GR

public class Node {
    Integer data=null;
    Node next=null;
    public Node(){}
   public Node(int data)
    {this.data=data;}
   public Node(int data,Node next)
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

    // merging function
    public Node Merge(Node list_one,Node list_two)
    {
        Node p=list_two; // temproary storage
        while (p!=null)
        {
            list_one=Insert(list_one,p.data);
            p=p.next;
        }
        return list_one;
    }
    void main(String[] args) {
        int count=1;
        int sum=0;
        float average=0;
        boolean found= false;
        //Insertion
        Node a=null;
        a= Insert(a,5);
        a= Insert(a,10);
        a= Insert(a,15);
        a= Insert(a,20);
        a= Insert(a,25);
        a= Insert(a,30);
//traversing +counting+sum
        for (Node i=a;i!=null;i=i.next)
        {
            System.out.println("a:"+count+". "+i.data);
            sum+=i.data;
            count++;
        }
        average=sum/count;
        System.out.println("SUM of a:"+sum);
        System.out.println("AVERAGE of a:"+average);

// Saving list in array
        int[] array=new int[count];
        int index=0;
        for (Node i = a; i!=null; i=i.next)
        {
            array[index]=i.data;
            index++;
        }
  // reverse
        System.out.println("REVERSE ");
  for (int i=array.length-1;i>=0;i--)
  {
      System.out.println(array[i]);
  }
 // searching
         found=search(a,10);
        System.out.println("element 10 found "+found);

  // new node and its merging
        Node b=null;
        b= Insert(b,6);
        b= Insert(b,11);
        b= Insert(b,16);
        b= Insert(b,21);
        b= Insert(b,26);
        b= Insert(b,31);

        count=1;
        for (Node i=b;i!=null;i=i.next)
        {
            System.out.println("b:"+count+". "+i.data);
            sum+=i.data;
            count++;
        }

        System.out.println("MERGED LIST a AND b ");
  Node merged=Merge(a,b);
  for(Node i=merged;i!=null;i=i.next)
      System.out.println(i.data);
    }
}


