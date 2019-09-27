
//Write a function that sums two integers
import java.util.Scanner;

public class sumOfTwo {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a = input.nextInt();
        System.out.println("Enter your second number:");
        int b = input.nextInt();
        System.out.println("The sum of the two given number is: " + sum(a, b));
    }
}