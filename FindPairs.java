package Arrays;

/*
 * Find the number of pairs and the pairs in an array whose sum is equal to a target value.
 * int[] arr = {0, 1, -1, 2, 3, 2, 4, 5, 6, 1, 2}
 * target = 4
 * Pairs are - [0, 4] [1,3][-1, 5][2, 2][2, 2][3,1][2,2]
 */
public class FindPairs {
	public static void findPairs(int[] arr, int target) {
		if(arr == null || arr.length == 0)
			throw new IllegalArgumentException("Invalid Array");
		int itr = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					System.out.println("The Pairs are:" + " " + arr[i] + " " + arr[j]);
					itr++;
				}
			}
		}
		System.out.println("Total number of Pairs are:" + " "+ itr);
	}
	
	public static void main(String args[]) {
		int[] arr = {0, 1, -1, 2, 3, 2, 4, 5, 6, 1, 2};
		findPairs(arr, 4);
	}
}
