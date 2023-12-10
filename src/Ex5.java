import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            String season;

            if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
                season = "Winter";
            } else if (monthNumber >= 3 && monthNumber <= 5) {
                season = "Spring";
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                season = "Summer";
            } else {
                season = "Autumn";
            }

            System.out.println("The season is: " + season);
        } else {
            System.out.println("Error: number between 1 and 12.");
        }

        scanner.close();
    }

}
