package ru.geekbrains.lesson_8.ClassWork;

public class Car {
    private String title;
    private Engine engine;
    private Door door1;

    public Car(String title) {
        this.title = title;
        this.engine = new Engine(100);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", engine=" + engine +
                ", door1=" + door1 +
                '}';
    }

    public void DoSomething(){
        System.out.println(this.engine.power);
    }

    class Engine{
            private int power;
        public void doSomething(){
        title = "skn";
        }
            public Engine(int power) {
            this.power = power;
        }


        public void setPower(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "power=" + power +
                    '}';
        }
    }

    class Door {

    }
}
