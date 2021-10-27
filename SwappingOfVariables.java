/*
Swap two variables with and without using a third variables.
 */
import java.util.Scanner;

public class SwappingOfVariables {

    /*
    With using a third variable.

    public static void swap (int a , int b){
        int c = a ;
        a=b;
        b=c;
        System.out.println("Variable values are:" + a + " " + b);
    }

    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = in.nextInt();
        System.out.println("Enter the Second number");
        int b = in.nextInt();
        swap(a,b);
    }
*/
    /*
    Without using a third variable.
    */

    public static void swap (int a, int b) {
        a = a + b;
        b = a-b;
        a = a - b;
        System.out.println("Variable values are:" + a + " " + b);
    }

    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = in.nextInt();
        System.out.println("Enter the Second number");
        int b = in.nextInt();
        swap(a, b);
    }
}
