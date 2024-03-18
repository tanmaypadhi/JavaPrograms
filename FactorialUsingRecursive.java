package Math;

import java.util.*;

/*
 * Factorial of a number using recursive.
 * Input - 5
 * Output - 120
 */

public class FactorialUsingRecursive {
	public static int findFact(int num) {
		if(num < 0)
			throw new IllegalArgumentException("Negative number");
		
		if(num == 0)
			return 1;
		
		return num * findFact(num - 1);
	}

	public static void main (String args[]) {
		System.out.println("Enter the  number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(findFact(num));
		in.close();
	}
}
