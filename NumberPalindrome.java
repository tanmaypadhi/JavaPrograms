package Strings;

import java.util.*;

/*
 * Decide whether a number is Palindrome.
 */

public class NumberPalindrome {
	public static boolean numberPal(int num) {
		if(num < 0)
			throw new IllegalArgumentException("Negative number");
		if(num == 0 || num == 1)
			return true;
		int num1 = num;
		int rem = 0;
		int revNum = 0;
		while (num1 > 0) {
			rem = num1 % 10;
			revNum = revNum * 10 + rem;
			num1 = num1 / 10;
		}
		if(num == revNum)
			return true;
		
		return false;
	}

	public static void main (String args[]) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if(numberPal(number))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		in.close();
	}
}
