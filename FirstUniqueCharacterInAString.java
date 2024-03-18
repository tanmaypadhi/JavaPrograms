package Strings;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Write a Program to find out first unique character in a String.
 * Input: hheeloo
 * Outout: l
 * Input: kripalu
 * Output: k
 */

public class FirstUniqueCharacterInAString {
	public static void firstUniqueCharacter(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		
		HashMap<Character, Integer> hMap = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			if(hMap.containsKey(str.charAt(i)))
				hMap.put(str.charAt(i), hMap.get(str.charAt(i)) + 1);
			else
				hMap.put(str.charAt(i), 1);
		}
		for(int i = 0; i < str.length(); i++) {
			if(hMap.get(str.charAt(i)) == 1) {
				System.out.println("First Unique Character is:" + str.charAt(i));
				break;
			}
			else if (i == str.length() - 1) {
				System.out.println("There is no unique character in the String");
			}
		}
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		firstUniqueCharacter(str);
		in.close();
	}

}
