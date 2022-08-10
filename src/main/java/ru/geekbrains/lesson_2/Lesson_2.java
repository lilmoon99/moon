package ru.geekbrains.lesson_2;

public class Lesson_2 {
    public static void main(String[] args) {
        switchExample();
        loopsExample();
    }

    private static void loopsExample() {
        int count1 = 0;
        while (count1 <= 100) {
            count1++;
            if (count1 % 2 != 0) continue;
            System.out.println(count1);
        }
        do {
            System.out.println(count1++);
        } while (count1 <= 10);
//        инициализация условие итерация
        for (int count = 0; count <= 10; count++) {
            if (count % 3 == 0) continue;
            System.out.println(count);
            if (count == 6) break;
            int count2 = 5;
            for (; ; ) {
                System.out.println(count2++);
            }
        }
    }

    private static void switchExample () {
            int someNumber = 1;
            String result = someNumber < 0 ? "negative" : "positive";
            System.out.println(result);

            switch (someNumber) {
                case 1:
                    System.out.println("Its 1");
                    break;
                case 2:
                    System.out.println("Its 2");
                    break;
                case 3:
                    System.out.println("Its 3");
                    break;
                default:
                    System.out.println("stop");
            }
        }

    }