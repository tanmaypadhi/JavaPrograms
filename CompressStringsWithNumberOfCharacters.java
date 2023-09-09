import java.util.*;

//Compress Strings Problem but it will return the length of compressed Strings.

class CompressStringsWithNumberOfCharacters {
    public static int compress(char[] chars) {

        String str = new String(chars);

        if (str == null || str.length() == 0)
            throw new IllegalArgumentException("Invalid String");

        if (str.length() == 1)
            return 1;

        // result = str.charAt(0) + "";
        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));
        int counter = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                counter++;
            } else {
                if (counter > 1) {
                    //result = result + counter;
                    result.append(counter);
                    counter = 1;
                }
                //result = result + curr;
                result.append(curr);
            }
        }
        if (counter > 1) {
            //result = result + counter;
            result.append(counter);
        }
        return result.length();
    }

    public static void main(String[] args) {
        //System.out.println("Enter the String");
        //Scanner in = new Scanner(System.in);
        //String str = in.nextLine();
        String str = "aabbccc"; //a2b2c3
        System.out.println(compress(str.toCharArray()));
        //in.close();
    }
}