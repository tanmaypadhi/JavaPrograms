/*
Decide whether an entered number is even or odd.
*/

import java.util.Scanner;

public class EvenOrOdd {
    public static boolean evenTest(int num){
        if(num==0)
            //System.out.println("Even Number");
            return true;

        if(num==1)
            System.out.println("Special Number");
        if(num<0)
            System.out.println("Invalid Number");
        if(num >=2) {
            if (num % 2 == 0)
                return true;
        }

        return false;
    }

    public static void main(String args[]){
        System.out.println("Enter the number to decide whether it is even");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(evenTest(num))
            System.out.println("Even Number");
        //else
            //System.out.println("Odd Number");
        in.close();
    }
}
