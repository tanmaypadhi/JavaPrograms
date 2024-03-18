package Math;

import java.util.Scanner;

/*
 * Write a method which given two integers, returns the integer that is closest to 1000.
 * Input: 1080 , 1090
 * Output: 1080
 * Input: 999, 1010
 * Output: 999
 */

public class ClosestToInteger {
	public static void closestInteger(int num1, int num2) {
		if(num1 == num2)
			throw new IllegalArgumentException("Both the nos are equal");
		if (Math.abs(1000 - num1) == Math.abs(1000 - num2)) {
			System.out.println("Both the nos are closer to 1000");
		}
		else {
		int value = Math.abs(1000 - num1) > Math.abs(1000 - num2) ? num2 : num1 ;
		System.out.println("The closer number is:" + value);
	    }
	}

	public static void main (String args[]) {
		System.out.println("Enter the numbers");
		Scanner in = new Scanner (System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		closestInteger(num1, num2);
		in.close();
	}
}
