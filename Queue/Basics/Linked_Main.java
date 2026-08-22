package Queue.Basics;

/**
 * Simple test driver for Linked_queue.
 *
 * Expected output is written next to each print, so a wrong result
 * is obvious at a glance when the file is re-run after changes.
 */
public class Linked_Main {

    public static void main(String[] args) {
        Linked_queue queue = new Linked_queue();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Size of the queue: " + queue.size()); // Size of the queue: 3
        System.out.println("First element in the queue: " + queue.first()); // First element in the queue: 1
        System.out.println("Removed element from the queue: " + queue.remove()); // Removed element from the queue: 1
        System.out.println("Size of the queue after removal: " + queue.size()); // Size of the queue after removal: 2
    }

}
