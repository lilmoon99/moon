package ru.geekbrains.lesson_1;

public class HomeWork {
    public static void main(String[] args) {
//        int intVar = 10;
//        long longVar = 1000000000000L;
//        byte byteVar = 127;
//        boolean booleanVar = false;
//        float floatVar = 10.4f;
//        double doubleVar = 21.41232131;
//        char charVar = 84;
//        short shortVar = 1000;
//        System.out.println(task3(2.1f,41f,65.9f,11f));
//        System.out.println(task4(5,10));
//        System.out.println(task6(0));
//        task5(-17);
//        task7("Ainur");
//        task8(1900);
    }

    public static float task3(float a,float b,float c,float d){
        return a*(b+(c/d));
    }

    public static boolean task4 (int a,int b){
        int c;
        c = a+b;
        if (c>=10 && c<=20){
            return true;
        }   else return false;
    }
    public static void task5 (int a){
            if (a>=0){
            System.out.println("This number is positive");
        }   else System.out.println("This number is negative");
    }
    public static boolean task6(int a) {
        if (a == 0 || a > 0) {
            return false;
        } else return true;
    }
    public static void task7 (String name){
        System.out.println("Hello, "+name);
    }
    public static void task8(int year){

         if (year %4==0){
             if (year %100==0 && year %400!=0){
                 System.out.println(year+" non-leap year.");
             }
             else System.out.println(year+" leap year.");
        }
        else System.out.println(year + " non-leap year.");
        }
}


