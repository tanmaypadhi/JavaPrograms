public class NumberAndString {

    public String intToString(int i) {

        int num;
        int rem;
        String s = "";
        String neg;

        if (i < 0) {
            neg = "-";
            num = Math.abs(i);
        } else {
            neg = "";
            num = i;
        }
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            s = Integer.toString(rem) + s;
        }
        return(neg + s);
//		return("" + i);
    }

    public int stringToInt(String s) {

        int num;

        //num = Integer.parseInt(s);
        num = 0;
        for (int i = 0; i < s.length(); i++) {
            num = (num * 10) + (s.charAt(i) - '0' );

        }
        //System.out.println(num);
        return(num);
    }

    public static void main(String[] args) {

        NumberAndString nas = new NumberAndString();

        System.out.println(" int 532 = " + nas.intToString(532));
        System.out.println(" int -456 = " + nas.intToString(-456));
        System.out.println(" string 235 = " + nas.stringToInt("235"));
    }
}
