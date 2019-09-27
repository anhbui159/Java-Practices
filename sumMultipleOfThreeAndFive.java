
//Given an integer n, find the summation of all the numbers x that 0 <= x <= n
import java.util.Scanner;

public class sumMultipleOfThreeAndFive {
    public static int sumMultipleOfThreeAndFive(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                System.out.println(i + " was added to the summation");
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want: ");
        int n = input.nextInt();
        System.out.println("The summation of all the multiples of three and five up until your number is: "
                + sumMultipleOfThreeAndFive(n));
        input.close();
    }
}