

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Класс Тигр, наследуется от Животное
class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    public void roar() {
        System.out.println(name + " рычит");
    }
}

// Класс Крокодил, наследуется от Животное
class Crocodile extends Animal {
    public Crocodile(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(name + " плавает");
    }
}

// Класс Кенгуру, наследуется от Животное
class Kangaroo extends Animal {
    public Kangaroo(String name) {
        super(name);
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }
}

public class AnimalExtend {

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Люций");
        Crocodile crocodile = new Crocodile("Гена");
        Kangaroo kangaroo = new Kangaroo("Тоха");

        tiger.roar();
        crocodile.swim();
        kangaroo.jump();
    }

}
