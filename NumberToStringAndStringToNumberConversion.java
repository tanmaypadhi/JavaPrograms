package Strings;

/*
 * Write a Program to convert an Integer to String and String to Integer.
 */
public class NumberToStringAndStringToNumberConversion {
	
	public static String convertIntToString(int i) {
		String neg;
		int num;
		int rem;
		String str = "";
		if(i < 0) {
			neg = "-";
			num = Math.abs(i);
		}
		else {
			neg = "";
			num = i;
		}
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			str = Integer.toString(rem) + str;
		}
		return neg + str;
	}
	
	public static int convertStringToInt(String str) {
		int num = 0;
		for(int i = 0; i < str.length(); i++) {
			num = (num * 10) + (str.charAt(i) - '0');
		}
		return num;
	}
	
	public static void main (String args[]) {
		System.out.println(convertIntToString(-32));
		System.out.println(convertStringToInt("35"));
	}
}