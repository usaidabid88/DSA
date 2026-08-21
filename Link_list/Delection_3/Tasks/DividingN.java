package Link_list.Delection_3.Tasks;

// dividing the linked list into N parts using array

public class DividingN {

    int data;
    DividingN next;

    public DividingN(int data) {
        this.data = data;
    }

    public DividingN(int data, DividingN next) {
        this.data = data;
        this.next = next;
    }

    DividingN insert(DividingN start, int x) {
        if (start == null || start.data > x) {
            return new DividingN(x, start);
        }

        DividingN p = start;
        while (p.next != null && p.next.data < x) {
            p = p.next;
        }

        p.next = new DividingN(x, p.next);
        return start;
    }

    void printList(DividingN start) {
        DividingN p = start;
        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DividingN Node = new DividingN(0);
        DividingN start = null;
        start = Node.insert(start, 10);
        start = Node.insert(start, 20);
        start = Node.insert(start, 30);
        start = Node.insert(start, 40);
        start = Node.insert(start, 50);
        start = Node.insert(start, 60);
        // start = Node.insert(start, 70);

        int N = 3; // how many parts you want to split into

        // Step 1: convert linked list into an array
        int length = 0;
        for (DividingN i = start; i != null; i = i.next) {
            length++;
        }

        int[] array = new int[length];
        int index = 0;
        for (DividingN i = start; i != null; i = i.next) {
            array[index++] = i.data;
        }

        // Step 2: work out how big each of the N parts should be
        // base size for every part, plus the leftover elements
        // that don't divide evenly get spread across the first few parts
        int baseSize = length / N;
        int remainder = length % N;

        // Step 3: build N separate linked lists from slices of the array
        DividingN[] parts = new DividingN[N];
        int start_i = 0;

        for (int part = 0; part < N; part++) {
            // first 'remainder' parts get one extra element
            int currentSize = baseSize + (part < remainder ? 1 : 0);
            int end_i = start_i + currentSize; // exclusive

            DividingN head = null;
            for (int i = end_i - 1; i >= start_i; i--) {
                head = new DividingN(array[i], head);
            }
            parts[part] = head;

            start_i = end_i;
        }

        // Step 4: print all N parts
        for (int part = 0; part < N; part++) {
            System.out.print("Part " + (part + 1) + ": ");
            Node.printList(parts[part]);
        }
    }
}