package ru.geekbrains.lesson_6.ClassWork.animal;

public class Parrot extends Bird{
    public Parrot(String name,String color){
        super(name, color);
        this.TYPE = "Parrot";
    }

    @Override
    public void voice() {
        System.out.printf("%s %s chik cheereek!\n",TYPE, name);
    }

    public void speak(){
        System.out.printf("%s blah blah blah\n",this.name);
    }
}
