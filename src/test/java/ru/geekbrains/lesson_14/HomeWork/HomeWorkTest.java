package ru.geekbrains.lesson_14.HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;

class HomeWorkTest {
    private HomeWork homeWork;
    //    int [] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
//    int [] array = {2, 4, 4, 5, 5, 4, 1, 1 ,1};
    int [] array = {4, 4, 6, 5, 1, 2, 2, 8, 1};
//    int [] array = {1, 8, 8, 8, 4, 2, 2, 1, 0};
//    int[] array = {1, 8, 8, 8, 2, 2, 2, 1, 0};
//        @BeforeEach
//         void init(){
//        homeWork = new HomeWork();
//        }

    //        @ParameterizedTest
//        @CsvFileSource(files = {"tests/HW_filesourse_1.csv"},delimiter = '|')
//        void MassTest(int [] a,int [] result){
//            Assertions.assertArrayEquals(result,task1(a));
//        }
    @Test
    void task1() {
//        int[] result = {1, 7};
//        int[] result = {1, 1, 1};
        int[] result = {6,5,1,2,2,8,1};
//        int[] result = {2,2,1,0};
        boolean isThereNumber4 = false;
        int[] newArray;
        int delimiter = 0;
        int counter = 0;
        for (int j : array) {
            if (j == 4) counter++;
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
        Assertions.assertArrayEquals(result, newArray);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(newArray));
    }
}