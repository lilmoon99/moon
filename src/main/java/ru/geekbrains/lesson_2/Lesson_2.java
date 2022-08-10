package ru.geekbrains.lesson_2;

public class Lesson_2 {
    public static void main(String[] args) {
        int someNumber = 1;
//        String result = someNumber <0 ? "negative" : "positive";
//        System.out.println(result);

        switch (someNumber){
            case 1 :
                System.out.println("Its 1"); break;
            case 2 :
                System.out.println("Its 2"); break;
            case 3 :
                System.out.println("Its 3"); break;
            default:
                System.out.println("stop");
        }
    }
}
