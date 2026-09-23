package prep.stack;

// Dynamic Linked-Node Stack implementation with min/max, middle lookup, splitting and sorting
public class LinkedStack implements Stack {

    // Node class storing data and pointer to next node below it
    public static class Node {
        Object data;
        Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size; // Number of elements in the stack
    private Node top; // Pointer to top node

    // Returns current number of elements
    public int size() {
        return size;
    }

    // Retrieves top element without removing it
    public Object peek() {
        return top.data;
    }

    // Pushes element onto top of the stack in O(1) time
    public void push(Object obj) {
        top = new Node(obj, top);
        size++;
    }

    // Pops and returns top element in O(1) time
    public Object pop() {
        if (size == 0) throw new IllegalStateException("Stack is empty");
        Object temp = top.data;
        top = top.next;
        size--;
        return temp;
    }

    // Checks if the stack is empty
    public boolean isempty() {
        return size == 0;
    }

    // Retrieves bottom-most (last) element in the stack
    public Object getLast() {
        if (top == null) throw new IllegalStateException("Stack is empty");
        Node current = top;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    // Finds minimum element in the stack
    public Object getmin() {
        if (top == null) throw new RuntimeException("stack is empty");
        int min = (int) top.data;
        Node current = top.next;
        while (current != null) {
            int val = (int) current.data;
            if (val < min) {
                min = val;
            }
            current = current.next;
        }
        return min;
    }

    // Finds maximum element in the stack
    public Object getmax() {
        if (top == null) throw new RuntimeException("stack is empty");
        int max = (int) top.data;
        Node current = top.next;
        while (current != null) {
            int val = (int) current.data;
            if (val > max) {
                max = val;
            }
            current = current.next;
        }
        return max;
    }

    // Finds middle element using two-pointer (slow/fast) technique
    public Object getmid() {
        if (top == null) throw new IllegalStateException("Stack is empty");
        Node slow = top;
        Node fast = top;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    // Sorts stack elements using an auxiliary temporary stack
    public static void sortStack(LinkedStack stack) {
        LinkedStack sortedstack = new LinkedStack();
        while (!stack.isempty()) {
            int value = (int) stack.pop();
            while (!sortedstack.isempty() && (int) sortedstack.peek() > value) {
                stack.push(sortedstack.pop());
            }
            sortedstack.push(value);
        }
        while (!sortedstack.isempty()) {
            stack.push(sortedstack.pop());
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        Node current = top;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }

    // Splits stack into half using an auxiliary second stack
    public LinkedStack split(LinkedStack stack) {
        int totalsize = this.size();
        int halfsize = totalsize / 2;

        LinkedStack secondhalf = new LinkedStack();
        for (int i = halfsize; i != totalsize; i++) {
            Object value = this.pop();
            secondhalf.push(value);
        }
        System.out.println(stack);
        return null;
    }

    // Checks equality of two LinkedStack instances
    public boolean equal(LinkedStack other) {
        if (this.size() != other.size()) {
            return false;
        }
        Node current1 = this.top;
        Node current2 = other.top;

        while (current1 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int[] values = {5, 15, 25, 35, 45};

        for (int value : values) {
            stack.push(value);
        }

        System.out.println("size = " + stack.size());
        System.out.println("top = " + stack.peek());
        System.out.println("last = " + stack.getLast());
        System.out.println("min = " + stack.getmin());
        System.out.println("max = " + stack.getmax());
        System.out.println("mid = " + stack.getmid());

        System.out.println("split = " + stack.split(stack));

        LinkedStack stack2 = new LinkedStack();
        int[] values2 = {10, 20, 30, 5, 15, 25, 35, 45};
        for (int value : values2) {
            stack2.push(value);
        }

        System.out.println("equal = " + stack.equal(stack2));
    }
}
