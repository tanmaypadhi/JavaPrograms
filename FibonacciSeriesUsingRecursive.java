/*
Fibonacci Series using Recursive way.......
*/

import java.util.Scanner;

public class FibonacciSeriesUsingRecursive {
    public static int fibrec(int num) {
        if (num == 0 || num == 1)
            return num;

        if (num < 0)
            throw new IllegalArgumentException("Invalid number");

        return fibrec(num - 1) + fibrec(num - 2);
    }

    public static void main(String args[]) {
        System.out.println("Enter the number to print the Fibonacci Series");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(" " + fibrec(i));
        }
    }
}
