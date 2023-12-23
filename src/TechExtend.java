

// Базовый класс Устройство
class Device {
    protected String name;

    public Device(String name) {
        this.name = name;
    }

    public void Sound() {
        // Общий метод для звука, можно переопределить в производных классах
        System.out.println(name + " издает звук");
    }

    public void Show() {
        System.out.println("Устройство: " + name);
    }

    public void Desc() {
        // Общее описание, можно переопределить в производных классах
        System.out.println("Описание устройства " + name);
    }
}

// Производный класс Чайник
class Kettle extends Device {
    public Kettle(String name) {
        super(name);
    }

    @Override
    public void Sound() {
        System.out.println(name + " шипит");
    }

    @Override
    public void Desc() {
        System.out.println("Это чайник, используется для кипячения воды");
    }
}

// Производный класс Микроволновка
class Microwave extends Device {
    public Microwave(String name) {
        super(name);
    }

    @Override
    public void Sound() {
        System.out.println(name + " гудит");
    }

    @Override
    public void Desc() {
        System.out.println("Это микроволновка, используется для разогрева пищи");
    }
}

// Производный класс Автомобиль
class Car extends Device {
    public Car(String name) {
        super(name);
    }

    @Override
    public void Sound() {
        System.out.println(name + " делает звук двигателя");
    }

    @Override
    public void Desc() {
        System.out.println("Это автомобиль, используется для передвижения");
    }
}

// Производный класс Пароход
class Steamboat extends Device {
    public Steamboat(String name) {
        super(name);
    }

    @Override
    public void Sound() {
        System.out.println(name + " гудит");
    }

    @Override
    public void Desc() {
        System.out.println("Это пароход, используется для путешествий по воде");
    }
}



public class TechExtend {
    public static void main(String[] args) {
        Device kettle = new Kettle("Чайник");
        Device microwave = new Microwave("Микроволновка");
        Device car = new Car("Автомобиль");
        Device steamboat = new Steamboat("Пароход");

        kettle.Sound();
        microwave.Sound();
        car.Sound();
        steamboat.Sound();

        kettle.Desc();
        microwave.Desc();
        car.Desc();
        steamboat.Desc();



    }

}
