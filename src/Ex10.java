import java.util.Scanner;
import java.util.Random;
public class Ex10 {
    public static void main(String[] args) {

        int arraySize = 20;


        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(21) - 10;
        }


        System.out.print("Original array: ");
        printArray(array);


        int evenCount = 0, oddCount = 0, negativeCount = 0, positiveCount = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (value < 0) {
                negativeCount++;
            } else if (value > 0) {
                positiveCount++;
            }
        }


        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
        int[] negativeArray = new int[negativeCount];
        int[] positiveArray = new int[positiveCount];


        int evenIndex = 0, oddIndex = 0, negativeIndex = 0, positiveIndex = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                evenArray[evenIndex++] = value;
            } else {
                oddArray[oddIndex++] = value;
            }

            if (value < 0) {
                negativeArray[negativeIndex++] = value;
            } else if (value > 0) {
                positiveArray[positiveIndex++] = value;
            }
        }


        System.out.print("Even numbers: ");
        printArray(evenArray);

        System.out.print("Odd numbers: ");
        printArray(oddArray);

        System.out.print("Negative numbers: ");
        printArray(negativeArray);

        System.out.print("Positive numbers: ");
        printArray(positiveArray);
    }


    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
