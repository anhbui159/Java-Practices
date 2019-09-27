//Find the reverse string of the given string
import java.util.Scanner;
import java.util.*;

public class reverseString {
    public static String reverse(String s) {
        String result = "";
        for (int i = s.length(); i > 0; i--) {
            result += s.charAt(i - 1);
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = input.nextLine();
        System.out.println("The reverse of the given string is: " + reverse(s));
        input.close();
    }
}
