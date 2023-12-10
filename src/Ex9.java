import java.util.Scanner;
import java.util.Random;
public class Ex9 {
    public static void main(String[] args) {

        int arraySize = 10;


        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(21) - 10;
        }


        System.out.print("Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();


        int min = array[0];
        int max = array[0];


        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int value : array) {

            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }


            if (value < 0) {
                negativeCount++;
            } else if (value > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }


        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Number of negative: " + negativeCount);
        System.out.println("Number of positive: " + positiveCount);
        System.out.println("Number of zeros : " + zeroCount);
    }
}
