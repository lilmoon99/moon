package ru.geekbrains.lesson_10.HomeWork.Task_2;

import java.util.*;

public class PhoneBook {
    Map<String, Set<String>>  book = new TreeMap<>();

    public void add(String surname,String phoneNumber){
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }

    private Set<String> getPhones(String surname){
        return book.computeIfAbsent(surname,key -> new TreeSet<>());
    }
    public Set<String> get(String surname){
        return getPhones(surname);
    }

    public Set<String> getAllSurnames(){
        return book.keySet();
    }
}
