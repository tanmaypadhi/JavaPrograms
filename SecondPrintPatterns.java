package Strings;

/*
 * Print numbers such as :
 * 0
 * 1 2
 * 3 4 5
 * 6 7 8 9
 * 10 11 12 13 14
 */

public class SecondPrintPatterns {
	public static void main (String args[]) {
		int k = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
	
	//Another Way.**************
		public static void printNumbersFormat (){
		    int k = 0;
	        int twoD[] [] = new int[5] [5];
	        for ( int i = 0 ; i < 5; i++  ){
	            for (int j=0; j < i+1; j++){
	                twoD[i][j]=k;
	                System.out.print(k + " ");
	                k++;
	            }
	            System.out.println();
	        }
		}
	//********************************	
}
	