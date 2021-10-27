/*
This Program will print the Fibonacci Series: 0 1 1 2 3 5 8 13
 */

import java.util.Scanner;

public class FibonacciSeries {
    public static void findFibonacci(int n) {
        if (n == 0)
            System.out.println("Invalid number");
        if (n < 0)
            throw new IllegalArgumentException("Negative number");
        int a = 0, b = 1;
        if (n == 1)
            System.out.println(a);
        if (n == 2) {
            System.out.println(a);
            System.out.println(b);
        }
        if (n > 2) {
            System.out.println(a);
            System.out.println(b);
            for (int i = 2; i < n; i++) {
                int temp = a + b;
                System.out.println(temp);
                a = b;
                b = temp;
            }
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the number you want the Fibonacci Series to be printed");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        findFibonacci(n);
    }
}

