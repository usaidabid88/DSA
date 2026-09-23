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

    static String_linkedlist insert(String_linkedlist start, String[] values) {
        String_linkedlist end = start;
        while (end != null && end.next != null) {
            end = end.next;
        }

        for (String value : values) {
            String_linkedlist node = new String_linkedlist(value);

            if (start == null) {
                start = node;
            } else {
                end.next = node;
            }

            end = node;
        }

        return start;
    }

    public static void main(String[] args) {

        String_linkedlist start = null;

        String[] names = {"ahmad", "ali", "usaid"};

        start = insert(start, names);

        while (start != null) {
            System.out.println(start.data);
            start = start.next;
        }


        

        // String_linkedlist start = new String_linkedlist("ahmad");
        // String_linkedlist p = start;
        // p.next = new String_linkedlist("ahmer");
        // p=p.next;
        // p.next= new String_linkedlist   ("usaid");
        // p= p.next;
        // for(String_linkedlist i= start;i!=null;i=i.next){
        //     System.out.println(i.data);
        // }
    }
}



