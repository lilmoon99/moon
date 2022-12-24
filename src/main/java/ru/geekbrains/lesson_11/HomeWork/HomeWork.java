package ru.geekbrains.lesson_11.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        String [] arr = {"1","2","3","4","5"};
//        System.out.println(Arrays.toString(arr));
//        changeElement(arr,5);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(convertToArrayList(arr));
//        Apple apple = new Apple();
//        System.out.println(apple.getWeight());

        Box<Orange> boxForOrange = new Box<>();
        Box<Apple> boxForApple = new Box<>();
        boxForApple.add(new Apple());
        boxForApple.add(new Apple());
        boxForApple.add(new Apple());
//        boxForOrange.add(new Orange());
//        System.out.println(boxForOrange.getFruits());
//        System.out.println(boxForApple.getFruits());
        Box<Apple> boxForApple1 = new Box<>();
        boxForApple1.add(new Apple());
        boxForApple1.add(new Apple());
        System.out.println(boxForApple1.getFruits());
        Box<Apple> boxForApple3 = new Box<>();
        System.out.println(boxForApple3.getFruits());
        boxForApple1.AddAllToNewBox(boxForApple3);
        System.out.println(boxForApple3.getFruits());

    }

    private static <T> void changeElement(T[] arr,int index1,int index2){
            T temp;
            try{
            temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;}
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of bounds.Need index less than:" + (arr.length-1));
                System.out.println("Your index automatically changed to last array element.");
                temp =arr[arr.length-1];
                arr[arr.length-1] = arr[0];
                arr[0] = temp;
            }
        System.out.println(Arrays.toString(arr));
    }

    private static <E> ArrayList<E> convertToArrayList(E[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}

