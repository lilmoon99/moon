package ru.geekbrains.lesson_3.ClassWork;

import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {
        int [] arr1d = {1,2,3,4,5};
//        print1dArray(arr1d);
        int [][] arr2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(arr2d));
    }
    static void print1dArray (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
