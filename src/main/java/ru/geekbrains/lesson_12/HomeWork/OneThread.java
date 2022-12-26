package ru.geekbrains.lesson_12.HomeWork;

import java.util.Arrays;

public class OneThread {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE/2;
    public static void main(String[] args) {
        float [] arr = new float[SIZE];
        fill(arr);
        long a = System.currentTimeMillis();
        calculate(arr);
        System.out.println(System.currentTimeMillis()- a);
//        System.out.println(Arrays.toString(arr));
        
    }
    static void fill(float[] arr){
        Arrays.fill(arr, 1f);
    }
    
    static void calculate(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
    }
}
