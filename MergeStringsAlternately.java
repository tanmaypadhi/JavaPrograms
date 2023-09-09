/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with
word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
        Return the merged string.
        Example 1:
        Input: word1 = "abc", word2 = "pqr"
        Output: "apbqcr"
        Explanation: The merged string will be merged as so:
        word1:  a   b   c
        word2:    p   q   r
        merged: a p b q c r
        Example 2:

        Input: word1 = "ab", word2 = "pqrs"
        Output: "apbqrs"
        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
        word1:  a   b
        word2:    p   q   r   s
        merged: a p b q   r   s
        Example 3:

        Input: word1 = "abcd", word2 = "pq"
        Output: "apbqcd"
        Explanation: Notice that as word1 is longer, "cd" is appended to the end.
        word1:  a   b   c   d
        word2:    p   q
        merged: a p b q c   d
        */
import java.util.*;

public class MergeStringsAlternately {
    public static String mergeStrings(String str1, String str2){
        if(str1.length()==0|| str1.length()==-1||str1==null||str2.length()==0|| str2.length()==-1||str2==null)
            throw new IllegalArgumentException("Invalid String");
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<str1.length()||i<str2.length()) {
            if(i<str1.length()) {
                sb.append(str1.charAt(i));
            }
            if(i<str2.length()){
                sb.append(str2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    public static void main (String args[]){
        System.out.println("Enter the Strings");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(mergeStrings(str1,str2));
    }
}
