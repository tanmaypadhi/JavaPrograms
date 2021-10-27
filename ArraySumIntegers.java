/*
This program will find out the pairs from an array and also the number of pairs whose sum is equal to a specific number.
*/

public class ArraySumIntegers {
    public static void arraySum(int[] a, int sum){
        if(a.length==0||a.length==-1||a.length==1)
            System.out.println("No Pairing to be found out");
        int c=0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==sum) {
                    System.out.println("The pairings are:" + a[i] + " " + a[j]);
                    c++;
                }

                //System.out.println(c);

            }
        }
      System.out.println("The number of pairs are:" + c);
    }

    public static void main (String args[]){
        int[] a = {0,1,-1,2,3,2,4,5,6,1,2};
        int sum = 4;
        arraySum(a,4);
    }
}
