
//Given an integer, print out Fizz if it's a multiple of three, Buzz if it's a multiple of 5, or FizzBuzz if it's a multiple of both
import java.util.Scanner;

public class fizzBuzz {
    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 != 0) {
            return "Fizz";
        } else if (n % 3 != 0 && n % 5 == 0) {
            return "Buzz";
        } else if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        return Integer.toString(n);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = input.nextInt();
        System.out.println("Your FizzBuzz result is: " + fizzBuzz(n));
        input.close();
    }
}