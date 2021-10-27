/*
  This is a simple java program which will reverse the string.
 */

import java.util.Scanner;

public class StringReverse {

    public static void strRev (String s){

            if (s.length() == 0 || s.length() == -1)
                System.out.println("Invalid String");
            if(s.length()==1)
                System.out.println("The reverse String is:" + s);
        String s1 = " ";
        char c;
        int len;
        for (int i=s.length()-1; i >=0; i--){
            c = s.charAt(i);
            s1 = s1 + c;
        }

        System.out.println ("The Reverse String is:" + s1);


    }

    public static void main (String args[]){
System.out.println("Enter the String you want to be reversed");
Scanner in = new Scanner(System.in);
String s = in.nextLine();
strRev(s);
in.close();
    }
}
