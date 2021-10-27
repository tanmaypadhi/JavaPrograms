import java.util.Scanner;

public class NumberBeingPalindrome {

        public static int reverse(int n) {

            if (n == 0 || n == 1)
                return n;

            if (n < 0)
                throw new IllegalArgumentException("Number is invalid");

            int rev = 0;

            while (n > 0) {
                int rem = n % 10;
                rev = (rev * 10) + rem;
                n = n / 10;
            }

            return rev;
        }

        public static void main(String args[]) {
            System.out
                    .println("Enter a number to decide whether it's a Pallindrome");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            // System.out.println(numpal(n));

            if (reverse(n) == n )
                System.out.println("palindrome");
            else
                System.out.println("it is not palindrome.");

        }
    }

/*
 Decide whether a number is Palindrome - Another Method. Logic is same but I want to do when return type is boolean.

import javax.sound.midi.SysexMessage;
        import java.util.Scanner;

public class NumberAsPalindrome {
    public static boolean isNumberPalindrome(int num){

        if(num == 0 || num <0)
            throw new IllegalArgumentException("Entered number can not be deviced as Palindrome");
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

 */