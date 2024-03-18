package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Based on the following String "122459855", determine the number of times
 * the values show up and Output to followed as below:
 * Input : 122459855
 * Output: 
 * 1:1
 * 2:2
 * 4:1
 * 5:3
 * 9:1
 * 8:1
 */

public class CharacterRepeatationInAString {
	public static void charRepeat(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		HashMap<Character, Integer> hMap = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			if(hMap.containsKey(str.charAt(i)))
				hMap.put(str.charAt(i), hMap.get(str.charAt(i))+1);
			else
				hMap.put(str.charAt(i), 1);
		}
		for(Map.Entry<Character, Integer> entry:hMap.entrySet()){
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + " " + value);
		}
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		charRepeat(str);
		in.close();
	}
}
