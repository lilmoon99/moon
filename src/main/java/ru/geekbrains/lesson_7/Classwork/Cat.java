package ru.geekbrains.lesson_7.Classwork;

import java.util.Arrays;

public class Cat {
    private String name;
    private int appetite;

    private Flea[] fleas;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fleas = new Flea[20];
    }

    public void getFleas(int count){
        for (int i = 0; i < this.fleas.length&& i<= count; i++) {
            this.fleas[i] = new Flea();
        }
    }

    public void eat(Bowl bowl){
        System.out.printf("%s ate for some food.\n",name);
        bowl.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", fleas=" + Arrays.toString(fleas) +
                '}';
    }
}

