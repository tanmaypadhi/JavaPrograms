import java.util.*;
/*
Find out the number of divisors of any number.
Input a Number - 28
The number of divisors are - 1, 2, 4, 7, 14, 28
 */
public class NumberOfDivisors {
    public static void Divisors(int num){
        if(num==0||num==1)
            System.out.println("Divisors are not considered");
        if(num <0)
            throw new IllegalArgumentException("Negative number");
        for(int i=1;i<=num;i++){
            if(num%i==0)
                System.out.println(i);
        }
    }

    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Divisors(num);
    }
}
