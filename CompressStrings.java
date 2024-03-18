package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Write a Program which will compress the String and return the length of compressed String.
 ********************************
 * 1st Type:
 * Input - aabbcccddddd
 * Output - abcd
 *          4
 * 2nd Type:
 * Input - aabbcccddddd
 * Output - abcd
 *          4
 * Input - aabbcccdddddaeeff
 * Output - abcdaef
 *          7
 *          
 * Input -  abbcccddaa
 * Output - abcda
 *          5
 ************
 *Above Program can be done easily by hashmap where I will just print the key.
 ************         
 *********************************                 
 * 2nd Type:
 * Input - aabbcccddddd
 * Output - a2b2c3d4
 *          8
 * Input - aabbcccdddddaeeff
 * Output - a2b2c3d4ae2f2
 *          13
 *          
 * Input - abbcccddaa
 * Output - ab2c3d2a2
 *          9       
 *     
 * ***********************
 * Above program can be done through hashmap only where each character is repeated more than once
 * which I have done below.
 * ***********************
 * 
 * Youtube Link - https://www.youtube.com/watch?v=6W1MDK7nPZs   (Brute Force way)
 * Great Youtube Channel - https://www.youtube.com/@Pepcoding (Coding)
 *                         https://www.youtube.com/@dnb-with-sumeet (Building Projects)
 *          
 */

public class CompressStrings {
	
	// This method is using HashMap. But this work only when each characters in a String is repeated
	//more than once.
	public static void compress(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		if(str.length()==1)
			System.out.println("The length of the String is:" + 1);
		HashMap<Character, Integer> hMap = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			if(hMap.containsKey(str.charAt(i)))
				hMap.put(str.charAt(i), hMap.get(str.charAt(i))+1);
			else
				hMap.put(str.charAt(i), 1);
		}

		for(Map.Entry<Character, Integer> entry : hMap.entrySet()) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.print(key + "" + value);
		}
		int number = hMap.size();
		System.out.println();
		System.out.println(number * 2);
    }

	// This method is using Brute force method for 1st Type of Program.
	public static String compress1(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		
		String newStr = str.charAt(0) + "";
		for(int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			if(curr != prev) {
				newStr = newStr + curr ;
			}
		}
		return newStr;
	}
	
	public static String compress2(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		String newStr = str.charAt(0) + "";
		int counter = 1;
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			if (curr == prev) {
				counter ++;
			}
			else {
				if (counter > 1) {
					newStr = newStr + counter;
					counter = 1;
				}
				newStr = newStr + curr ;
			}
		}
		
		if(counter > 1) {
			newStr = newStr + counter;
			counter = 1;
		}
		return newStr ;
	}
	
	
    public static void main(String[] args) {
    	System.out.println("Enter the String");
    	Scanner in = new Scanner(System.in);
    	String str = in.nextLine();
    	//compress(str);
    	//System.out.println(compress1(str));
    	System.out.println(compress2(str));
    	in.close();
    }
}