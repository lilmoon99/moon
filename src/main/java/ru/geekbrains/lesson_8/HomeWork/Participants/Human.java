package ru.geekbrains.lesson_8.HomeWork.Participants;


public class Human implements Runner {
    private String type;
    private String name;
    private final int MaxJumpHeight;
    private final int MaxRunLength;

    public Human(String name, int maxJumpHeight, int maxRunLength) {
        this.type = "Human";
        this.name = name;
        this.MaxJumpHeight = maxJumpHeight;
        this.MaxRunLength = maxRunLength;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMaxRun() {
        return MaxRunLength;
    }

    @Override
    public int getMaxJump() {
        return MaxJumpHeight;
    }
}
