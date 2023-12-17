import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pageCount;


    public Book() {
    }


    public Book(String title, String author, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }


    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        this.title = scanner.nextLine();
        System.out.print("Введите ФИО автора: ");
        this.author = scanner.nextLine();
        System.out.print("Введите год выпуска: ");
        this.year = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Введите название издательства: ");
        this.publisher = scanner.nextLine();
        System.out.print("Введите жанр книги: ");
        this.genre = scanner.nextLine();
        System.out.print("Введите количество страниц: ");
        this.pageCount = scanner.nextInt();
    }


    public void inputData(String title, String author, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }


    public void displayData() {
        System.out.println("Название книги: " + title);
        System.out.println("ФИО автора: " + author);
        System.out.println("Год выпуска: " + year);
        System.out.println("Название издательства: " + publisher);
        System.out.println("Жанр книги: " + genre);
        System.out.println("Количество страниц: " + pageCount);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.inputData();
        book1.displayData();

        System.out.println("Новая книга");
        Book book2 = new Book();
        book2.inputData("Java: The Complete Reference", "Herbert Schildt", 2019, "McGraw-Hill", "Programming", 1321);
        book2.displayData();
    }
}