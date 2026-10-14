package Recursion.Basics;

/*
        recursion is when we apply result of the proceduer to a proceduer.
        recursion method calls itself. 
        divide  problem in to sub problem of the same type as oriinal.

        advantage
            easier to reed and write
            easier to reed and debug

        disadvantage
            slower then normal loops
            uese more space 

 */

public class Basics {

    private static void walk(int steps){
        if(steps < 1)
            return;
        System.out.println("you take a step");
        walk(steps - 1);
    }

    private static void print(int n){ //print 1 to 100
        if(n == 101)
            return;
        System.out.print(n + " ");
        print(n + 1);
    }

    private static void print2(int n){  //print 100 to 1
        if(n == 0)
            return;
        System.out.print(n + " ");
        print2(n - 1);
    }

    private static int factorial(int num){ //prints factorial
        if(num < 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    private static int power(int base, int exponent){ //print expontial walues
        if(exponent < 1) return 1;
        return base * power(base , exponent - 1);
    }

    public static void table(int num, int count) { //prints table
    if (count > 10) { 
        return; 
    } 
    System.out.println(num + " x " + count + " = " + (num * count));
    table(num, count + 1);
    }

    private static int sum(int num){
        if(num < 1 ){
            return 0;
        }
        return num + sum(num - 1);
    }


    public static void main(String[] args) {
        // walk(5);
        // print(1);
        // print2(100);

        System.out.println(factorial(10));
        System.out.println(power(2,5));
        table(10, 1);
        System.out.println(sum(20));
        
    }
    
}
