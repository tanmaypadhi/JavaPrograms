package Strings;

import java.util.*;
/*
 * Write a Program to decide whether two strings are Anagram to each other.
 * Input: Dad
 *        add
 * Output: Both the Strings are anagram.
 * 
 * Input: hello
 *        hithere
 * Output: Both the Strings are not anagram.
 */

public class Anagram {
	public static void isAnagram(String str1, String str2) {
		if(str1 == null || str1.length() == 0 || str2 == null || str2.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		
		char[] str3 = str1.toCharArray();
		char[] str4 = str2.toCharArray();
		Arrays.sort(str3);
		Arrays.sort(str4);
		if(Arrays.equals(str3, str4)) {
			System.out.println("Two Strings are anagram to each other");
		}
		else {
			System.out.println("Two Strings are not anagram to each other");
		}
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the Strings");
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		isAnagram(str1, str2);
		in.close();
	}

}
