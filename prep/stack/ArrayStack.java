package prep.stack;

// Array-backed dynamic Stack implementation with resizing and utility methods
public class ArrayStack implements Stack {

    private Object[] a; // Internal storage buffer
    private int size;   // Number of elements in the stack

    // Constructor initializing buffer capacity
    public ArrayStack(int capacity) {
        a = new Object[capacity];
    }

    // Checks if the stack has no elements
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns current number of elements
    public int size() {
        return size;
    }

    // Retrieves top element without removing it
    public Object peek() {
        if (size == 0) throw new IllegalStateException("Stack is empty");
        return a[size - 1];
    }

    // Pushes element onto top, dynamically resizing buffer when full
    public void push(Object obj) {
        if (size == a.length) {
            resize();
        }
        a[size++] = obj;
    }

    // Removes and returns top element
    public Object pop() {
        if (size == 0) throw new IllegalStateException("Stack is empty");
        Object temp = a[--size];
        a[size] = null;
        return temp;
    }

    // Doubles internal buffer capacity using System.arraycopy
    void resize() {
        Object[] aa = new Object[a.length * 2];
        System.arraycopy(a, 0, aa, 0, a.length);
        a = aa;
    }

    // Retrieves and removes the last element
    public Object getlast() {
        if (size == 0) throw new IllegalStateException("stack is empty");
        return a[size--];
    }

    // Finds the minimum integer element in the stack
    public Object getmin() {
        if (size == 0) throw new RuntimeException("satck is empty");
        int min = (int) a[0];
        for (int i = 0; i < size; i++) {
            int val = (int) a[i];
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    // Finds the maximum integer element in the stack
    public Object getmax() {
        if (size == 0) throw new RuntimeException("stack is empty");
        int max = (int) a[0];
        for (int i = 0; i < size; i++) {
            int val = (int) a[i];
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    // Retrieves middle element in the stack
    public Object getmid() {
        if (size == a.length / 2) throw new IllegalStateException("satck is empty");
        return a[size - 1];
    }

    // Splits the stack into a second stack holding half the elements
    public Object split() {
        int totalsize = this.size;
        int halfsize = totalsize / 2;

        ArrayStack secound = new ArrayStack(totalsize);

        for (int i = 0; i < halfsize; i++) {
            Object value = this.pop();
            secound.push(value);
        }
        return secound;
    }

    // Checks equality of two ArrayStack instances
    public boolean equal(ArrayStack other) {
        if (this.size() != other.size()) {
            return false;
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.a[i] != other.a[i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        for (int i = 0; i < size; i++) {
            sb.append(a[i]);
            if (i < size - 1) {
                sb.append(" , ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayStack Stack = new ArrayStack(15);

        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int values : value) {
            Stack.push(values);
        }

        System.out.println("All elements = " + Stack);
        System.out.println("size = " + Stack.size());
        System.out.println("peek = " + Stack.peek());
        System.out.println("last element = " + Stack.getlast());
        System.out.println("middle element = " + Stack.getmid());
        System.out.println("minimum element = " + Stack.getmin());
        System.out.println("maximum element = " + Stack.getmax());
        System.out.println("split = " + Stack.split());
        System.out.println("pop = " + Stack.pop());

        ArrayStack Stack2 = new ArrayStack(15);
        int[] value2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int values : value2) {
            Stack2.push(values);
        }
        System.out.println("Are the two stacks equal? " + Stack.equal(Stack2));
    }
}
