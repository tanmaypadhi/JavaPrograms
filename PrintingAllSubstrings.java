package Strings;

import java.util.*;

/*
 * Print all the substrings in a String.
 * Input - abc
 * Output - a ab abc b bc c
 */

public class PrintingAllSubstrings {
	public static void printSubstrings(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		printSubstrings(str);
		in.close();
	}
}
