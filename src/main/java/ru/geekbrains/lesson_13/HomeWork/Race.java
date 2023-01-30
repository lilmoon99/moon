package ru.geekbrains.lesson_13.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    private ArrayList<Stage> stages;
    private Object mon;

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Object getMon() {
        return mon;
    }

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
        this.mon = new Object();
    }
}
