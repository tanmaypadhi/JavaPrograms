/*
Write a method which takes an array of integers.  The method should return true if there is a way to split the array
in two so that the sum of the numbers on one side of the split equals the sum of the numbers on the other side.

        See this is solved this way :

        I am not solving this, but see this link: best solution :)
        http://codereview.stackexchange.com/questions/51361/split-the-array-so-that-the-sum-of-the-numbers-on-one-side-of-the-split-equals-t

        The solution to this problem is easy, once you know the trick.
        The trick, is to calculate the sum of all values then do add/subtract until they match...
        This is very different to what you have done, so it does not really make sense to review your algorithm, and then say 'you did it wrong'.
        What I will do, is say your code is neat enough, and the logic you have done is visible enough, to make the algorithm clear. Even though it is not the best algorithm, you have implemented it well.
        The problems with your algorithm are that you are doing the following:
        •	you are calculating the sums of each side of the split each time
        •	you are calculating all possible splits, even if you could identify a successful split sooner
        •	The Pairs and other classes are overkill for the solution you could have....
        So, the following code (on ideone too) makes the 'simple' solution 'obvious'....
        using System;
*/

public class ArraySplit
{
    public static boolean isSubsetSum (int arr[], int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;

        // If last element is greater than sum, then ignore it
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
        int n1 = arr.length;
        if (findPartition(arr1, n1) == true)
            System.out.println("Can be divided into two "+
                    "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                    "two subsets of equal sum");

        int arr2[] = {9, -1, 5, 9, 12};
        int n2 = arr.length;
        if (findPartition(arr2, n2) == true)
            System.out.println("Can be divided into two "+
                    "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                    "two subsets of equal sum");


        int arr3[] = {4, -1, 5, 9, 12};
        int n3 = arr.length;
        if (findPartition(arr3, n3) == true)
            System.out.println("Can be divided into two "+
                    "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                    "two subsets of equal sum");

    }
}

/*
     Can be divided into two subsets of equal sum
        Can not be divided into two subsets of equal sum
        Can be divided into two subsets of equal sum
        Can not be divided into two subsets of equal sum

public class ArraySplit {
}
*/