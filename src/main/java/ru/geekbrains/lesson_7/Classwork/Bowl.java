package ru.geekbrains.lesson_7.Classwork;

public class Bowl {
    private int foodAmount;

    public void putFood(int amount){
        this.foodAmount += amount;
        System.out.printf("Bowl food amount increased,now %d\n",this.foodAmount);
    }
    public void decreaseFood(int amount){
        this.foodAmount -= amount;
        System.out.printf("Bowl food amount decreased,now %d\n",this.foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}
