import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in meters: ");
        double meters = scanner.nextDouble();

        System.out.println("Choose the conversion option:");
        System.out.println("1. Convert to miles");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to yards");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                convertToMiles(meters);
                break;
            case 2:
                convertToInches(meters);
                break;
            case 3:
                convertToYards(meters);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }

        scanner.close();
    }

    private static void convertToMiles(double meters) {
        double miles = meters * 0.000621371;
        System.out.println(meters + " meters is  " + miles + " miles.");
    }

    private static void convertToInches(double meters) {
        double inches = meters * 39.3701;
        System.out.println(meters + " meters is  " + inches + " inches.");
    }

    private static void convertToYards(double meters) {
        double yards = meters * 1.09361;
        System.out.println(meters + " meters is  " + yards + " yards.");
    }


}


