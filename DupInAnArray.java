package Arrays;

/* 
 * This is a sample program which will find out the DUP in an Array.
 * int[] a = {0,0,1,1,2,3,4,12};
 */

public class DupInAnArray {
	public static void findDup(int[] arr) {
		if(arr.length == 0)
			throw new IllegalArgumentException("Invalid Array");
		for(int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j])
					System.out.println("Duplicate element in the Array is:" + arr[i]);
			}
		}
	}
	
	public static void main (String args[]) {
		int[] a = {0,0,1,1,2,3,4,12};	
		findDup(a);
	}
}
