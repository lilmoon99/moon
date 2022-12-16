package ru.geekbrains.lesson_8.ClassWork;

public class Duck implements Moving {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("Duck %s is flying.\n",this.name);
    }

    @Override
    public void move(int length) {
        System.out.printf("Duck %s flew for %d metres.\n",this.name,length);
    }

//    @Override
//    public void doDefault() {
//        Moving.super.doDefault();
//    }
}
