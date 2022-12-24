package ru.geekbrains.lesson_11.HomeWork;

public abstract class Fruit {
    private float weight;
    private String Type;

    public Fruit(String type) {
        this.Type = type;
    }

    public float getWeight() {
        return weight;
    }

    public String getType() {
        return Type;
    }
}

