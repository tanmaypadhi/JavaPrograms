package Strings;

import java.util.Scanner;

/*
 * The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

Refer the Youtube Video - https://www.youtube.com/watch?v=9fI_26Dl1IA

 */

public class CountAndSay {
	
	public static String countAndSayProb(int num) {
		if(num <= 0)
			throw new IllegalArgumentException("Invalid number");
		if(num == 1)
			return "1";
		
		int counter = 0;
		String res = "";
		String str = countAndSay(num - 1);
		
		for(int i = 0; i < str.length(); i++) {
			counter ++;
			if(i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
				res = res + counter + str.charAt(i);
				counter = 0;
			}
		}
		return res;
	}
	
	//Another Way - String Builder.
        public static String countChars1(int n) {
		
		if(n <= 0)
			throw new IllegalArgumentException("Invalid input");
		if(n == 1)
			return "1";
		
		//Recursion.
		String s = countChars1(n - 1);
		
		StringBuilder res = new StringBuilder();
		int counter = 0;
		for(int i = 0; i < s.length(); i++) {
			counter ++;
			//Seggregating into groups.
			if(i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
				res.append(counter).append(s.charAt(i));
				counter = 0;
			}
		}
		return res.toString();
	}
        
	//Another Way
	public static String countAndSay(int n) {
        StringBuilder curr=new StringBuilder("1");
        StringBuilder prev;
        int count;
        char say;
        for (int i=1;i<n;i++){
            prev=curr;
            curr=new StringBuilder();
            count=1;
            say=prev.charAt(0);

            for (int j=1,len=prev.length();j<len;j++){
                if (prev.charAt(j)!=say){
                    curr.append(count).append(say);
                    count=1;
                    say=prev.charAt(j);
                }
                else count++;
            }
            curr.append(count).append(say);
        }
        return curr.toString();

    }

	public static void main (String args[]) {
		System.out.println("Enter number");
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		System.out.println(countAndSayProb(n));
		in.close();
	}
}
