import java.util.Scanner;

public class PalindromeUsingRecursive {

    public static boolean isPal(String S) {
        if (S.length() == 0 || S.length() == 1)
            return true;
        if (S.charAt(0) == S.charAt(S.length() - 1))
            return isPal(S.substring(1, S.length() - 1));

        return false;

    }

    public static void main(String args[]) {
        System.out.println("Enter the String to decide whether it's a pallindrome");
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        if (isPal(S))

            System.out.println("Pallindrome");
        else
            System.out.println("Not a Pallindrome");
        in.close();

    }
}
