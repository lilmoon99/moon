package ru.geekbrains.lesson_6.Homework.Animals;

public class Dog extends Animal{
    public Dog (String TYPE,String name){
        super(TYPE,name);
        counter++;
    }
    int maxSwimLength = 10;
    int maxRunLength = 500;
    private static int counter;

    @Override
    public void run(int length){
        if (length>maxRunLength) System.out.printf("%s %s can run only for %d meters!\n",type,name,maxRunLength);
        else System.out.printf("%s %s ran for %d meters!\n",type,name,length);
    }

    public void swim(int length){
        if (length>maxSwimLength) System.out.printf("%s %s can swim only for %d meters!\n",type,name,maxSwimLength);
        else System.out.printf("%s %s swam for %d meters!\n",type,name,length);
    }

    public static void counter(){
        System.out.printf("Number of created dogs: %d",counter);
    }
}
