
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
import java.util.*;

public class fizzBuzzProblem {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        if(n<=0)
            throw new IllegalArgumentException("Invalid Input");
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0)
                list.add("fizzbuzz");
            else if(i%3==0)
                list.add("fizz");
            else if(i%5==0)
                list.add("buzz");
            else
                list.add(Integer.toString(i));
        }
        return list;
    }
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fizzBuzz(n));
    }
}
