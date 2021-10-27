/* This is a sample program which will find out the DUP in an Array.*/

public class DupInAnArrary {
    public static void dupArray(int[] a) {
        if (a.length == 0 || a.length == -1 || a.length == 1)
            System.out.println("No Dup to be found in this Array");
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] == a[i])
                System.out.println("Dup Element is" + a[i]);
        }
    }
      public static void main(String args[]) {
        int[] a = {0,0,1,1,2,3,4,12};
          dupArray(a) ;
        }
}

