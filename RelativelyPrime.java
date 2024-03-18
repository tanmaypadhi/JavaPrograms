package Math;

import java.util.*;

/*
 * Input - 31, 35
 * Output - Relatively Prime
 * Input - 39, 72 (39 -> 1, 3, 13, 39       72->1, 2, 3, 4, 6, 8, 12, 18, 24, 36, 72 )
 * Output - Not Relatively Prime
 * Input - 24, 18
 * Output - Not Relatively Prime
 * 21 - Divisors are 1, 3, 7, 21
   64 - Divisors are 1, 2, 4, 8, 16, 32, 64
There is no common divisors between 21 and 64 except 1. So these two are relatively prime.

 * Two nos are said to be relatively prime when they do not have any common divisor or GCD is 1.
 */
public class RelativelyPrime {
	public static void decideRelativelyPrime(int num1, int num2) {
		if(num1 <= 0 || num2 <= 0)
			throw new IllegalArgumentException("Invalid Number");
		int gcd = 1;
		if(num1 % num2 == 0) {
			gcd = num2;
		}
		else if (num2 % num1 == 0) {
			gcd = num1;
		}
		else {
			for(int i = 2; i <= num1 && i <= num2; i++) {
				if( num1 % i == 0 && num2 % i ==0) {
					gcd = i;
				}
				else {
					gcd = 1;
				}
			}
		}
		if(gcd == 1)
			System.out.println("Relatively Prime");
		else
			System.out.println("Not Relatively Prime");
	}

	public static void main(String args[]) {
		System.out.println("Enter the nos");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		decideRelativelyPrime(num1, num2);
		in.close();
	}
}
