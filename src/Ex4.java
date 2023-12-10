import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a six-digit number: ");
        int userInput = scanner.nextInt();

        if (isSix(userInput)) {
            int firstDigit = userInput / 100000;
            int secondDigit = (userInput / 10000) % 10;
            int thirdDigit = (userInput / 1000) % 10;
            int fourthDigit = (userInput / 100) % 10;
            int fifthDigit = (userInput / 10) % 10;
            int sixthDigit = userInput % 10;

            // Swap digits
            int temp = firstDigit;
            firstDigit = sixthDigit;
            sixthDigit = temp;

            temp = secondDigit;
            secondDigit = fifthDigit;
            fifthDigit = temp;


            int swappedNumber = firstDigit * 100000 +
                    secondDigit * 10000 +
                    thirdDigit * 1000 +
                    fourthDigit * 100 +
                    fifthDigit * 10 +
                    sixthDigit;

            System.out.println("Original number: " + userInput);
            System.out.println("Number  swapped: " + swappedNumber);
        } else {
            System.out.println("Error: Enter a six-digit number.");
        }

        scanner.close();
    }

        private static boolean isSix(int number) {
            return number >= 100000 && number <= 999999;
        }

}
