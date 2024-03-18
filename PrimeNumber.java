package Math;

import java.util.*;

/*
 * Decide whether a number is Prime.
 * Input - 13 
 * Output -  Prime number
 * 
 * Input - 20
 * Output - Not a Prime Number
 * 
 */

public class PrimeNumber {
	public static void primeNum(int num) {
		if (num < 0)
			throw new IllegalArgumentException("Invalid Number");
		if (num == 0 || num == 1)
			System.out.println("Special number");
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Not a Prime number");
				break;
			} else if (i == num - 1 ){
				System.out.println("Prime number");
			}
		}
	}

	//Another way.
	public static boolean isPrime(int n){
        if (n == 0 || n == 1)
            return false;
        if (n < 0)
            throw new IllegalArgumentException("Entered number is invalid");

        for (int i = 2; i <= n/2; i++){
            int temp = n % i;

            if (temp == 0){
                return true;
            }
        }

        return false;
    }
	
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		primeNum(num);
		in.close();
	}

}
