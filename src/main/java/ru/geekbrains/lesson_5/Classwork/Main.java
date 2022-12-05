package ru.geekbrains.lesson_5.Classwork;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik","red",2,"Sphinx");
//        cat.name = "Barsik";
//        cat.color = "red";
//        cat.age = 2;
//        cat.breed = "Sphinx";
        System.out.println(cat);

        cat.setColor("blue");

        System.out.println(cat);

        cat.run();
        cat.voice();

//        Cat cat1 = new Cat("Barsik","black",3,"Scotch");
//        cat1.name = "Murzik";
//        cat1.color = "black";
//        cat1.age = 3;
//        cat1.breed = "Scotch";
//
//
//        cat1.run();
//        cat1.voice();
//        cat1.run(100);

//        System.out.println(cat.TYPE);
//        System.out.println(cat1.TYPE);
////        Cat.doSomethingStatic();
//        cat.TYPE = "asdajsd";
//        System.out.println(cat.TYPE);
//        System.out.println(cat1.TYPE);
    }
}
