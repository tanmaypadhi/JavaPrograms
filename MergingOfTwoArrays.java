package Arrays;

/*
 * int[] a = {1,3,5,7,9};
   int[] b = {2,4,6,8,10};
   int[] merge = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10}
 */

/*
 * Pseudo Code:
 * Declare an Array where you store all the values of both a and b
 * run a loop where you traverse through arrays a and b
 * Compare if a[i] < b[j]
 * if true: answer[k] = a[i], i++, k++
 * if false: answer[k] = b[j], j++, k++
 * Check if i < a.length, if true, answer[k] = a[i]; i++, k++
 * Check if j < b.length, if true, answer[k] = b[j]; j++, k++
 * print the elements of merged Array
 */

public class MergingOfTwoArrays {
	public static int[] merge (int[] a, int[] b) {
		int[] answer = new int[a.length + b.length];
		int i = 0;
		int j = 0; 
		int k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				answer[k] = a[i];
				i++;
				k++;
			}
			else {
				answer[k] = b[j];
				j++;
				k++;
			}
		}
		if(i < a.length) {
			answer[k] = a[i];
			i++;
			k++;
		}
		if(j < a.length) {
			answer[k] = b[j];
			j++;
			k++;
		}
		return answer;
	}
	
	public static void main (String args[]) {
		   int[] a = {1,3,5,7,9};
		   int[] b = {2,4,6,8,10};
		   int[] answer = merge(a, b);
		   for(int i = 0; i < answer.length; i++) {
			   System.out.print(answer[i] + " ");
		   }
	}

}
