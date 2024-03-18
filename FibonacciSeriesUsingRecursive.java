package Math;

import java.util.*;

/*
 * 0 1 1 2 3 5 8 13 21 34
 */

public class FibonacciSeriesUsingRecursive {
	public static int findFibonacci(int num) {
		if(num < 0)
			throw new IllegalArgumentException("Invalid number");
		
		if(num ==0 || num == 1)
			return num;
		
		return findFibonacci(num - 1) + findFibonacci(num - 2);
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 0; i < num ; i++) {
			System.out.println(findFibonacci(i));
		}
		in.close();
	}

}
