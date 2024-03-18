package Strings;

import java.util.*;
/*
 * Input - kripalu
 * Output - ulapirk
 */

public class ReverseStringProgram {
	public static void stringReverse(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		String strRev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strRev = strRev + str.charAt(i);
		}
		System.out.println("Reverse String is:" + strRev);
	}

	public static void main (String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		stringReverse(str);
		in.close();
	}
}
