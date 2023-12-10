import java.util.Scanner;
import java.util.Random;
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the line: ");
        int length = scanner.nextInt();

        System.out.print("Enter the direction (horizontal/vertical): ");
        String direction = scanner.next();

        System.out.print("Enter the symbol: ");
        char symbol = scanner.next().charAt(0);

        printCustomLine(length, direction, symbol);

        scanner.close();
    }

    public static void printCustomLine(int length, String direction, char symbol) {
        if (length <= 0) {
            System.out.println("Length must me poitive");
            return;
        }

        if ("horizontal".equalsIgnoreCase(direction)) { //провряем с использованием игнора капса
            printHorizontalLine(length, symbol);
        } else if ("vertical".equalsIgnoreCase(direction)) {
            printVerticalLine(length, symbol);
        } else {
            System.out.println("Error");
        }
    }

    private static void printHorizontalLine(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    private static void printVerticalLine(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.println(symbol);
        }
    }
}
