package ru.geekbrains.lesson_6.ClassWork.animal;

public abstract class Animal {
    public String TYPE;
    protected String name;
    protected String color;

    public Animal(String TYPE){
        this.TYPE = TYPE;
    }

    public void run(){
        System.out.printf("%s %s is walking on paws!\n",TYPE, name);
    }

    public abstract void voice();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        System.out.printf("%s with color %s will be colored in %s\n",this.name,this.color,color);
        this.color = color;
    }
}
