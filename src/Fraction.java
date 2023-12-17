import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    // Конструктор без параметров
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Конструктор с параметрами
    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числитель: ");
        int newNumerator = scanner.nextInt();
        System.out.print("Введите знаменатель: ");
        int newDenominator = scanner.nextInt();
        setNumerator(newNumerator);
        setDenominator(newDenominator);
    }


    public void inputData(int newNumerator, int newDenominator) {
        setNumerator(newNumerator);
        setDenominator(newDenominator);
    }

    public void displayData() {
        System.out.println("Дробь: " + numerator + "/" + denominator);
    }



    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce();
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
            reduce();
        } else {
            System.out.println("Знаменатель не может быть равен нулю.");
        }
    }

    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    private void reduce() {
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public Fraction add(Fraction other) {
        Fraction result = new Fraction();
        result.setNumerator(this.numerator * other.denominator + other.numerator * this.denominator);
        result.setDenominator(this.denominator * other.denominator);
        return result;
    }

    public Fraction subtract(Fraction other) {
        Fraction result = new Fraction();
        result.setNumerator(this.numerator * other.denominator - other.numerator * this.denominator);
        result.setDenominator(this.denominator * other.denominator);
        return result;
    }

    public Fraction multiply(Fraction other) {
        Fraction result = new Fraction();
        result.setNumerator(this.numerator * other.numerator);
        result.setDenominator(this.denominator * other.denominator);
        return result;
    }

    public Fraction divide(Fraction other) {
        Fraction result = new Fraction();
        result.setNumerator(this.numerator * other.denominator);
        result.setDenominator(this.denominator * other.numerator);
        return result;
    }



    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        fraction1.setNumerator(3);
        fraction1.setDenominator(4);

        Fraction fraction2 = new Fraction();
        fraction2.inputData();

        fraction1.displayData();
        fraction2.displayData();

        Fraction sum = fraction1.add(fraction2);
        System.out.print("Сумма: ");
        sum.displayData();

        Fraction test1 = fraction1.subtract(fraction2);
        System.out.print("Разность: ");
        test1.displayData();

        Fraction test2 = fraction1.multiply(fraction2);
        System.out.print("Произведение: ");
        test2.displayData();

        Fraction test3 = fraction1.divide(fraction2);
        System.out.print("Частное: ");
        test3.displayData();



    }
}