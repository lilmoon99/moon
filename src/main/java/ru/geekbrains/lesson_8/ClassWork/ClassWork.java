package ru.geekbrains.lesson_8.ClassWork;

import java.sql.DatabaseMetaData;

public class ClassWork {
    public static void main(String[] args) {
//        eNumExample();
//        Interfacesexample();
//        innerNestedLocal();
        Moving plane = new Moving() {
            @Override
            public void move() {
                System.out.print("Plane is flying!\n");
            }

            @Override
            public void move(int length) {
                System.out.printf("Plane fly for %d km!\n",length);
            }
        };

        plane.move();
        plane.move(100);
        System.out.println(plane.getClass().getName());

        tryAnonymous(new Attacking() {
            @Override
            public void attack() {
                System.out.println("Anonymous attack!!!");
            }
        });

        tryAnonymous(()-> System.out.println("Lambda attack!"));
        tryLamda(100500, new FuncInterface() {
            @Override
            public void lamda(int count) {
                System.out.println(count);
            }
        });
        tryLamda(555, c-> System.out.println(c));
        tryLamda(777,System.out::println);
    }
private static void tryLamda(int value,FuncInterface funcInterface){
        funcInterface.lamda(value);
}
    private static void tryAnonymous(Attacking attacking){
        attacking.attack();
    }

    private static void innerNestedLocal() {
        Car car = new Car("Lada");
        System.out.println(car);
        Car.Engine engine = car.getEngine();
        Car.Engine engine1 = car.new Engine(100);
        Car.Engine engine2 = new Car("Nissan").new Engine(200);
//        car.setEngine(new Car.Engine(100));
        Tank.NestedClass nested = new Tank.NestedClass("nested field");

        System.out.println(nested);

        class LocalClass{
            String title;
            public LocalClass(String title){
                this.title = title;
            }
            void doSomething(){
                System.out.println("Something local");
            }

        }

        LocalClass local = new LocalClass("LOCAL");
        local.doSomething();
    }

    private static void Interfacesexample() {
        Moving[] units = {
                new Duck("Krya"),
                new Tank("T-34"),
                new Tank("Abrams"),
                new Duck("Krya-Krya"),
                new Supermutant("CP3OMutant")
        };
        for (Moving unit : units) {
            unit.move();
            unit.move(500);
            unit.doDefault();
            if (unit instanceof Attacking) ((Attacking)unit).attack();
        }

        System.out.println(Moving.action);

        Moving.doSomethingStatic();
    }

    private static void eNumExample() {
        WeekDay day = WeekDay.THURSDAY;
        System.out.println(day);
        System.out.println(day.ordinal());
        System.out.println(day.getDayNumber());
        day = WeekDay.SATURDAY;
        System.out.println(day.ordinal());
        System.out.println(day.getRussianName());

        Operator oper = Operator.SUM;
        System.out.println(oper.operation(100500,55));
        oper = Operator.MUL;
        System.out.println(oper.operation(12,12));
    }


}
