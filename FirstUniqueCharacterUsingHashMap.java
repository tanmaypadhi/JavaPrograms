/* First Unique Character Using Hashmap */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacterUsingHashMap {

    public static void findFirstUniqueCharInString(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            //System.out.println(m.get(s.charAt(i)));
            if (m.get(s.charAt(i)) != null) {
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            } else {
                m.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (m.get(s.charAt(i)) == 1) {
                System.out.println("First Non Reapeating Character is "
                        + s.charAt(i));
                break;
            } else {
                if (i == s.length() - 1)
                    System.out.println("No non repeating Character");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the String to find out first non repititive character");
        Scanner in = new Scanner (System.in);
        String s = in.nextLine();
        findFirstUniqueCharInString( s);

    }

}