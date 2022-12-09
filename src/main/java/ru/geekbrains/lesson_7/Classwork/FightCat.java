package ru.geekbrains.lesson_7.Classwork;

public class FightCat {
    private String name;
    private int health;
    private int damage;

    public FightCat(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void takeHit(int damage){
        this.health -= damage;
        System.out.printf("%s damaged for %d, health now %d\n",this.name,damage,this.health);
    }

    public void hitAnotherCat(FightCat anotherCat){
        anotherCat.health -= this.damage;
        System.out.printf("%s damaged %s for %d, health left %d\n",this.name,anotherCat.name,damage,anotherCat.health);
//        anotherCat.takeHit(this.damage);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
