package Strings;

/*
 * Print Pattern:
 * ..........
   .........
   ........
   .......
   ......
   .....
   ....
   ...
   ..
   .
 * 
 */

public class ThirdPrintPatterns {
	public static void printPattern() {
		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				System.out.print('.');

			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		printPattern();
	}

}
