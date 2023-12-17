import java.util.Scanner;

public class Country {
    private String countryName;
    private String continentName;
    private int population;
    private String phoneCode;
    private String capitalName;
    private String[] cities;


    public Country() {
        this.countryName = "Неизвестно";
        this.continentName = "Неизвестно";
        this.population = 0;
        this.phoneCode = "Неизвестно";
        this.capitalName = "Неизвестно";
        this.cities = new String[]{"Неизвестно"};
    }


    public Country(String countryName, String continentName, int population, String phoneCode, String capitalName, String[] cities) {
        setCountryName(countryName);
        setContinentName(continentName);
        setPopulation(population);
        setPhoneCode(phoneCode);
        setCapitalName(capitalName);
        setCities(cities);
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название страны: ");
        this.countryName = scanner.nextLine();
        System.out.print("Введите название континента: ");
        this.continentName = scanner.nextLine();
        System.out.print("Введите количество жителей в стране: ");
        this.population = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите телефонный код страны: ");
        this.phoneCode = scanner.nextLine();
        System.out.print("Введите название столицы: ");
        this.capitalName = scanner.nextLine();
        System.out.print("Введите количество городов в стране: ");
        int numberOfCities = scanner.nextInt();
        scanner.nextLine();

        cities = new String[numberOfCities];
        for (int i = 0; i < numberOfCities; i++) {
            System.out.print("Введите название города " + (i + 1) + ": ");
            cities[i] = scanner.nextLine();
        }
    }


    public void inputData(String countryName, String continentName, int population, String phoneCode, String capitalName, String[] cities) {
        setCountryName(countryName);
        setContinentName(continentName);
        setPopulation(population);
        setPhoneCode(phoneCode);
        setCapitalName(capitalName);
        setCities(cities);
    }

    public void displayData() {
        System.out.println("Название страны: " + countryName);
        System.out.println("Название континента: " + continentName);
        System.out.println("Количество жителей в стране: " + population);
        System.out.println("Телефонный код страны: " + phoneCode);
        System.out.println("Название столицы: " + capitalName);
        System.out.println("Названия городов в стране:");

        for (String city : cities) {
            System.out.println(city);
        }
    }



    public String getCountryName() {
        return countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public int getPopulation() {
        return population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }



    public static void main(String[] args) {
        Country country = new Country();

        country.setCountryName("Украина");
        country.setContinentName("Европа");
        country.setPopulation(40000000);
        country.setPhoneCode("+380");
        country.setCapitalName("Киев");
        country.setCities(new String[]{"Одесса", "Львов", "Харьков", "Донецк"});

        country.displayData();

        System.out.println("Новый объект");
        Country country2 = new Country();
        country2.inputData();
        country2.displayData();

        // Использование конструктора с параметрами
        Country country3 = new Country("Украина", "Европа", 40000000, "+380", "Киев",
                new String[]{"Одесса", "Львов", "Харьков", "Донецк"});
        country3.displayData();
        System.out.println("Новый объект");

        // Использование перегруженного метода inputData
        Country country4 = new Country();
        country2.inputData("Германия", "Европа", 83000000, "+49", "Берлин", new String[]{"Мюнхен", "Гамбург", "Кёльн"});
        country4.displayData();
    }
}