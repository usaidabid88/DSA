package Queue.Basics;

public class Array_Main {

    public static void main(String[] args) {

        // Create an array-backed queue with capacity 10
        Array_queue queue = new Array_queue(10);

        // Enqueue three elements (FIFO order: 1 → 2 → 3)
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Inspect the queue state
        System.out.println("Size of the queue: " + queue.size());                   // 3
        System.out.println("First element in the queue: " + queue.first());         // 1
        System.out.println("Removed element from the queue: " + queue.remove());    // 1
        System.out.println("Size of the queue after removal: " + queue.size());     // 2
    }

}
