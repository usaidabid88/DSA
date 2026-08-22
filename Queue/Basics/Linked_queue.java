package Queue.Basics;

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

}
