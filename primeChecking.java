
//Given an integer, the function would determine if it's a prime number or not.
import java.util.Scanner;

public class primeChecking {
    public static boolean primeChecking(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                return prime;
            }
        }
        return prime;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of your choice: ");
        int n = input.nextInt();
        if (primeChecking(n)) {
            System.out.println("The given number is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
        input.close();
    }
}