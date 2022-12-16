package ru.geekbrains.lesson_8.HomeWork.Obstacles;

import ru.geekbrains.lesson_8.HomeWork.Participants.Obstacle;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
