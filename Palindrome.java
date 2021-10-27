/*
This program will decide whether a string is Palindrome.
*/
import java.util.Scanner;

public class Palindrome {
    public static boolean isPallindrome(String s){

        if(s.length()==0||s.length()==-1)
            System.out.println("Invalid String");
        if(s.length()==1)
            System.out.println("Any single character string is pallindrome");

        String s1 = "";
        for(int i=s.length()-1; i>=0;i--){
            s1=s1+s.charAt(i);
        }
        //System.out.println(s1);
        if(s1.equals(s))
            return true;

        return false;
    }

    public static void main(String args[]){
        System.out.println("Enter the String");
        Scanner in= new Scanner(System.in);
        String s = in.nextLine();
        isPallindrome(s);
        if(isPallindrome(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        in.close();
    }

}
