package Strings;

import java.util.*;

/*
 * Input - kripalu
 * output - i a u
 * Number of Vowels: 3
 * 
 * Input - hi how are you
 * output - i o a e o u
 * Number of Vowels: 6
 */

public class NumberOfVowelsInAString {

	public static void numberOfVowels(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		int counter = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
					str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				System.out.println("The vowels are:" + str.charAt(i));
				counter ++ ;
			}
		}
		System.out.println("The number of vowels are:" + counter);
	}
	
	//Find out number of Unique Vowels.
	public static void findUniqueVowels(String str) {
    	HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
    	int counter = 0;
    	for(int i = 0; i < str.length(); i++) {
    		if(hMap.containsKey(str.charAt(i)))
    			hMap.put(str.charAt(i), hMap.get(str.charAt(i)) + 1);
    		else
    			hMap.put(str.charAt(i), 1);
    	}
    	
    	for(Map.Entry<Character, Integer> entry :hMap.entrySet()) {
    		Character key = entry.getKey();
    		Integer value = entry.getValue();
    		if(key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u') {
    			System.out.print(key + " ");
    			System.out.println();
    			counter ++;
    		}
    	}
		System.out.println("The number of vowels are:" + counter);
    }
	
	public static void main (String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		numberOfVowels(str);
		in.close();
	}
}
