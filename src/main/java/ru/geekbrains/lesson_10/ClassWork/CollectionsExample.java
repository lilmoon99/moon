package ru.geekbrains.lesson_10.ClassWork;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

// Любые коллекции работают только со ссылочными типами данных!!!

public class CollectionsExample {
    public static void main(String[] args) {
//        listExample();
//        Set<String> set = new HashSet<>();
//        set.add("January");
//        set.add("February");
//        set.add("March");
//        set.add("February");
//        System.out.println(set);
        Map<String,Integer> map = new HashMap<>();
        map.put("First",111);
        map.put("Second",222);
        map.put("Third",333);
        map.putIfAbsent("First",555);
        System.out.println(map);
//        Iterator iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }

    private static void listExample() {
        //        RAW use List list = new ArrayList(); до java 5
//        List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();
//        List<String> list1 = new Vector<>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add(0,"February");
        list.set(0,"December");
        list.addAll(Arrays.asList("April","May","June"));
//        list.remove("February");
//        list.remove(2);
//        list.removeIf(s->s.length()>5);
//        list.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() > 5;
//            }
//        });
//        list.addAll(1,Arrays.asList("April","May","June"));
//        ((ArrayList) list).trimToSize();
//        ((ArrayList<?>) list).ensureCapacity(1000);
//        list.removeAll(Arrays.asList("February","June","December"));
//        list.clear();
//        System.out.println(list.get(3));
//        list.contains("May");
//        list.sort((s1,s2) -> s1.length() - s2.length());
//        list.sort(Comparator.comparingInt(String::length));
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
//        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (String s : list) {
//            System.out.println(s);
//        }
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//            iterator.remove();
//        }
//
//        ListIterator iterator = list.listIterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//            iterator.previous();
//        }
//
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//
//        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
