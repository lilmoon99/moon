package ru.geekbrains.lesson_8.HomeWork.Participants;

public interface Runner {
    String getName();

    String getType();

    int getMaxRun();

    int getMaxJump();

    default boolean run(int length) {
        if (length <= getMaxRun()) {
            System.out.printf("%s %s runs on track for %d meters\r\n", getType(), getName(), length);
            return true;
        } else {
            System.out.printf("%s %s can't run on track for %d meters, he ran only %d meters\r\n", getType(), getName(), length, getMaxRun());
            return false;
        }
    }

    default boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.printf("%s %s jumps over wall for %d sm\r\n", getType(), getName(), height);
            return true;
        } else {
            System.out.printf("%s %s can't jump over wall for %d sm, stay on place\r\n", getType(), getName(), height);
            return false;
        }
    }

    default boolean overcome(Obstacle o) {
        if (o.getLength() > 0) return run(o.getLength());
        else return jump(o.getHeight());
    }
}
