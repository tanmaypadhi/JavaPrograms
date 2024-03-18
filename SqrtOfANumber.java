package Math;

import java.util.*;

public class SqrtOfANumber {
	public static void findSqrt(int num) {
		if (num <= 0)
			throw new IllegalArgumentException("Invalid Number");
		if (num == 1)
			System.out.println("The Sqrt of the number is:" + 1);


		for (int i = 1; i <= num / 2; i++) {
			if (i * i == num) {
				System.out.println("The Sqrt of the number is:" + i);
				break;
			}
			if (i == num/2 )
				System.out.println("The Sqrt of the number can not be found");
		}
	}

	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		findSqrt(num);
		in.close();
	}

}
