package ru.geekbrains.lesson_10.HomeWork.Task_1;

import java.util.*;

public class HomeWork_1 {
    public static void main(String[] args) {
        System.out.println(getWords(words));
        System.out.println(getWordsCount(words));
        }

    private static final String[] words = {"denominate", "cookery", "investigatory", "education", "son", "zoo", "doctor", "group", "school", "school", "zoo"};
    private static TreeSet<String> getWords(String[] arr){
        return new TreeSet<>(Arrays.asList(arr));
    }
    private static HashMap<String ,Integer> getWordsCount(String[] arr){
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            map.put(word,map.getOrDefault(word,0)+1);
        }
        return map;
    }
}
