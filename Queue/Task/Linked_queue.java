package Queue.Task;

/**
 * Queue implemented as a circular doubly linked list with a sentinel head node.
 *
 * The sentinel removes edge-case handling for first/last nodes: every real node
 * always has both a next and a previous neighbour, even in a 1-element queue.
 */
public class Linked_queue implements Queue {

    private static class Node { // One link in the chain

        Object data;
        Node next = this; // Self-pointing by default: a lone node is its own neighbour
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
    private Node head = new Node(null); // Sentinel: never holds real data, marks the boundary of the list

    public int size() {
        return size;
    }

    public void add(Object object) { // Enqueue at the tail (the node just before the sentinel)
        size++;
        head.previous.next = new Node(object, head, head.previous); // New node links forward to sentinel, backward to old tail
        head.previous = head.previous.next; // Sentinel's backward link now lands on the new tail
    }

    public Object first() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        return head.next.data; // First real node sits right after the sentinel
    }

    public Object remove() { // Dequeue from the front — that's what makes it FIFO
        if (size == 0) throw new IllegalStateException("Queue is empty");
        size--;
        Object temp = head.next.data; // Save the value before unlinking the node
        head.next = head.next.next; // Sentinel skips over the removed node
        head.next.previous = head; // New front node's backward link re-attaches to the sentinel
        return temp;
        // Also correct when the queue becomes empty: both links then point back to the sentinel itself
    }

    public String toString() { // Return a string representation of the queue's contents
        StringBuilder sb = new StringBuilder();
        sb.append("'");

        Node current = head.next;
        while(current != head){
            sb.append(current.data);
            if(current.data != head){
                sb.append(",");
            }
            current = current.next;
        }
        sb.append("'");
        return sb.toString();
    }

    public int sum(){ // Calculate the sum of all elements in the queue
        if (size == 0) throw new IllegalStateException("Queue is empty");
        int sum = 0;
        Node current = head.next;
        while (current != head) {
            sum += (int) current.data; // Assuming the data is of type Integer
            current = current.next;
        }
        return sum;
    }

    public boolean equal(Linked_queue other){ // Check if two queues are equal
        if(this.size != other.size){
            return false;
        }
        Node current1 = this.head.next;
        Node current2 = other.head.next;

        while(current1 != head){
            if(! current1.data .equals(current2.data)){
                return false;
            }
            current1 = current1.next;
            current2 =  current2.next;
        }
        return true;
    }

    public Object[] toArray() { // Convert the queue to an array representation
        Object[] arr = new Object[size];
        Node current = head.next;
        int i = 0;
        while (current != head) {
            arr[i++] = current.data;
            current = current.next;
        }
        return arr;
    }



}
