package prep.Queue;

// Circular Doubly Linked Queue implementation using a dummy Sentinel Node
public class LinkedQueue implements Queue {

    // Doubly linked node storing data and bidirectional references
    private static class Node {
        Object data;
        Node next = this;
        Node previous = this;

        Node(Object data) {
            this.data = data;
        }

        Node(Object data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }

    private int size;
    // Dummy Sentinel Node where head.next = head and head.previous = head initially
    private Node head = new Node(null);

    // Returns current number of elements
    public int size() {
        return size;
    }

    // Enqueues an element to the rear of the queue in O(1) time
    public void add(Object object) {
        size++;
        head.previous.next = new Node(object, head, head.previous);
        head.previous = head.previous.next;
    }

    // Peeks at the front element
    public Object first() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        return head.next.data;
    }

    // Dequeues and returns the front element in O(1) time
    public Object remove() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        size--;
        Object temp = head.next.data;
        head.next = head.next.next;
        head.next.previous = head;
        return temp;
    }

    // String representation of the queue
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");

        Node current = head.next;
        while (current != head) {
            sb.append(current.data);
            if (current.data != head) {
                sb.append(",");
            }
            current = current.next;
        }
        sb.append(" ");
        return sb.toString();
    }

    // Checks structural and element equality with another LinkedQueue
    public boolean equal(LinkedQueue other) {
        if (this.size != other.size) {
            return false;
        }

        Node current1 = this.head.next;
        Node current2 = other.head.next;

        while (current1 != head) {
            if (!current1.data.equals(current2.data)) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return true;
    }

    // Converts queue contents to an Object array
    public Object[] toarray() {
        Object[] arr = new Object[size];
        Node current = head.next;
        int i = 0;
        while (current != head) {
            arr[i++] = current.data;
            current = current.next;
        }
        return arr;
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.print("Queue: ");
        for (Object element : queue.toarray()) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Size: " + queue.size());
        System.out.println("First element: " + queue.first());
        System.out.println("Removed element: " + queue.remove());
        System.out.print("Queue after removal: ");
        for (Object element : queue.toarray()) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
