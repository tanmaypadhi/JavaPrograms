/* A Java program to evaluate a given expression where tokens are separated
 by operands.
 Test Cases:
 "1+2-3"            ---> 0
 "2-2"          ---> 0
 */

import java.util.Stack;

public class OperatorProgram {
    public static int evaluate(String expression) {
        char[] tokens = expression.toCharArray();

        // Stack for numbers: 'values'
        Stack<Integer> values = new Stack<Integer>();

        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {

            // Current token is a number, push it to stack for numbers
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                values.push(Integer.parseInt(tokens[i] + ""));
            }

            // Current token is an operator.
            else if (tokens[i] == '+' || tokens[i] == '-') {
                ops.push(tokens[i]);
            }
        }

        // Entire expression has been parsed at this point, apply remaining
        // ops to remaining values.
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));

        // Top of 'values' contains result, return it
        return values.pop();
    }

    // A utility method to apply an operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
        }
        return 0;
    }

    // Driver method to test above methods
    public static void main(String[] args) {
        System.out.println(OperatorProgram.evaluate("1+2-3"));
        System.out.println(OperatorProgram.evaluate("2-2"));
    }
}