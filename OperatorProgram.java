package Stack;

import java.util.*;

/* A Java program to evaluate a given expression where tokens are separated
by operands.
Test Cases:
"1+2-3"            ---> 0
"2-2"          ---> 0
Logic - https://www.geeksforgeeks.org/expression-evaluation/

 * Pseudo Code - 
 * 1. Store all operands and operator in a Char Array
 * 2. Have a Stack for Operators and a stack for values
 * 3. Run through a loop for each character in the char Array , if the char is operator then 
 * push it to Operators stack
 * 4. Run through a loop for each character in the char Array , if the char is values then 
 * push it to values stack
 * 5. Write a method who will evaluate the expression:
 * 6. Check whether ops stack is empty if not then do values.push

*/

public class OperatorProgram {
	public static int evaluate(String expression) {
		if(expression == null || expression.length() == 0)
			throw new IllegalArgumentException("Invalid String");
		
		//Store the values of expression in a character array.
		char[] tokens = expression.toCharArray();
		//Store all Integer values in a Stack.
		Stack<Integer> values = new Stack<Integer>();
		//Store all operators in a Stack.
		Stack<Character> ops = new Stack<Character>();
		
		for(int i = 0; i < tokens.length; i++) {
			//If current token is a number/integer , push it a stack of numbers.
			if(tokens[i] >= '0' && tokens[i] <= '9') {
				values.push(Integer.parseInt(tokens[i] +""));
				}
			//If current token is a character, push it to a stack of characters.
				else if(tokens[i] == '+' || tokens[i] == '-') {
					ops.push(tokens[i]);
				}
			}
		
		//Entire expression has been parsed at this point, apply remaining ops to remaining values.
		while(!ops.empty()) {
			values.push(applyOp(ops.pop(), values.pop(), values.pop()));
		}
		
		//Top of values stack contains result, return it.
		return values.pop();
		}
		
	//An Utility method to apply an operator 'op' on operands 'a' and 'b'. Return the result.
		public static int applyOp(char op, int b, int a) {
			switch(op) {
			case '+':
				return a + b;
			case '-':
				return a - b;
			}
			return 0;
		}
		
		public static void main(String args[]) {
			System.out.println(evaluate("1+2-3"));
		}
	}