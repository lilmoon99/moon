package ru.geekbrains.lesson_7.HomeWork;

public class Cat {
    private String name;
    private int appetite;
    boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Bowl bowl){
        if (bowl.getFoodAmount()<appetite) {
            System.out.println("Not enough food in bowl.\n");
            satiety = false;
        }
            else {
                System.out.printf("%s ate for some food.\n",name);
                bowl.decreaseFood(appetite);
                satiety = true;
            }
    }

    public void showSatiety(){
        if (!satiety) System.out.printf("%s is hungry!\n",this.name);
        else System.out.printf("%s is well-fed now!\n",this.name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}