package Link_list.Inserction_2.Tasks;

public class Sub_linkedlist {

    // Simple node storing an item name and the year it was established
    static class Node {
        String name;
        int year;
        Node next;

        Node(String name, int year) {
            this.name = name;
            this.year = year;
        }
    }

    // Append an item to the end of the list (basic insert)
    static Node append(Node head, String name, int year) {
        Node newNode = new Node(name, year);
        if (head == null) return newNode;
        Node t = head;
        while (t.next != null) t = t.next;
        t.next = newNode;
        return head;
    }

    // Extract a sublist by index range [fromIndex, toIndex] (0-based, inclusive)
    static Node extractSubList(Node head, int fromIndex, int toIndex) {
        if (head == null || fromIndex < 0 || toIndex < fromIndex) return null;
        Node cur = head;
        int idx = 0;
        while (cur != null && idx < fromIndex) { cur = cur.next; idx++; }
        if (cur == null) return null;

        Node subHead = null, subTail = null;
        while (cur != null && idx <= toIndex) {
            Node copy = new Node(cur.name, cur.year);
            if (subHead == null) subHead = copy; else subTail.next = copy;
            subTail = copy;
            cur = cur.next; idx++;
        }
        return subHead;
    }

    // Print list in human-friendly format: Name(year) -> ... -> null
    static void printList(Node head) {
        for (Node t = head; t != null; t = t.next) {
            System.out.print(t.name + "(" + t.year + ") -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Build the parent list using simple, explicit inserts
        Node parent = null;
        parent = append(parent, "AlphaCorp", 1990);
        parent = append(parent, "BetaLtd", 1985);
        parent = append(parent, "GammaInc", 2001);
        parent = append(parent, "DeltaLLC", 2010);
        parent = append(parent, "Epsilon", 1978);

        System.out.println("Parent list:");
        printList(parent);

        // Extract a sublist (for example, items established from index 1 to 3)
        int fromIndex = 1;
        int toIndex = 3;
        Node sub = extractSubList(parent, fromIndex, toIndex);

        System.out.println("Sub list (index " + fromIndex + " to " + toIndex + "):");
        printList(sub);
    }
}
