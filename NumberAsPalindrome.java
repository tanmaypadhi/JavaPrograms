/* Decide whether a number is Palindrome */

import java.util.Scanner;

public class NumberAsPalindrome {
    public static boolean isNumberPalindrome(int num){

        if(num == 0 || num <0)
            throw new IllegalArgumentException("Entered number can not be decided as Palindrome");
        if(num == 1)
            System.out.println("Entered number is Palindrome");
        int rev = 0;
        int number = num;
        while(number >0){
            int rem = number % 10;
            rev = rev * 10 + rem;
            number = number /10;
        }
        System.out.println(rev);

          if( rev == num)
              return true;

        return false;
    }

    public static void main (String args[]){
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (isNumberPalindrome(n))
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }
}
