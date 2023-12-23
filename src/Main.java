// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

    // Базовый класс Human
    class Human {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    // Класс Builder, наследуется от Human
    class Builder extends Human {
        private String tool;

        public Builder(String name, int age, String tool) {
            super(name, age);
            this.tool = tool;
        }

        public void build() {
            System.out.println("Строить");
        }
    }

    // Класс Sailor, наследуется от Human
    class Sailor extends Human {
        private String ship;

        public Sailor(String name, int age, String ship) {
            super(name, age);
            this.ship = ship;
        }

        public void sail() {
            System.out.println("Плавать");
        }
    }

    // Класс Pilot, наследуется от Human
    class Pilot extends Human {
        private String aircraft;

        public Pilot(String name, int age, String aircraft) {
            super(name, age);
            this.aircraft = aircraft;
        }

        public void fly() {
            System.out.println("Летать");
        }
    }

    // Главный класс с методом main
    public class Main {
        public static void main(String[] args) {
            Builder builder = new Builder("Алексей", 35, "Молоток");
            Sailor sailor = new Sailor("Иван", 28, "Яхта");
            Pilot pilot = new Pilot("Мария", 33, "Самолет");

            builder.build();
            sailor.sail();
            pilot.fly();
        }
    }

