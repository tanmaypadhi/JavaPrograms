/*
 This program will tell whether a particular string is present in the other String.
e.g. mad - madam  >>>>  present
     dam - madam  >>>>> present
     abcd - madam >>>>> Not present
     Link - https://www.geeksforgeeks.org/check-string-substring-another/
 */

import java.util.Scanner;

import java.lang.String;

    public class SubstringProgram {
        public static boolean isSubstringPresent(String str1, String str2) {
            if (str1.length() == -1 || str1.length() == 0 || str1 == null || str2.length() == -1 || str2.length() == 0 || str2 == null)
                throw new IllegalArgumentException("Invalid String");
            int m = str1.length();
            int n = str2.length();

            for (int i = 0; i <= n - m; i++) {
                int j;
                for (j = 0; j < m; j++)
                    if (str2.charAt(i + j) != str1.charAt(j))
                        break;

                if (j == m)
                    return true;
            }
            return false;
        }

        public static void main(String[] args) {
            System.out.println("Enter the two Strings");
            Scanner in = new Scanner(System.in);
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            if (isSubstringPresent(str1, str2))
                System.out.println("Present");
            else
                System.out.println("Not Present");
        }
    }
//        public static boolean isSubstring(String string1, String string2) {
//            char c;
//            char d;
//            boolean match = true;
//            for (int i = 0; i < string1.length(); i++) {
//                c = string1.charAt(i);
//                //System.out.println(c);
//                for (int j = 0; j < string2.length(); j++) {
//                    d = string2.charAt(j);
//                    System.out.print(d);
//                    if (c == d) {
//                        match = true;
//                        break;
//                    } else {
//                        match = false;
//                        break;
//                    }
//                }
//                System.out.println("-----------------------");
//                System.out.println(c);
//            }
////            System.out.println("-----------------------");
////            System.out.println(c);
//            return match;
//        }
//
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Please enter a String: ");
//            String string1 = input.nextLine();
//            System.out.print("Please enter a second String: ");
//            String string2 = input.nextLine();
////            if (isSubstring(string1, string2)) {
////                System.out.println("The first string is a substring of the second.");
////            } else {
////                System.out.println("The first string is NOT a substring of the second.");
////            }
//            System.out.println(isSubstring(string1, string2));
//        }

