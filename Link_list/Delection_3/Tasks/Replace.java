package Link_list.Delection_3.Tasks;

public class Replace {

    int data ;
    Replace next;

    public Replace(int data) {
        this.data = data;
    }
    public Replace(int data, Replace next) {
        this.data = data;
        this.next = next;
    }

    Replace insert(Replace start, int x) {     // method containing the rules for inserting element into the linked list
        if (start == null || start.data > x) {
            return new Replace(x, start);
        }

        Replace p = start;
        while (p.next != null && p.next.data < x) {
            p = p.next;
        }

        p.next = new Replace(x, p.next);
        return start;
    }

    Replace replace(Replace start, int x, int newVal){
    if(start == null || start.data > x)
        return start;
    if(start.data == x){
        start.data = newVal;
        return start;
    }
    for(Replace i = start; i.next != null; i = i.next){
        if(i.data > x)
            break;
        if(i.next.data == x){
            i.next.data = newVal;
            break;
        }
    }
    return start;
}

public static void main(String[] args) {
    Replace Node = new Replace(0); // helper instance to call instance methods
    Replace start = null;
    start = Node.insert(start, 10);
    start = Node.insert(start, 20);
    start = Node.insert(start, 30);
    start = Node.insert(start, 40);
    start = Node.insert(start, 50);

    start = Node.replace(start, 30, 100);

    for (Replace i = start; i != null; i = i.next) {
        System.out.print(i.data + " -> ");
    }
    System.out.println("null");

}
}
