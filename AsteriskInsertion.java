/*
 * Write a method which given a string, returns a string with an asterisk inserted between every character in
 * the original.   Use recursion in your solution.
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class AsteriskInsertion {
    public static String addAstric(String str) {
        if (str == null) {
            return str;
        }
        if (str.length() <= 1) {
            return str + "*";
        }
        // append * after each char. Assuming space as char
        return str.charAt(0) + "*" + addAstric(str.substring(1));
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println(addAstric("hello"));
        System.out.println(addAstric("h"));
        System.out.println(addAstric(""));
        String str = null;
        System.out.println(addAstric(str));
        System.out.println(addAstric(" "));
        System.out.println(addAstric("XYZ"));
        System.out.println(addAstric("abcXYZ"));
        System.out.println(addAstric("a1b1c1X1Y1Z1"));
        System.out.println(addAstric("x!@#$%^&*()yz123"));
        System.out.println(addAstric("Adaptive Insights is a Great Company who is the leader in SAAS industry"
                + " and have more that 3400 customers and it is growing big on day to day basis, "
                + "company culture is amazing and lot of opportunities to grow..."));
        System.out.println(addAstric("A man, a plan, a canal: Panama"));
        System.out.println(addAstric("madam"));
        System.out.println(addAstric("1234567890101010100101010100101001010010101010100101010"));
        System.out.println(addAstric("null"));
        System.out.println(addAstric("!@#$%^&*()_+?><[]|,.-=9012345"));

    }

}