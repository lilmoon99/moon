package ru.geekbrains.lesson_8.ClassWork;

public class Supermutant implements Moving,Attacking {
    private String name;

    public Supermutant(String name) {
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
        System.out.printf("Supermutant %s is walking on tentacles.\n",this.name);
    }

    @Override
    public void move(int length) {
        System.out.printf("Supermutant %s walked for %d metres.\n",this.name,length);
    }

    @Override
    public void attack() {
        System.out.printf("Supermutant %s bites by his teeth.\n",this.name);
    }
}
