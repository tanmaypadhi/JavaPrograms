/*
  This is a simple java program which will reverse a sentence.
 */

import java.util.Scanner;

public class SentenceReverse {
    public static void sentenceRev(String s){
        if(s.length()==0 || s.length()==-1)
            System.out.println("Invalid String");
        if(s.length()==1)
            System.out.println(s);
        String s1=" ";
        String[] c = s.split(" ");
        for(int i=c.length -1; i>=0; i--){
            s1=s1+ c[i] + " ";
        }
        System.out.println("The reverse Sentence is:" + s1.trim());
    }

    public static void main (String args[]){
        System.out.println("Enter the sentence to be reversed");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        sentenceRev(str);
        in.close();
    }
}
