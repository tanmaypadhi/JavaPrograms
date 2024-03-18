package Math;

import java.util.*;

/*
 * 0 1 1 2 3 5 8 13 21 34
 */

public class FibonacciSeries {

	public static void findFibonacci(int num) {
		if (num < 0)
			throw new IllegalArgumentException("Invalid number");
		if (num == 1)
			System.out.println("0");
		if (num == 2)
			System.out.print("0" + " " + "1" + " ");
		int a = 0;
		int b = 1;
		if (num > 2) {
			System.out.print(a + " " + b + " ");
			int temp = 0;
			for (int i = 2; i < num; i++) {
				temp = a + b;
				a = b;
				b = temp;
				System.out.print(temp + " ");
			}
		}
	}

	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		findFibonacci(num);
		in.close();
	}
}