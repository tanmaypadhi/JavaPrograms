package Strings;

import java.util.*;
/*
 *
 This program will tell whether a particular string is present in the other String.
e.g. mad - madam  >>>>  present
     dam - madam  >>>>> present
     abcd - madam >>>>> Not present
     Link - https://www.geeksforgeeks.org/check-string-substring-another/
     
 */


public class SubstringProgram {
	public static boolean isSubstringPresent(String str1, String str2) {
		if(str1 == null || str1.length() == 0 || str2 == null || str2.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		int m = str1.length();
		int n = str2.length();
		for(int i = 0; i <= n - m; i++) {
			int j;
			for ( j = 0; j < m; j++) {
				if(str2.charAt(i + j) != str1.charAt(j)) 
					break;
			}
				
					if ( j == m) {
						return true;
					}
			
		}
		
		return false;
	}
	
	//Another method by using regex.
	public static boolean isSubstringPresent1(String str1, String str2) {
		if(str2.matches(".*" + str1 + ".*")) {
			return true;
		}
		
		return false;
	}
	
	//Another method by using contains.
	public static boolean isSubstringPresent2(String str1, String str2) {
		if(str2.contains(str1)) {
			return true;
		}
		
		return false;
	}
	
	////Another method by using index of.
	public static boolean isSubstringPresent3(String str1, String str2) {
		int index = str2.indexOf(str1);
		if(index != -1) {
			return true;
		}
		
		return false;
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the Strings");
		Scanner in = new Scanner (System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		if(isSubstringPresent3(str1, str2))
			System.out.println("Substring present");
		else
			System.out.println("Substring not present");
		in.close();
	}
}
