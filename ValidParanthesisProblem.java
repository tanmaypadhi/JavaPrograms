package Stack;

import java.util.*;

/*
 *Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the 
 *input string is valid.

  The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" 
  are not.
  Logic/Algorithm - https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
 */

public class ValidParanthesisProblem {
	public static boolean validParanthesis(String str) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		Stack<Character> stack = new Stack<Character>();
        //Iterate through string until empty.
		for(int i = 0; i < str.length(); i++) {
            // Push any open parentheses onto stack.
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[' )
				stack.push(str.charAt(i));
			else if(str.charAt(i) == ')' && !stack.empty() && stack.peek()=='(')
				stack.pop();
			else if(str.charAt(i) == '}' && !stack.empty() && stack.peek()=='{')
				stack.pop();
			else if(str.charAt(i) == ']' && !stack.empty() && stack.peek()=='[')
				stack.pop();
			
			else 
				return false;
		}
        // return true if no open parentheses left in stack.
		return stack.empty();
	}

	public static void main (String args[]) {
		System.out.println("Enter the String");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(validParanthesis(str))
			System.out.println("Balanced Paranthesis");
		else 
			System.out.println("Not Balanced Paranthesis");
	}
}
