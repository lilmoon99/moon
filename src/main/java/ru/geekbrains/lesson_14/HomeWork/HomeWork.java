package ru.geekbrains.lesson_14.HomeWork;

import lombok.NonNull;
import lombok.ToString;
import org.apache.logging.log4j.core.util.JsonUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
//        int[] array = {1, 2, 2, 2, 2, 3, 2, 1, 7};
        int[] array = {4, 4, 6, 5, 1, 2, 2, 8, 1};
        int[] array2 = {1, 1, 1, 4, 4, 1, 4, 4};
        int[] array3 = {1, 1, 1, 1, 1, 1};
        int[] array4 = {4, 4, 4, 4};

//        System.out.println(Arrays.toString(task1(array)));
        System.out.println(Arrays.toString(array) + " -> " + task2(array));
        System.out.println(Arrays.toString(array2) + " -> " + task2(array2));
        System.out.println(Arrays.toString(array3) + " -> " + task2(array3));
        System.out.println(Arrays.toString(array4) + " -> " + task2(array4));
    }

    public static int[] task1(int @NonNull [] array) {
        boolean isThereNumber4 = false;
        int[] newArray = new int[array.length + 1];
        int delimiter = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) counter++;
        }
        if (counter > 0) {
            isThereNumber4 = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 4) {
                    delimiter = i;
                }
            }
        } else {
            System.out.println("Need array with '4'.");
            throw new RuntimeException();
        }

//            System.arraycopy(array,delimiter+1,newArray,0,array.length-1-delimiter);
        newArray = Arrays.copyOfRange(array, delimiter + 1, array.length);


        return newArray;
    }

    public static boolean task2(int @NonNull [] array) {
        int counter1 = 0;
        int counter4 = 0;
        boolean isThere1and4 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) counter1++;
            if (array[i] == 4) counter4++;
            if (array[i] != 1 & array[i] != 4) {
                break;
            }

        }
        if (counter1 > 0 && counter4 > 0) {
            isThere1and4 = true;
        }
        return isThere1and4;
    }
}


