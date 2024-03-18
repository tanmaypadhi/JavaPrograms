package Strings;

import java.util.*;

/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */

public class FizzBuzzProblem {
	
	public static List<String> fizzBuzzProblem(int num) {
		List<String> list = new ArrayList<>();
		if(num <= 0)
			throw new IllegalArgumentException("Invalid Input");
		
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				list.add("fizzbuzz");
		}
		else if (i % 3 == 0) {
			list.add("fizz");
		}
		else if(i % 5 == 0) {
			list.add("buzz");
		}
		else {
			list.add(Integer.toString(i));
		}
	}
		return list;
}
	
	public static void main (String args[]) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(fizzBuzzProblem(num));
		in.close();
	}
}
