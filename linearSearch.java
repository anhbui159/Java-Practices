import java.util.Scanner;

public class linearSearch {
    public static int search(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                System.out.println("The number you are looking for is at the index " + i + " of the array");
                return i;
            }
        }
        System.out.println("Couldn't find the value in the array.");
        return -1;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Enter the number that you are looking for: ");
        int n = input.nextInt();
        System.out.println("Looking for " + n);
        search(n, array);
        input.close();

    }
}