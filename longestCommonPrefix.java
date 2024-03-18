package Strings;

import java.util.*;

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

public class longestCommonPrefix {
	public static String longCommonPrefix(String[] str) {
		if(str == null || str.length == 0)
			throw new IllegalArgumentException("Invalid String Array");
		
		Arrays.sort(str);
		String str1 = str[0];
		String str2 = str[str.length-1];
		int idx = 0;
		while (idx < str1.length() && idx < str2.length()){
			if(str1.charAt(idx) == str2.charAt(idx)) {
				idx ++;
			}
			else {
				break ;
			}
		}
		return str1.substring(0, idx);
		}
		
	public static void main (String args[]) {
		String str[] = {"flower","flow","flight"};
		System.out.println((longCommonPrefix(str)));
	}
}
