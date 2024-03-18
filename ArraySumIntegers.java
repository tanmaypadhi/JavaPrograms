package Strings;

/*
 * Write a Program to find out the pairs and the number of pairs where addition of two numbers
 * in the array is equal to a particular number.
 * Input:
 *      int[] a = {0,1,-1,2,3,2,4,5,6,1,2};
        int sum = 4;
        0,4
        1,3
        -1,5
        2,2
        2,2
        3,1
        2,2
        Number of pairs = 7
 */

public class ArraySumIntegers {
	public static void arraySumIntegers(int[] arr, int target) {
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException("Invalid Array");
		int counter = 0;
		for(int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++ ) {
				if(arr[i] + arr[j] == target) {
					System.out.println("The Pairs are" + arr[i] + " " + arr[j]);
					counter ++;
				}
			}
		}
		System.out.println("The number of pairs are:" + counter);
	}

	public static void main (String args[]) {
		 int[] arr = {0,1,-1,2,3,2,4,5,6,1,2};
		 int target = 4;
		 arraySumIntegers(arr, target);
	}
}
