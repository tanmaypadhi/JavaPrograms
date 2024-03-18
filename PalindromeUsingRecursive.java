package Strings;

import java.util.*;

/*
 * Palindrome Using Recursive.
 */

public class PalindromeUsingRecursive {
	public static boolean palRec(String str) {
		if(str == null)
			throw new IllegalArgumentException("Invalid String");
		if(str.length() == 0 || str.length() == 1)
			return true;
		if(str.charAt(0) == str.charAt(str.length()-1))
			return palRec(str.substring(1, str.length()-1));
		
		return false;
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(palRec(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		in.close();
	}
}
