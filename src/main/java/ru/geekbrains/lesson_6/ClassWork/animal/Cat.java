package ru.geekbrains.lesson_6.ClassWork.animal;

public class Cat extends Animal {

    public Cat(String name, String color) {
        super("Cat");
        this.name = name;
        this.color = color;
    }
    @Override
    public void voice(){
        System.out.printf("%s %s meow!\n",TYPE, name);
    }

    public void run(int length){
        System.out.printf("%s %s ran for %d meters\n",TYPE, name,length);
    }



}
