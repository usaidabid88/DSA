package Link_list.Inserction_2.Tasks;

        //code to create a linked list of strings

public class String_linkedlist {

    private String data;
    private String_linkedlist next;



    public String_linkedlist(String data){
        this.data = data;
    }
    public String_linkedlist(String data , String_linkedlist next){
        this.data = data;
        this . next = next;
    }

    

    public static void main(String[] args) {
        String_linkedlist start = new String_linkedlist("ahmad");
        String_linkedlist p = start;
        p.next = new String_linkedlist("ahmer");
        p=p.next;
        p.next= new String_linkedlist   ("usaid");
        p= p.next;
        for(String_linkedlist i= start;i!=null;i=i.next){
            System.out.println(i.data);
        }
    }
}



