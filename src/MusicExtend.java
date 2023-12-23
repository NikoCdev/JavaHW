
// Базовый класс Музыкальный инструмент
class MusicalInstrument {
    protected String name;

    public MusicalInstrument(String name) {
        this.name = name;
    }

    public void Sound() {
        System.out.println(name + " издает звук");
    }

    public void Show() {
        System.out.println("Инструмент: " + name);
    }

    public void Desc() {
        System.out.println("Описание инструмента " + name);
    }

    public void History() {
        System.out.println("История инструмента " + name);
    }
}

// Производный класс Тромбон
class Trombone extends MusicalInstrument {
    public Trombone(String name) {
        super(name);
    }

    @Override
    public void Sound() {
        System.out.println(name + " издает глубокий и мощный звук");
    }

    @Override
    public void Desc() {
        System.out.println(name + " - это медный духовой инструмент");
    }

    @Override
    public void History() {
        System.out.println("История тромбона началась в средние века");
    }
}

// Производный класс Укулеле
class Ukulele extends MusicalInstrument {
    public Ukulele(String name) {
        super(name);
    }

    @Override
    public void Sound() {
        System.out.println(name + " издает яркий и веселый звук");
    }

    @Override
    public void Desc() {
        System.out.println(name + " - это маленькая четырехструнная гитара");
    }

    @Override
    public void History() {
        System.out.println("История укулеле началась в XIX веке на Гавайях");
    }
}

// Производный класс Виолончель
class Cello extends MusicalInstrument {
    public Cello(String name) {
        super(name);
    }

    @Override
    public void Sound() {
        System.out.println(name + " издает глубокий и насыщенный звук");
    }

    @Override
    public void Desc() {
        System.out.println(name + " - это большой струнный смычковый инструмент");
    }

    @Override
    public void History() {
        System.out.println("История виолончели началась в XVI веке");
    }
}

class Violin extends MusicalInstrument {
    public Violin(String name) {
        super(name);
    }

    @Override
    public void Sound() {
        System.out.println(name + " издает мелодичный звук");
    }

    @Override
    public void Desc() {
        System.out.println(name + " - струнный смычковый инструмент");
    }

    @Override
    public void History() {
        System.out.println("История скрипки началась в XVI веке");
    }
}

public class MusicExtend {
    public static void main(String[] args) {
        MusicalInstrument trombone = new Trombone("Тромбон");
        MusicalInstrument ukulele = new Ukulele("Укулеле");
        MusicalInstrument cello = new Cello("Виолончель");
        MusicalInstrument violin = new Violin("Скрипка");

        trombone.Sound();
        ukulele.Sound();
        cello.Sound();
        violin.Sound();

        trombone.Desc();
        ukulele.Desc();
        cello.Desc();
        violin.Desc();

        trombone.History();
        ukulele.History();
        cello.History();
        violin.History();
    }

}
