package Math;

import java.util.*;

/* Find number of divisors */

public class NumberOfDivisors {
	public static void numberOfDivisors(int num) {
		if(num < 0)
			throw new IllegalArgumentException("Negative number");
		if (num == 0 || num == 1)
			System.out.println("Divisor is "+ num);
		int counter = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println("Divisor is "+ i);
			counter ++;
			}
		}
		System.out.println("Number of divisors is:"+ counter);
	}
	
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		numberOfDivisors(num);
		in.close();
	}
}
