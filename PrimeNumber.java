import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int n){
        if (n==0 || n==1)
            return false;
        if (n<0)
            throw new IllegalArgumentException("Entered number is invalid");

        for (int i=2; i<=n/2;i++){
            int temp = n%i;

            if (temp == 0){
                //System.out.println("not a prime number");
                return true;
                //break;
            }
            //else
            //System.out.println("Prime number");
        }

        return false;
    }

    public static void main(String args[]){
        System.out.println("Enter the number to decide whether it is prime");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        if(isPrime(n))
            System.out.println("Not a Prime number");
        else
            System.out.println("Prime number");

    }

}