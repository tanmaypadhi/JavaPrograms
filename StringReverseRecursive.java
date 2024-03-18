package Strings;

import java.util.*;

/*
 * Reverse a String using Recursive method.
 * Input - kripalu
 * Output - ulapirk
 */
public class StringReverseRecursive {
	public static String strRevRec(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		if(str.length()==1)
			return str;
		
		return strRevRec(str.substring(1)) + str.charAt(0);
	}

	public static void main (String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		System.out.println(strRevRec(str));
		in.close();
	}
}
