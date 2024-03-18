package Arrays;

import java.util.*;
/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and
 * return the new length. Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * For example,
   Given input array nums = [1,1,2],
   Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */

public class RemoveDuplicateFromArray {
	public static void removeDup(int[] arr) {
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException("Invalid Array");

		HashSet<Integer> hashSet = new HashSet<Integer>();
		boolean unique;
		int id = 0;
		for (int i = 0; i < arr.length; i++) {
			unique = hashSet.add(arr[i]);
			if (unique == true) {
				System.out.println(arr[i]);
//			if(unique == false)
//				System.out.println(arr[i]);
				id++;
			}
		}
		System.out.println("The length of the Array with unique elements is:" + id);
	}

	public static void main(String args[]) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 6 };
		removeDup(arr);
	}

}
