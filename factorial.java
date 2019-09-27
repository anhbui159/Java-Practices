
//Given a number n, find n!(factorial of n) using both recursive and non-recursive
import java.util.Scanner;

public class factorial {
    public static int recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (recursiveFactorial(n - 1) * n);
        }
    }

    public static int nonRecursiveFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer of your choice: ");
        int n = input.nextInt();
        System.out.println("The factorial of the given number (using recursive) is: " + recursiveFactorial(n));
        System.out.println("The factorial of the given number (using non-recursive) is: " + nonRecursiveFactorial(n));
        input.close();
    }
}