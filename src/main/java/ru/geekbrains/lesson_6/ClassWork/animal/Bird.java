package ru.geekbrains.lesson_6.ClassWork.animal;

public class Bird extends Animal {

    public Bird(String name, String color) {
        super("Bird");
        this.name = name;
        this.color = color;
    }
    @Override
    public void voice(){
        System.out.printf("%s %s krya!\n",TYPE, name);
    }

    public void fly(){
        System.out.printf("%s %s flies!\n",TYPE,this.name);
    }

    public void run(int length){
        System.out.printf("%s %s ran for %d meters\n",TYPE, name,length);
    }



}
