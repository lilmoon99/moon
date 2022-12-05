package ru.geekbrains.lesson_6.ClassWork;

import ru.geekbrains.lesson_6.ClassWork.animal.*;

public class Zoo {
    public static void main(String[] args) {
        Animal [] animals = {
                new Cat("Barsik", "black"),
                new Dog("Tuzik", "brawn"),
                new Bird("Chizhik", "yellow"),
                new Snake("Kaa", "green"),
                new Parrot("Kesha","blue")
        };

        for (Animal animal:animals){
            animal.run();
            animal.voice();
            if (animal instanceof Bird){
                ((Bird) animal).fly();
            }
            if (animal instanceof Parrot){
                ((Parrot) animal).speak();
            }
        }
//            Object[] objects = {
//                new Dog("asdas","asd"),
//                    new Parrot("asdasd","asdas"),
//                    10,
//                    "asdasdasd",
//                    .256,
//                    '4'
//            };
//        for (Object object: objects) {
//            System.out.println(object);
//        }
//        for (int i = 0; i < animals.length; i++) {
//            animals[i].voice();
//            animals[i].run();
//            if (i==2) ((Bird) animals[i]).fly();
//        }
//        Snake snake = new Snake("adasd","wqe");
//        snake.parentRun();
//
//        cat.run();
//        cat.run(100);
//        cat.voice();
//
//        dog.run();
//        dog.run(150);
//        dog.voice();
//
//        bird.run();
//        bird.run(10);
//        bird.voice();
//
//        snake.run();
//        snake.run(100);
//        snake.voice();
    }
}
