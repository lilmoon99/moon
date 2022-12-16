package ru.geekbrains.lesson_8.HomeWork;

import ru.geekbrains.lesson_8.HomeWork.Obstacles.TreadMill;
import ru.geekbrains.lesson_8.HomeWork.Obstacles.Wall;
import ru.geekbrains.lesson_8.HomeWork.Participants.*;

public class Competition {
    public static void main(String[] args) {


        Obstacle[] obstacles = {
                new Wall(10),
                new Wall(15),
                new TreadMill(200),
                new TreadMill(500),
                new TreadMill(1000),
                new Wall(50)
        };

        Runner[] participants = {
                new Cat("Murzik",10,200),
                new Cat("Persia",5,150),
                new Human("Alex",25,1500),
                new Human("Oleg",13,1000),
                new Robot("C3PO",3,300),
                new Robot("Edward",10,2500)
        };
        for (Runner participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Wall) participant.jump(obstacle.getHeight());
                else participant.run(obstacle.getLength());
                if (!participant.overcome(obstacle)) break;
            }

        }

    }
}
