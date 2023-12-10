import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end: ");
        int end = scanner.nextInt();

        // Вывод таблицы умножения
        for (int i = start; i <= end; i++) {
            System.out.println("Multiplication  for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println();
        }

        scanner.close();
    }
}
