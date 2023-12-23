class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getDollars() {
        return dollars;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public int getCents() {
        return cents;
    }

    public void display() {
        System.out.println(dollars + " долларов и " + cents + " центов");
    }
}

// Класс Product
class Product {
    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public void reducePrice(int dollarsToReduce, int centsToReduce) {
        int newDollars = this.price.getDollars() - dollarsToReduce;
        int newCents = this.price.getCents() - centsToReduce;

        if (newCents < 0) {
            newCents += 100;
            newDollars -= 1;
        }

        if (newDollars < 0) {
            newDollars = 0;
            newCents = 0;
        }

        this.price.setDollars(newDollars);
        this.price.setCents(newCents);
    }

    public void displayPrice() {
        System.out.print(name + " стоит ");
        price.display();
    }
}

public class MoneyExtend {
    public static void main(String[] args) {
        Money price = new Money(10, 50);
        Product product = new Product("Книга", price);

        product.displayPrice();

        product.reducePrice(2, 25);
        product.displayPrice();
    }
}
