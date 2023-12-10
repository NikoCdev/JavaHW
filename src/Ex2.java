import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter digit: ");
        double value = scanner.nextDouble();


        System.out.print("Enter %: ");
        double percent = scanner.nextDouble();


        double result = (percent / 100) * value;


        System.out.println("result: " + result);


        scanner.close();
    }
}
