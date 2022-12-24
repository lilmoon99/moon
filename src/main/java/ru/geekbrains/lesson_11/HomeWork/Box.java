package ru.geekbrains.lesson_11.HomeWork;

import java.util.ArrayList;

public class Box<E extends Fruit> {
    ArrayList<E> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public Box(ArrayList<E> fruits) {
        this.fruits = fruits;
    }

    public void add(E element){
        this.fruits.add(element);
    }



    public ArrayList<E> getFruits() {
//        for (E e : box) {
//            System.out.println(e);
//        }
        return fruits;
    }

    public double getWeight(){
        if (this.fruits.size() == 0) return 0.0;
        return this.fruits.size() * this.fruits.get(0).getWeight();
    }

    public boolean compare(Box<? extends Fruit> anotherBox){
        return Math.abs(getWeight() - anotherBox.getWeight())<0.00000001;
    }

    public void AddAllToNewBox(Box<E> anotherBox){
        anotherBox.getFruits().addAll(fruits);
        fruits.clear();
    }


}
