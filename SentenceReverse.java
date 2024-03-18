package Strings;

import java.util.*;

/*
 * Input - I live in San Francisco
 * Output - Francisco in live I
 */

public class SentenceReverse {
	public static void sentenceReverse(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		String[] strRev = str.split(" ");
		String newStr = "";
		for(int i = strRev.length - 1; i >= 0; i--) {
			newStr = newStr + strRev[i] + " ";
		}
		System.out.println("New reversed sentence is:" + newStr.trim());
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the Sentence:");
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		sentenceReverse(str);
		in.close();
	}

}
