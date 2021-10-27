import java.util.*;

/*
Find GCD of two numbers.
24, 48 - 24
21, 64 - 1
 */
public class FindingGCDOfTwoNumbers {
    public static void findGcdOfTwoNos(int num1, int num2){
        int gcd = 0;
        if(num1<0||num2<0)
            throw new IllegalArgumentException("GCD can not be deciced of any negative number");
        if(num1==0||num1==1||num2==0||num2==1)
            System.out.println("There is no point in finding GCD because of invalid value ");

        for(int i=1;i<=num1||i<=num2;i++){
            if(num1%i ==0 && num2%i==0)
                gcd = i;
        }
        System.out.println("The GCD is:" + gcd);
    }

    public static void main (String args[]){
        System.out.println("Enter the numbers");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        findGcdOfTwoNos(num1,num2);
    }
}
