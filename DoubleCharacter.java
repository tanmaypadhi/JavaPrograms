package Strings;

import java.util.Scanner;

/*
 * Write a method which given a string, returns a string where every character in the original is
 * doubled.
 * For example, given the string "xyz", returns the string "xxyyzz".
 */

public class DoubleCharacter {
	
public static String doubleChar(String str) {
	if(str == null || str.length() == 0)
		throw new IllegalArgumentException("Invalid String");
	
	StringBuilder sb = new StringBuilder();
	for(char ch: str.toCharArray()) {
		sb.append(ch).append(ch);
	}
	return sb.toString();
}

public static void main (String args[]) {
	System.out.println("Enter the String");
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	System.out.println(doubleChar(str));
	in.close();
}
}
