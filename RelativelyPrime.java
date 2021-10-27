import java.util.*;
/*
Decide whether two numbers are relatively prime.
21 - Divisors are 1, 3, 7, 21
64 - Divisors are 1, 2, 4, 8, 16, 32, 64
There is no common divisors between 21 and 64 except 1. So these two are relatively prime.
Two numbers are called to be relatively prime when the GCD is 1.
 */

public class RelativelyPrime {
    public static void isRelativelyPrime(int num1, int num2){
        int gcd=0;
        if(num1<0||num2<0)
            throw new IllegalArgumentException("Numbers are negative");
        if(num1==0||num1==1||num2==0||num2==1)
            System.out.println("Numbers are special numbers");

        for(int i=1;i<=num1||i<=num2;i++){
            if(num1%i==0&&num2%i==0)
            gcd = i;
        }
        if(gcd==1)
            System.out.println("Numbers are relatively Prime");
        else
            System.out.println("Numbers are not relatively Prime");
    }
       public static void main(String args[]){
        System.out.println("Enter the numbers");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        isRelativelyPrime(num1,num2);
       }

}
