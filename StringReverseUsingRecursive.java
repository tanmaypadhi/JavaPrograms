import java.util.Scanner;

public class StringReverseUsingRecursive {

    public static String strRevRec(String s){
        //String s1= " ";
        if (s.length()==0 || s.length()==1)
            return s;
        //System.out.println("The reverse String is:" + s);

        //System.out.println(strRevRec(s.substring(1, s.length()-1)));

        // return strRevRec(s.substring(1, s.length()-1));
        return strRevRec(s.substring(1)) + s.charAt(0);
        //for(int i=s.length()-1; i >=0 ; i--){
        //char c  =
    }
    public static void main(String args[]){
        System.out.println("Enter the String to be reversed:");
        Scanner in = new Scanner (System.in);
        String s=in.nextLine();
        //System.out.println(strRevRec(s));
        System.out.println("The Reverse String is:" + strRevRec(s));
        in.close();
    }
}
