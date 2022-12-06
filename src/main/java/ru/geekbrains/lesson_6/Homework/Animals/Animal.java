package ru.geekbrains.lesson_6.Homework.Animals;

public abstract class Animal {
    public String type ;
    protected String name;

    public Animal(String TYPE,String name){
        this.type = TYPE;
        this.name = name;
    }
    public void run(){
        System.out.printf("%s %s is running!\n",type,name);
    }
    public void run(int length){
        System.out.printf("%s %s ran for %d meters!\n",type,name,length);
    }
    public void swim(){
        System.out.printf("%s %s is swimming!\n",type,name);
    }
    public void swim(int length){
        System.out.printf("%s %s swam for %d meters!\n",type,name,length);
    }
}

