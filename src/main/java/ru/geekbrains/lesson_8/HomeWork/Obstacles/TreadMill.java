package ru.geekbrains.lesson_8.HomeWork.Obstacles;

import ru.geekbrains.lesson_8.HomeWork.Participants.Obstacle;

public class TreadMill implements Obstacle {
    private int length;

    public TreadMill(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
