package ru.geekbrains.lesson_9.ClassWork;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionsExample {
    public static void main(String[] args) throws IOException, MyCustomException {
//        example();
//        DataInputStream in = new DataInputStream(new FileInputStream("1231"));
//        try {
//            DataInputStream in = new DataInputStream(new FileInputStream("1231"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            throwsExample();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        try {
            div(10,0);
        } catch (ArithmeticException e){
            throw new MyCustomException();
        }
    }
        private static void customThrow() throws Exception{
        throw new MyCustomException();
}
    private static void throwsExample() throws IOException{
        throw new IOException();
    }

    private static void example() {
        System.out.println("Before Exception.");

        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            System.out.println(a);
            throw new StackOverflowError("asdasd");

        } catch (InputMismatchException | IllegalStateException exception){
//            exception.printStackTrace();
            System.out.println("Caught exception");
        } catch (RuntimeException ex){
            System.out.println("Runtime catch");
        } finally {
            scanner.close();
            System.out.println("Finally");
        }


        System.out.println("After Exception.");

//        System.out.println(div(10,0));
//        int [] arr = {1,2};
//        System.out.println(arr[2]);

        try (Scanner scanner1 = new Scanner(System.in); DataInputStream in = new DataInputStream(new FileInputStream("asasd"))){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static int div(int a,int b){
        return a/b;
    }

    static class MyCustomException extends Exception{
        public MyCustomException() {
        }

        public MyCustomException(String message) {
            super(message);
        }

        public MyCustomException(String message, Throwable cause) {
            super(message, cause);
        }

        public MyCustomException(Throwable cause) {
            super(cause);
        }

        public MyCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
