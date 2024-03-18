package Strings;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Write a Program to decide whether two strings are Anagram.
 * Input : dad , add
 * Output: Anagram
 * Input: hey, hello
 * Output : Not Anagram
 * Hint: We have already done this through character array and used sort function
 * to solve it but we can also do it in another approach where we can check the
 * occurences of each character in both the strings are equal using HashMap.
 */
public class AnagramWithHashMapApproach {
	public static boolean isAnagram (String str1, String str2) {
		if(str1 == null || str1.length() == 0 || str2 == null || str2.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		HashMap<Character, Integer> hMap1 = new HashMap<>();
		HashMap<Character, Integer> hMap2 = new HashMap<>();

		for(int i = 0; i < str1.length(); i++) {
			if(hMap1.containsKey(str1.charAt(i)))
				hMap1.put(str1.charAt(i), hMap1.get(str1.charAt(i))+1);
			else
				hMap1.put(str1.charAt(i), 1);
		}
		
		for(int i = 0; i < str2.length(); i++) {
			if(hMap2.containsKey(str2.charAt(i)))
				hMap2.put(str2.charAt(i), hMap2.get(str2.charAt(i))+1);
			else
				hMap2.put(str2.charAt(i), 1);
		}
		
		if(hMap1.equals(hMap2))
			return true;
		
		return false;
	}
  
	public static void main (String args[]) {
		System.out.println("Enter two Strings");
		Scanner in = new Scanner (System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		if(isAnagram(str1, str2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		in.close();
	}
}
