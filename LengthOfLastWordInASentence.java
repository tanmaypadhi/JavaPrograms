package Strings;

import java.util.*;

/*
 * Find out the length of last word of a Sentence in Java.
 * Input: hi how are you
 * Output: 3
 */

/*
 * Pseudo Code:
 * 1. Enter the input parameter as a String in the method.
 * 2. Store each words in the String in a String Array by Splitting the String with blank space " "
 * 3. Have another String Variable and store the last word of the String array by the String Array 
 *    length.
 * 4. Calculate the length of the last word.
 */

public class LengthOfLastWordInASentence {
	public static void lengthOfLastWord(String str) {
		if (str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");

		String[] newStr = str.split(" ");
		int lastWordLength;
		lastWordLength = newStr[newStr.length - 1].length();
		System.out.println("Last Word Length is :" + lastWordLength);
	}
	
	//Another Way.
	public static void lengthOfLastWord1(String s){
        if(s.length()==0 ||s.length()==-1||s==null)
            throw new IllegalArgumentException("Invalid String");
        int len =0;
        String s1 = s.trim();
        for(int i=0; i< s1.length(); i++){
            if(s1.charAt(i)==' ') {
                len = 0;
            }
            else {
                len ++;
            }
            }
            System.out.println("The length of last word is:" + len);
        }

	public static void main(String args[]) {
		System.out.println("Enter the Sentence");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		lengthOfLastWord(str);
		in.close();
	}
}
