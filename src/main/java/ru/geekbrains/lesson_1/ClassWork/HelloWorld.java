package ru.geekbrains.lesson_1.ClassWork;

public class HelloWorld {
    public static void main(String[] args) {
////        System.out.println("Hello World!!!");
//        int myVariable = 100500;
//        int a;
//        a = 10;
//        byte byteVar = 100; //1 byte [-128;127]
//        short shortVar = 555; //2 byte [-32768;32767]
//        int intVar = 100500; //4 byte [-2147483648;2147483647]
//        long longVar = 8_000_000_000L; //8 byte
//
//        boolean booleanVar = true; //true or false //1 byte
//        char charVar = 72; //2 byte [0;65535]
//        char c = 'H';
//        char c1 = '\u1243';
//
//        double doubleVar = 50.1231251231231; //8 byte
//        float floatVar = 10.1231541341f; //4 byte
//
//        String s = " My some string";
//        System.out.println(s);
//        int a = 10;
//        int b = 6;
//        double c =(double) a/b;
//        System.out.println(c);
//        int a = 5;
//        a += 10;
//        System.out.println(a);

//        if (2 > 5){
//            System.out.println("2<5");
//        }   else if (10<11){
//            System.out.println("10<11");
//        }
//        else {
//            System.out.println("else");
//        }
//        System.out.println(10 != 10);
//        int a = 10;
//        int b = 14;
//        int c = 8;
//        int d = a*c+b;
//        System.out.println(d);
//
//        sayHelloWorld();
        calc(10,12,25);
        calc(32,112,10);
    }
    static double calc(double a,double b,double c){

        return a*b*c;
    }
    static void calc(int a, int b, int c){
        int d = a * c +b;
        System.out.println(d);
    }
    static void sayHelloWorld(){
        System.out.println("Hello World");
    }
}
