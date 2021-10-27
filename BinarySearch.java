
public class BinarySearch {

    public BinarySearch() {}

    public static int doSearch(int[] array, int n) {
        int beg = 0;
        int end = array.length - 1;
        int mid;

        while (end >= beg) {
            mid = beg + ((end - beg) / 2);
            System.out.println("checking array[" + mid + "] = " + array[mid]);
            if (n == array[mid]) {
                System.out.println("found array[" + mid + "] = " + array[mid]);
                return(mid);
            } else if (n < array[mid]) {
                end = mid - 1;
                System.out.println("new end = " + end + " new mid = " + mid);
            } else {
                beg = mid + 1;
                System.out.println("new beg = " + beg + " new mid = " + mid);
            }
        }
        return(-1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n;

        n = 4;
        System.out.println("Found " + n + " at index " + BinarySearch.doSearch(array, n));

        n = 7;
        System.out.println("Found " + n + " at index " + BinarySearch.doSearch(array, n));

        n = 6;
        System.out.println("Found " + n + " at index " + BinarySearch.doSearch(array, n));

        n = 11;
        System.out.println("Found " + n + " at index " + BinarySearch.doSearch(array, n));
    }
}
