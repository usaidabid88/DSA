package Recursion.Task;

// Computes and prints Fibonacci numbers using direct recursion
public class Fibonacci {

    // Recursive function to calculate the nth Fibonacci number
    static int fib(int n) {
        // Base cases: F(0) = 0, F(1) = 1
        if (n <= 1) {
            return n;
        }
        // Recursive step: F(n) = F(n-1) + F(n-2)
        return fib(n - 1) + fib(n - 2);
    }

    // Iteratively calls the recursive fib() method to print the first n terms
    static void printFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int count = 50;
        printFibonacci(count);
    }
}
