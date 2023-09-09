/*
This program can be of two types :
Category-1:
Example 1:
Input - aaabbcccddaeef
Output - abcdaef

Category-2:
Example 1:
Input - aaabbcccddaeef
Output - a3b2c3d2ae2f

Reference Youtube Video:
https://www.youtube.com/watch?v=6W1MDK7nPZs

Another angle of this question:
Example 1:
Input - aaabbcccddaeef
Output - a3b2c3d2ae2f
This will also return 12 as number of characters in the output is 12 as ["a","3","b","2","c","3","d","2","a","e","2","f"]
Example 2:
Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:
Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 */

import java.util.Scanner;

//First check null and then check length.

public class StringCompression {
    public static String stringCompression1(String str) {
        if (str == null || str.length() == 0)
            throw new IllegalArgumentException("Invalid String");
        if (str.length() == 1)
            return str;
        String strComp1 = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            char cur = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (cur != prev) {
                strComp1 = strComp1 + cur;
            }
        }
        return strComp1;
    }

    public static String stringCompression2(String str) {
        if (str == null || str.length() == 0 )
            throw new IllegalArgumentException("Invalid String");
        if (str.length() == 1)
            return str;
        int counter = 1;
        String strComp2 = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            char cur = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (cur == prev) {
                counter++;
            } else {
                if (counter > 1) {      //If you want to have output as : a3b2c3d2a1e2f1 for input : aaabbcccddaeef
                    //then make this condition as if(counter >= 1)
                    strComp2 = strComp2 + counter;
                    counter = 1;
                }
                strComp2 = strComp2 + cur;
            }

        }
        if (counter > 1) {
            strComp2 = strComp2 + counter;
            counter = 1;
        }
        System.out.println(strComp2.toCharArray().length);
        return strComp2;
    }

    public static void main(String args[]) {
        System.out.println("Enter the String");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(stringCompression1(str));
        System.out.println(stringCompression2(str));
        in.close();
    }
}