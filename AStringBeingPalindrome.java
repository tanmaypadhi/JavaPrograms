package Strings;

import java.util.Scanner;

/*
 * Write a program to decide whether a String is Palindrome.
 * Input: madam
 * Output: Palindrome
 * Input: malayalam
 * Output:Palindrome
 * Input: tanmay
 * Output: Not a Palindrome
 */

public class AStringBeingPalindrome {
	public static void validPalindrome(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		str = str.toLowerCase();
		String strRev = "";
		for(int i = str.length()-1; i>=0; i--) {
			strRev = strRev+str.charAt(i);
		}
		if(strRev.equals(str)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		validPalindrome(str);
		in.close();
	}

}
