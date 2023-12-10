import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first digit: ");
        int digit1 = scanner.nextInt();
        if (digit1 < 0) digit1 *= -1;

        System.out.print("Enter the second digit: ");
        int digit2 = scanner.nextInt();
        if (digit2 < 0) digit2 *= -1;

        System.out.print("Enter the third digit: ");
        int digit3 = scanner.nextInt();
        if (digit3 < 0) digit3 *= -1;
        //Проверки отрицательности числа, что бы отрицательный ввод не сломал математическую операцию

        int combinedNumber = digit1 * 100 + digit2 * 10 + digit3;

        System.out.println("Result: " + combinedNumber);

        scanner.close();
    }
}
