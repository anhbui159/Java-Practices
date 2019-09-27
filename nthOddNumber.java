
//Given an array and an integer n, the function will find the nth odd number of the array.
import java.util.Scanner;

public class nthOddNumber {
    public static int oddNumber(int[] array, int n) {
        int count = n;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 1 && count != 1) {
                count = count - 1;
                continue;
            } else if ((array[i] % 2 == 0)) {
                continue;
            } else if (count == 1) {
                System.out.println("The odd number that you are looking for is: " + array[i]);
                return array[i];
            }
        }
        System.out.println("Couldn't find that odd number.");
        return -1;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        System.out.println("Enter the number of your choice:");
        int number = input.nextInt();
        System.out.println(-1 % 2);
        oddNumber(array, number);
    }
}