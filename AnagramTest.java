/*
Write a sample program that will decide whether two strings are anagram.
 */

import java.util.Scanner;
import java.util.Arrays;

public class AnagramTest{

    public static boolean isAnagram(String s1, String s2){
        if (s1.length()==0 ||s1.length()==-1||s2.length()==0||s2.length()==-1)
            throw new IllegalArgumentException("Invalid String");
        if(s1==null || s2==null)
            throw new IllegalArgumentException("Invalid String");
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        if(str1.length!=str2.length)
            return false;
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2))
            return true;

        return false;
    }

    public static void main (String args[]){
        System.out.println("Enter the Strings");
        Scanner in = new Scanner(System.in);

        String str1= in.nextLine();
        String str2 = in.nextLine();
        if(isAnagram(str1,str2))
            System.out.println("Two Strings are Anagrams");
        else
            System.out.println("Two Strings are not Anagrams");
    }
}


