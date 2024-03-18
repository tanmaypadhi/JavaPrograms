package Strings;

public class IntToRoman {

	public IntToRoman() {
	}

	public String toRoman(int num) {

		int number;
		int digit;
		int position = 1;
		String roman = "";

		number = num;
		while (number > 0) {
			digit = number % (position * 10);
			number -= digit;
			position *= 10;
			System.out.println("digit = " + digit + " number = " + number);

			if (digit < 5) {
				if (digit < 4) {
					for (int i = 0; i < digit; i++) {
						roman = "I" + roman;
					}
				} else {
					roman = "V" + roman;
					for (int i = 0; i < (5 - digit); i++) {
						roman = "I" + roman;
					}
				}
			} else if (digit < 10) {
				if (digit < 9) {
					for (int i = 0; i < (digit - 5); i++) {
						roman = "I" + roman;
					}
					roman = "V" + roman;
				} else {
					roman = "X" + roman;
					for (int i = 0; i < (10 - digit); i++) {
						roman = "I" + roman;
					}
				}
			} else if (digit < 50) {
				if (digit < 40) {
					for (int i = 0; i < digit; i += 10) {
						roman = "X" + roman;
					}
				} else {
					roman = "L" + roman;
					for (int i = 0; i < (50 - digit); i += 10) {
						roman = "X" + roman;
					}
				}
			} else if (digit < 100) {
				if (digit < 90) {
					for (int i = 0; i < (digit - 50); i += 10) {
						roman = "X" + roman;
					}
					roman = "L" + roman;
				} else {
					roman = "C" + roman;
					for (int i = 0; i < (100 - digit); i += 10) {
						roman = "X" + roman;
					}
				}
			} else if (digit < 500) {
				if (digit < 400) {
					for (int i = 0; i < digit; i += 100) {
						roman = "C" + roman;
					}
				} else {
					roman = "D" + roman;
					for (int i = 0; i < (500 - digit); i += 100) {
						roman = "X" + roman;
					}
				}
			} else if (digit < 1000) {
				if (digit < 900) {
					roman = "D" + roman;
					for (int i = 0; i < (digit - 500); i += 100) {
						roman = "C" + roman;
					}
				} else {
					roman = "M" + roman;
					for (int i = 0; i < (1000 - digit); i += 100) {
						roman = "C" + roman;
					}
				}
			} else {
				for (int i = 0; i < digit; i += 1000) {
					roman = "M" + roman;
				}
			}
		}

		return (roman);
	}

	public static void main(String[] args) {

		IntToRoman ir = new IntToRoman();
		int i = 1948;

		System.out.println(i + " in roman is " + ir.toRoman(i));
	}

}
