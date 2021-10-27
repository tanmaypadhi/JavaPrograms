import java.util.*;

public class NumberOfVowelsInAString {
    public static void countNumberOfVowels(String str){
        if(str.length()==0||str.length()==-1||str==null)
            throw new IllegalArgumentException("Invalid String");
        str=str.toLowerCase();
        int counter = 0;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'  || str.charAt(i)=='o' || str.charAt(i)=='u') {
                counter ++;
                System.out.println("The Vowels are:" + str.charAt(i));
            }
        }
        System.out.println("The number of Vowels are:" + counter);

    }
    public static void main (String args[]){
        System.out.println("Enter the String");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        countNumberOfVowels(str);
    }
    }

