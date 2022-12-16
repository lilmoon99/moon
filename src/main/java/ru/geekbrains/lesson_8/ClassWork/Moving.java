package ru.geekbrains.lesson_8.ClassWork;

public interface Moving {

    String action = "Move";
    void move();
    void move(int length);
    //java 9+
    static void doSomethingStatic(){
        System.out.println("STATIC");
    }

    private void doSomethingPrivate(){
        System.out.println("Private");
    }

    default void doDefault(){
        doSomethingPrivate();
        System.out.println("Default action");
    }
}
