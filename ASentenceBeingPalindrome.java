package Strings;

import java.util.Scanner;

/*
 * Write a Program to decide whether a sentence is a palindrome.
 * Input: Tanmay Kumar Padhi
 * Output: Not a Palindromer
 * Input: A Man, A Plan, A Canal, panama!
 * Output: Palindrome
 */

public class ASentenceBeingPalindrome {
	public static void sentencePal(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid Strings");
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String strRev = "";
		for(int i = str.length()-1; i >= 0; i--) {
			strRev = strRev + str.charAt(i);
		}
		if(strRev.equals(str)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		sentencePal(str);
		in.close();
	}

}
