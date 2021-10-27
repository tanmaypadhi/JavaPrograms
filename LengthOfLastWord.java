/* Find out the length of last word of a Sentence in Java */

import java.util.Scanner;

public class LengthOfLastWord {
    public static void lengthOfLastWord(String s){
        if(s.length()==0 ||s.length()==-1||s==null)
            throw new IllegalArgumentException("Invalid String");
        int len =0;
        String s1 = s.trim();
        for(int i=0; i< s1.length(); i++){
            if(s1.charAt(i)==' ') {
                len = 0;
            }
            else {
                len ++;
            }
            }
            System.out.println("The length of last word is:" + len);
        }

        public static void main (String args[]){
        System.out.println("Enter a String");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        lengthOfLastWord(s);
        }
    }

// Another Solution - https://ide.geeksforgeeks.org/vpggAy