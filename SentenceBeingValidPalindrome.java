/*
Decide whether the string/sentence is a palindrome.
*/

import java.util.Scanner;

public class SentenceBeingValidPalindrome {
    public static void decidePal(String str){
        if(str.length()==0||str.length()==-1||str==null)
            throw new IllegalArgumentException("Invalid String");
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println("The current String is " + str);
        String finalString = "";
        for(int i =str.length()-1; i >=0 ; i--){
            finalString = finalString + str.charAt(i);
        }
        //System.out.println(finalString.toLowerCase());
        System.out.println(finalString);
        //if(str.equals(finalString.trim())){
        if(str.equals(finalString)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
    public static void main (String args[]){
        System.out.println("Enter the String");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        decidePal(str);
    }
}
