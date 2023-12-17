import java.util.Scanner;

public class Human {
    private String fullName;
    private String birthDate;
    private String contactPhone;
    private String city;
    private String country;
    private String homeAddress;


    public Human() {

        this.fullName = "Неизвестно";
        this.birthDate = "01.01.2000";
        this.contactPhone = "Неизвестно";
        this.city = "Неизвестно";
        this.country = "Неизвестно";
        this.homeAddress = "Неизвестно";
    }


    public Human(String fullName, String birthDate, String contactPhone, String city, String country, String homeAddress) {
        setFullName(fullName);
        setBirthDate(birthDate);
        setContactPhone(contactPhone);
        setCity(city);
        setCountry(country);
        setHomeAddress(homeAddress);
    }


    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        this.fullName = scanner.nextLine();
        System.out.print("Введите дату рождения: ");
        this.birthDate = scanner.nextLine();
        System.out.print("Введите контактный телефон: ");
        this.contactPhone = scanner.nextLine();
        System.out.print("Введите город: ");
        this.city = scanner.nextLine();
        System.out.print("Введите страну: ");
        this.country = scanner.nextLine();
        System.out.print("Введите домашний адрес: ");
        this.homeAddress = scanner.nextLine();
    }


    public void inputData(String fullName, String birthDate, String contactPhone, String city, String country, String homeAddress) {
        setFullName(fullName);
        setBirthDate(birthDate);
        setContactPhone(contactPhone);
        setCity(city);
        setCountry(country);
        setHomeAddress(homeAddress);
    }

    public void displayData() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Контактный телефон: " + contactPhone);
        System.out.println("Город: " + city);
        System.out.println("Страна: " + country);
        System.out.println("Домашний адрес: " + homeAddress);
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public static void main(String[] args) {
        // Использование конструктора с параметрами
        Human person = new Human("Коваль Никита Русланович", "19.06.2006", "+971522347604", "Одесса", "Украина", "ул. Богдана Габсбурга 3");
        person.displayData();



        // Использование перегруженного метода inputData без параметров
        System.out.println("Новый Объект");
        Human person2 = new Human();
        person2.inputData();
        person2.displayData();



        // Использование перегруженного метода inputData с параметрами
        System.out.println("Новый Объект");
        Human person3 = new Human();
        person3.inputData("Коваль Никита Русланович", "19.06.2006", "+971522347604", "Одесса", "Украина", "ул. Богдана Габсбурга 3");
        person3.displayData();
    }
}


