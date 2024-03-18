package Math;

import java.util.Scanner;

/*
 * Write a program to swap two variables without using a third variable.
 * Input: a = 67, b = 45
 * Output: a = 45, b = 67
 */

public class SwappingOfVariables {
	public static void swappingOfVariables(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The new values of variables a and b are:"+ a + " "+ b);
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the values of the Integers:");
		Scanner in = new Scanner (System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		swappingOfVariables(a, b);
		in.close();
	}

}
