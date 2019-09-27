import java.util.Scanner;

public class findMax {
    public static int findMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else {
                continue;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements are there in your array ?");
        int count = input.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter your next number: ");
            int number = input.nextInt();
            array[i] = number;
        }
        System.out.println("You have finished initializing the values for the array!");
        System.out.println("The maximum value of the array is: " + findMax(array));
        input.close();
    }
}