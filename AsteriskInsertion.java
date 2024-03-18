package Strings;

import java.util.Scanner;

/*
 * Write a method which given a string, returns a string with an asterisk inserted between every 
 * character in the original.   Use recursion in your solution.
 * Input  - tanmay
 * Output - t*a*n*m*a*y*
 */

//Using Recursion.
public class AsteriskInsertion {
	
	//Recursive Way.
	public static String asteriskInsertion(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		
		if (str.length() == 1)
			return str + "*";
		
		return str.charAt(0) + "*" + asteriskInsertion(str.substring(1));
	}
	
	//Brute Force Way.
	public static String astrInsert(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		
		StringBuilder sb = new StringBuilder();
        
		
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i)+"*");
			//newStr = newStr + str.charAt(i) + "*" ;
		}
		return sb.toString();
		
		
	}

	public static void main (String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		//System.out.println(asteriskInsertion(str));
		System.out.println(astrInsert(str));
		in.close();
	}
}
