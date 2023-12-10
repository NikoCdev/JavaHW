import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the sorting direction (asc/desc): ");
        String direction = scanner.next();


        sortArray(array, direction);


        System.out.println("Sorted array: " + Arrays.toString(array));

        scanner.close();
    }

    public static void sortArray(int[] array, String direction) {
        if ("asc".equalsIgnoreCase(direction)) {
            Arrays.sort(array);
        } else if ("desc".equalsIgnoreCase(direction)) {
            Arrays.sort(array);
            reverseArray(array);
        } else {
            System.out.println("Invalid sorting direction.");
        }
    }

    private static void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }
}
