/*
 * This program will print the numbers as below:
 * 0 1 2 3 4
 * 5 6 7 8 9
 * 10 11 12 13 14
 * 15 16 17 18 19
 */
public class PrintFormatNumbers {

    public static void printNumbers (){
        //int[] arr = new int[5];
        //int[] arr1 = new int[5];
        int k=0;
        for (int i=0; i < 4 ;i++){
            for (int j=0; j < 5; j++){
                System.out.print(k + " ");
                //System.out.println();
                k++;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printNumbers ();
    }
}