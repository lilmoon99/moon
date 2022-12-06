package ru.geekbrains.lesson_6.Homework.Animals;

public class Cat extends Animal{
    public Cat(String TYPE, String name) {
        super(TYPE, name);
        counter++;
    }
    private int maxSwimLength = 0;
    private int maxRunLength = 200;
    private static int counter;

    @Override
    public void swim(){
        System.out.printf("%s %s can't swim!\n",type,name);
    }

    public void swim(int length){
        System.out.printf("%s %s can't swim!\n",type,name);
    }

    @Override
    public void run(int length){
    if (length>maxRunLength){
        System.out.printf("%s %s can run only for %d metres\n",type,name,maxRunLength);
    } else System.out.printf("%s %s ran for %d metres!\n",type,name,length);
    }

    public static void counter(){
        System.out.printf("Number of created cats: %d.\n",counter);
    }
}
