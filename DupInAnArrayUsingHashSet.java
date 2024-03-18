package Arrays;

import java.util.*;

public class DupInAnArrayUsingHashSet {
	public static void findDup(int[] arr) {
		if(arr.length == 0)
			throw new IllegalArgumentException("Invalid Array");
		
		HashSet<Integer> hSet = new HashSet<>();
		boolean unique ;
		for (int i = 0; i < arr.length; i++) {
			unique = hSet.add(arr[i]);
		if(unique == false)
			System.out.println(arr[i]);
		}
	}
	
	public static void main (String args[]) {
		int[] a = {0,0,1,1,2,3,4,12};
		findDup(a);
	}
}
