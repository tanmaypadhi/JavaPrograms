/*
Write a Program to decide factorial of a number.
 */
import java.util.Scanner;

public class FactorialOfANumber {
    public static void findFact(int num){
        if(num==0)
            System.out.println("Factorial is 1");
        if(num==1)
            System.out.println("Factorial is 1");
        if(num<0)
            System.out.println("Factorial can not be found out");
        int fact=1;
        /*
        if(num>=2){
            for(int i=num;i > 0;i--){
                fact=fact*i;
            }
            */
        for (int i=1;i<=num;i++) {
            fact = fact * i;
        }
            System.out.println("Factiorial of a number is" + fact);
        }

    public static void main (String args[]){
        System.out.println("Enter the number to find out the factorial");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        findFact(num);
        in.close();
    }
}
