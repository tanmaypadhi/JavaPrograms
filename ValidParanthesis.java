import java.util.Scanner;

import java.util.Stack;

/*
 *Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string
 *is valid.

  The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
  Logic/Algorithm - https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
 */

public class ValidParanthesis {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        //Iterate through string until empty.
        for(int i = 0; i<s.length(); i++) {
            // Push any open parentheses onto stack.
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
                // Check stack for corresponding closing parentheses, false if not valid
            else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
        // return true if no open parentheses left in stack.
        return stack.empty();
    }

    public static void main (String args[]){
        System.out.println("Enter the String");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(isValid(str));

    }
}


