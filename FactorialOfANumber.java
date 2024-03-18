package Math;

import java.util.*;
/*
 * Input - 5
 * Output - 120
 */
public class FactorialOfANumber {
	public static void factorialOfANumber(int num) {
		if(num < 0)
			throw new IllegalArgumentException("Negative number");
		if(num == 0)
			System.out.println("Factorial is " + 1);
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is " + fact);
	}

	public static void main (String args[]) {
		System.out.println("Enter the  number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		factorialOfANumber(num);
		in.close();
	}
}
