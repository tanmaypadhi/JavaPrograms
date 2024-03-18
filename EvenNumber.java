package Math;

import java.util.Scanner;

/*
 * Decide whether a number is even.
 */

public class EvenNumber {
	public static void evenOrOdd(int num) {
		if (num < 0)
			throw new IllegalArgumentException("Negative number");
		if (num == 0)
			System.out.println("Even number");
		if (num % 2 == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}

	public static void main (String args[]) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		evenOrOdd(num);
		in.close();
	}
}
