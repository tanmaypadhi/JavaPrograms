/*
Find out the first unique character in a given string.
 */

import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void firstUniqueChar(String s){
        if(s.length()==0||s.length()==-1||s==null)
            throw new IllegalArgumentException("Unique character does not exist");
        int count = 0;
        for(int i=0; i<s.length();i++){
            for(int j=0; j< s.length(); j++ ){
                if(s.charAt(i)==s.charAt(j)){
                    count ++;
                }
               if (count > 1){
                    count = 0;
                    break;
                    //System.out.println("First Unique Character is:"+ s.charAt(j));
               }
            }
            if(count==1){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }

    public static void main(String args[]){
        System.out.println("Enter the String:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        firstUniqueChar(s);
    }

}
