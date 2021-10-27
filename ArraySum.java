/*Write a method which takes an array of integers.  The method should return true if there is a way to
 * split the array in two so that the sum of the numbers on one side of the split equals the sum of the
 * numbers on the other side.  */

public class ArraySum {
    public static boolean isSubsetSum (int arr[], int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;

        if (n == 0 && sum != 0)
            return false;

        // If last element is greater than sum, then ignore it.
        if (arr[n-1] > sum)
            return isSubsetSum (arr, n-1, sum);

	        /* else, check if sum can be obtained by any of
	           the following
	        (a) including the last element
	        (b) excluding the last element
	        */
        return isSubsetSum (arr, n-1, sum) ||
                isSubsetSum (arr, n-1, sum-arr[n-1]);
    }

    // Returns true if arr[] can be partitioned in two
    // subsets of equal sum, otherwise false
    public static boolean findPartition (int arr[], int n)
    {
        // Calculate sum of the elements in array
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        // If sum is odd, there cannot be two subsets
        // with equal sum
        if (sum%2 != 0)
            return false;

        // Find if there is subset with sum equal to half
        // of total sum
        return isSubsetSum (arr, n, sum/2);
    }
    public static void main(String args[])
    {
        int arr[] = {3, 1, 5, 9, 12};
        int n = arr.length;
        if (findPartition(arr, n) == true)
            System.out.println("Can be divided into two "+
                    "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                    "two subsets of equal sum");

        int arr1[] = {2, 1, 5, 9, 12};
        int n1 = arr1.length;
        if (findPartition(arr1, n1) == true)
            System.out.println("Can be divided into two "+
                    "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                    "two subsets of equal sum");

        int arr2[] = {9, -1, 5, 9, 12};
        int n2 = arr2.length;
        if (findPartition(arr2, n2) == true)
            System.out.println("Can be divided into two "+
                    "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                    "two subsets of equal sum");


        int arr3[] = {4, -1, 5, 9, 12};
        int n3 = arr3.length;
        if (findPartition(arr3, n3) == true)
            System.out.println("Can be divided into two "+
                    "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                    "two subsets of equal sum");

        int arr4[] = {1, -1, 0, 1, -1};
        int n4 = arr4.length;
        if (findPartition(arr4, n4) == true)
            System.out.println("Can be divided into two "+
                    "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                    "two subsets of equal sum");

        int arr5[] = {0, 0, 0, 0, 0};
        int n5 = arr5.length;
        if (findPartition(arr5, n5) == true)
            System.out.println("Can be divided into two "+
                    "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                    "two subsets of equal sum");

        int arr6[] = {-1, -1, 0, -1, 1};
        int n6 = arr6.length;
        if (findPartition(arr6, n6) == true)
            System.out.println("Can be divided into two "+
                    "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                    "two subsets of equal sum");
    }
}