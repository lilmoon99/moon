package ru.geekbrains.lesson_5.HomeWork;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivan Ivanov","Manager","IvanIvanov@Ivan.ru",35000,35);
        employeeArray[1] = new Employee("Boris Borisov","Director","BorisBoris@mail.ru",160000,23);
        employeeArray[2] = new Employee("Alex Alexeev","Product Manager","Alexey@goo.gle",60000,48);
        employeeArray[3] = new Employee("Adam Black","SuperHero","BlackAdam@dc.com",51000,47);
        employeeArray[4] = new Employee("Aynur Marshalling","Programmer","lilmoon@moon@com",67000,23);
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge()>40){
                employeeArray[i].employeeInfo();
            }
        }
//        employeeArray[0].employeeInfo();
    }
}
