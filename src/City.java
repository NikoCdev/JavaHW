import java.util.Scanner;

public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private int population;
    private String postalCode;
    private String phoneCode;

    // Конструктор без параметров
    public City() {
        // Инициализация значений по умолчанию
        this.cityName = "Неизвестно";
        this.regionName = "Неизвестно";
        this.countryName = "Неизвестно";
        this.population = 0;
        this.postalCode = "Неизвестно";
        this.phoneCode = "Неизвестно";
    }

    // Конструктор с параметрами
    public City(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode) {
        setCityName(cityName);
        setRegionName(regionName);
        setCountryName(countryName);
        setPopulation(population);
        setPostalCode(postalCode);
        setPhoneCode(phoneCode);
    }

    // Перегруженный метод inputData для ввода данных из консоли
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название города: ");
        this.cityName = scanner.nextLine();
        System.out.print("Введите название региона: ");
        this.regionName = scanner.nextLine();
        System.out.print("Введите название страны: ");
        this.countryName = scanner.nextLine();
        System.out.print("Введите количество жителей в городе: ");
        this.population = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите почтовый индекс города: ");
        this.postalCode = scanner.nextLine();
        System.out.print("Введите телефонный код города: ");
        this.phoneCode = scanner.nextLine();
    }

    // Перегруженный метод inputData с параметрами для ввода данных с указанием параметров
    public void inputData(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode) {
        setCityName(cityName);
        setRegionName(regionName);
        setCountryName(countryName);
        setPopulation(population);
        setPostalCode(postalCode);
        setPhoneCode(phoneCode);
    }

    public void displayData() {
        System.out.println("Название города: " + cityName);
        System.out.println("Название региона: " + regionName);
        System.out.println("Название страны: " + countryName);
        System.out.println("Количество жителей в городе: " + population);
        System.out.println("Почтовый индекс города: " + postalCode);
        System.out.println("Телефонный код города: " + phoneCode);
    }

    public String getCityName() {
        return cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public static void main(String[] args) {

        City city = new City("Одесса", "Одесская область", "Украина", 1000000, "65000", "+380");
        city.displayData();

        System.out.println("Новый объект");
        City city2 = new City();
        city2.inputData();
        city2.displayData();

        System.out.println("Новый объект");
        City city3 = new City();
        city3.inputData("Николаев", "Николаевская область", "Украина", 500000, "54000", "+380");
        city3.displayData();
    }
}