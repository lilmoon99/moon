package ru.geekbrains.lesson_12.HomeWork;

import java.util.Arrays;
import java.util.List;

public class MultiThread {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    static float[] arr;
    static float[] arr2;


    public static void main(String[] args) throws InterruptedException {
        arr = new float[SIZE];
        arr2 = new float[SIZE];
        Arrays.fill(arr, 1);
        Arrays.fill(arr2,1);
        long a = System.currentTimeMillis();
        MultiThreadMethod(arr);
        System.out.println(System.currentTimeMillis() - a);

        long b = System.currentTimeMillis();
        OneThreadMethod(arr2);
        System.out.println(System.currentTimeMillis() - b);
        System.out.println(Arrays.equals(arr, arr2));
    }

    private static void MultiThreadMethod(float[] arr) throws InterruptedException {
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);
        Thread t1 = new Thread(() -> calculate(arr1, 0));
        Thread t2 = new Thread(() -> calculate(arr2, HALF));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        joinTwoArray(arr1, arr2);
    }

    private static void OneThreadMethod(float[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
//                    Math.cos(0.4f + i / 2));
//        }
        calculate(arr, 0);
    }

    private static void calculate(float[] arr, int offset) {
        for (int index = 0; index < arr.length; index++) {
            float temp = arr[index];
            arr[index] = compute(index + offset, temp);
        }
    }

    private static float compute(int index, float temp) {
        return (float) (temp * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5) *
                Math.cos(0.4f + index / 2));
    }

    private static void joinTwoArray(float[] arr1, float[] arr2) {
        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
    }
}
