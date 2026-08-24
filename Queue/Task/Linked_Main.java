package Queue.Task;

/**
 * Simple test driver for Linked_queue.
 *
 * Expected output is written next to each print, so a wrong result
 * is obvious at a glance when the file is re-run after changes.
 */
public class Linked_Main {

    public static void main(String[] args) {
        Linked_queue Credit = new Linked_queue();

        Linked_queue debit = new Linked_queue();


        Credit.add(44);
        Credit.add(78);
        Credit.add(385);

        debit.add(78);
        debit.add(27);
        debit.add(30);
        debit.add(11);
        debit.add(29);

        System.out.println("sum of the Credit queue: " + Credit.sum());
        System.out.println("sum of the debit queue: " + debit.sum());

        if(Credit.sum() > debit.sum()){
            System.out.println("Credit is greater than debit");
        } else if(Credit.sum() < debit.sum()){
            System.out.println("debit is greater than Credit");
        } else {
            System.out.println("Credit and debit are equal");
        }

        // System.out.println("Size of the queue: " + Credit.size()); // Size of the queue: 3
        // System.out.println("First element in the queue: " + Credit.first()); // First element in the queue: 1
        // System.out.println("Removed element from the queue: " + Credit.remove()); // Removed element from the queue: 1
        // System.out.println("Size of the queue after removal: " + Credit.size()); // Size of the queue after removal: 2
    }

}
