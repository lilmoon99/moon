package ru.geekbrains.lesson_6.ClassWork.animal;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super("Dog");
        this.name = name;
        this.color = color;
    }
    @Override
    public void voice(){
        System.out.printf("%s %s bark!\n",TYPE, name);
    }

    public void run(int length){
        System.out.printf("%s %s ran for %d meters\n",TYPE, name,length);
    }

}
