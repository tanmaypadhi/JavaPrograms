/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Explanation: https://leetcode.com/problems/longest-common-prefix/solutions/3174307/well-explained-code-using-strings-in-java/

 */
import java.util.*;

public class LongestCommonPrefix {
    public static String longestCommonPref(String[] str){
        if ((str.length==0||str.length==-1||str==null))
            throw new IllegalArgumentException("Invalid Input");
        Arrays.sort(str);
        for(int i=0;i<str.length;i++) {
            System.out.println(str[i]);
        }
        int idx = 0;
        String str1 = str[0];
        String str2 = str[str.length-1];
        while(idx<str1.length()&&idx<str2.length()){
            if(str1.charAt(idx)==str2.charAt(idx)){
                idx ++;
            }
            else {
                break;
            }
        }
        return str1.substring(0,idx);
    }

    public static void main(String args[]){
        String[] str = {"dog","racecar","car"};
        System.out.println(longestCommonPref(str));
    }
}
