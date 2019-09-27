
//Find the nth element of the fibonacci sequence
import java.util.Scanner;

public class fibonacciNumber {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of your choice: ");
        int n = input.nextInt();
        System.out.println("The fibonacci number is: " + fibonacci(n));
        input.close();
    }
}