/*
 * Write a method which given a string, returns a string where every character in the original is doubled.
 * For example, given the string "xyz", returns the string "xxyyzz".
 */

import java.util.Scanner;

public class DoubleCharacter {
    public static void doubleChar(String s){
        if(s.length()==0 || s.length()==-1)
            System.out.println("Invalid String");
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            sb.append(ch).append(ch);
            //sb.append(ch);
        }
        System.out.println("The new string is:" + sb.toString());
    }

    public static void main (String args[]){
        System.out.println("Enter the String:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        doubleChar(s);
        in.close();


    }
}