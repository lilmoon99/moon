package ru.geekbrains.lesson_2.HomeWork;

import java.util.Arrays;
import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
    }

    static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
            System.out.print(arr[i] + "  ");
        }
    }

    static void task2() {
        int[] arr = new int[8];
        for (int i = 1; i < arr.length; i++) {
            arr[0] = 0;
            arr[i] = arr[i - 1] + 3;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    static void task4() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static void task5() {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        int max = arr[0];
        int min = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max " + max);
        System.out.println("min " + min);
    }
}