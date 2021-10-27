/*
Find out factorial of a number using recursive.
*/

import java.util.Scanner;

public class FactorialUsingRecursive {
    public static int findFactRec(int num) {

        if (num == 0 || num == 1)
            return 1;
        if (num < 0)
            throw new IllegalArgumentException("Negative number");

        return num * findFactRec(num - 1);
    }

    public static void main (String args[]){
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Factorial of the number is " + findFactRec(num));
         //System.out.println("Factorial of the number is" +
    }
}
