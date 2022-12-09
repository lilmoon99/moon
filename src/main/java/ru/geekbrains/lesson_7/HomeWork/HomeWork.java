package ru.geekbrains.lesson_7.HomeWork;

public class HomeWork {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(9);
        Cat [] cats = {
                new Cat("Barsik",5),
                new Cat("Persia",3),
                new Cat("Murzik",2)
        };
        for (Cat cat: cats) {
            cat.eat(bowl);
            cat.showSatiety();
            System.out.println(cat.toString());
        }
    }
}
