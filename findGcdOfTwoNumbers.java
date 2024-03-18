package Math;

import java.util.Scanner;

/*
 * Find the GCD of two nos.
 * 24, 48 - 24
 * 16, 24 - 8
 * 120, 160 - 40
 */

public class findGcdOfTwoNumbers {
	public static void findGcd(int num1, int num2) {
		if(num1 < 0 || num2 < 0)
			throw new IllegalArgumentException("Gcd can not be determined");
		if(num1 == 0 || num1 == 1 || num2 ==0 || num2 ==1)
			System.out.println("GCD can not be determined");
		int Gcd = 0;
		if(num1 % num2 == 0) {
			Gcd = num2;
			System.out.println("GCD is: " + num2);
		}
		else if (num2 % num1 == 0) {
			Gcd = num1;
			System.out.println("GCD is: " + num1);
		}
		 else {
			for (int i = 1; i <= num1 && i <= num2; i++) {
				if(num1 % i == 0 && num2 % i == 0) {
					Gcd = i;
				}
			}
			System.out.println("Gcd is:" + Gcd);
		}
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the nos");
        Scanner in = new Scanner (System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        findGcd(num1, num2);
        in.close();
	}
}