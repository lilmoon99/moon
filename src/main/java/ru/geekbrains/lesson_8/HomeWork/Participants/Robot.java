package ru.geekbrains.lesson_8.HomeWork.Participants;


public class Robot implements Runner {
    private String type;
    private String name;
    private final int MaxJumpHeight;
    private final int MaxRunLength;

    public Robot(String name, int maxJumpHeight, int maxRunLength) {
        this.type = "Robot";
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
