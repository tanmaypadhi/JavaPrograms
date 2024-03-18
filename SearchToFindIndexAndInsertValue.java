package Arrays;

import java.util.*;

/*
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5  > 2
[1,3,5,6], 2 >  1
[1,3,5,6], 7 > 4
[1,3,5,6], 0 > 0
 */

public class SearchToFindIndexAndInsertValue {

	public static void findIndex(int[] arr, int target) {
		if (arr == null || arr.length == 0) 
			throw new IllegalArgumentException("Invalid Array");
        
			for(int i = 0; i < arr.length; i++) {
				//To Handle this scenario - [1,3,5,6], 5  > 2
				if(arr[i] == target) {
					System.out.println("The Target is found in the index:" + i);
					break;
				}
				
				//To Handle this scenario - [1,3,5,6], 0 > 0
				else if(target < arr[i]) {
					System.out.println("The Target will be inserted in the index:" + i );
					break;
				}
				
				//To Handle this scenario - [1,3,5,6], 2 >  1
				else if((i != arr.length - 1) && target > arr[i] && target < arr[i+1]) {
					System.out.println("The Target will be inserted in the index:" + (i + 1));
					break;
				}
				
				//To Handle this scenario - [1,3,5,6], 0 > 0
				else if (i == arr.length - 1 && target > arr[arr.length - 1]){					
					System.out.println("The Target will be inserted in the index:" + (i + 1));
					break;
				}
			}
		}
	
	public static void main (String args[]) {
		int[] arr = {1,3,5,6};
		int target = 0;
		findIndex(arr, target);
	}
	}

