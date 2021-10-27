/*
 * Print numbers such as :
 * 0
 * 1 2
 * 3 4 5
 * 6 7 8 9
 * 10 11 12 13 14
 */

public class PrintFormatNumbersTwo {
    static int k = 0;
    public static void printNumbersFormat (){
        int twoD[] [] = new int[5] [5];
        for ( int i = 0 ; i < 5; i++  ){
            for (int j=0; j <i+1; j++){
//				System.out.print(j + " ");
                twoD[i][j]=k;
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        printNumbersFormat ();

    }

}