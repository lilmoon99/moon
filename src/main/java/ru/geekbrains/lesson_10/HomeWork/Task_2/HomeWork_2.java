package ru.geekbrains.lesson_10.HomeWork.Task_2;

public class HomeWork_2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "ivanov-phone-1");
        phoneBook.add("Petrov", "petrov-phone-1");
        phoneBook.add("Petrov", "89996669999");
        phoneBook.add("Ivanov", "ivanov-phone-2");
        phoneBook.add("Ivanov", "ivanov-phone-3");

        System.out.println("phone Ivanov: " + phoneBook.get("Ivanov"));
    }
}
