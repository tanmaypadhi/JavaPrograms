package Strings;

import java.util.*;

/*
 * Decide whether a String is Palindrome.
 * Input: madam 
 * Output: Yes, it is palindrome
 * Input: hi how are you 
 * Output: no, it is not palindrome
 */

public class Palindrome {
	public static void stringBeingPal(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		str.toLowerCase();
		String strRev = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			strRev = strRev + str.charAt(i);
		}
		if(strRev.equals(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	public static void main (String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		stringBeingPal(str);
		System.out.println(str.substring(1, str.length()-1));
	}
}
