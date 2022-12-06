package ru.geekbrains.lesson_6.Homework;

import ru.geekbrains.lesson_6.Homework.Animals.Animal;
import ru.geekbrains.lesson_6.Homework.Animals.Cat;
import ru.geekbrains.lesson_6.Homework.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = {
                new Cat("Cat","Barsik"),
                new Dog("Dog","Bobik"),
                new Cat("Cat","Persia"),
                new Dog("Dog","Mukhtar"),
                new Dog("Dog","Rex")
        };

        for (Animal a: animals) {
            a.run();
            a.run(500);
            a.run(100);
            a.swim();
            a.swim(10);
            a.swim(15);
        }
        Cat.counter();
        Dog.counter();
    }
}
