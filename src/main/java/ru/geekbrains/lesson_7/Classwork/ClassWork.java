package ru.geekbrains.lesson_7.Classwork;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
//        equalsExample();
//        stringBuilderExample();
//        Cat cat = new Cat("Murzik",10);
//        Bowl bowl = new Bowl();
//        bowl.putFood(40);
//        cat.eat(bowl);
//        cat.getFleas(5);
//        System.out.println(cat);

        FightCat cat1 = new FightCat("Barsik",120,15);
        FightCat cat2 = new FightCat("Murzik",70,22);
        while(cat1.getHealth()>0 && cat2.getHealth()>0){
            cat1.hitAnotherCat(cat2);
            cat2.hitAnotherCat(cat1);
        }
    }

    private static void stringBuilderExample() {
        String s1 = "Example";
        long delta = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            s1 += i;
        }

        long time = System.currentTimeMillis() - delta;
        System.out.println(s1);
        System.out.println();
        System.out.println("Time is " + time);

        StringBuilder sb = new StringBuilder("Example");
        delta = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            sb.append(i);
        }

        time = System.currentTimeMillis() - delta;
//        System.out.println(s1);
        System.out.println();
        System.out.println("Time is " + time);
        System.out.println(s1.equals(sb.toString()));
    }

    private static void equalsExample() {
        String [] strings = {"one","two","three","four"};
//        for (String s: strings) {
//            System.out.println(s);
//        }
//        int [] arr = {1,2,3,4,5,6,7};
//        for (int i : arr) {
//            System.out.print(i);
//        }
        Scanner scanner = new Scanner(System.in);
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel";
        String s4 = "lo";
        String s5 = (s3+s4).intern();
        String s6 = new String("Hello");
        String s7 = new String(new char[] {'H','e','l','l','o'}).intern();
        String s8 = new String(new byte[]{26,42,72,56,48});
        String s9 = new String(s7);
        String s10 = scanner.next();

//        System.out.println(s1 == s2);
//        System.out.println(s1 == s5);
//        System.out.println(s1 == s6);
//        System.out.println(s1 == s7);
//        System.out.println(s1 == s9);
//        System.out.println(s1 == s10);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
        System.out.println(s1.equals(s7));
        System.out.println(s1.equals(s9));
        System.out.println(s1.equals(s10));

        System.out.println(s8);
    }

}
