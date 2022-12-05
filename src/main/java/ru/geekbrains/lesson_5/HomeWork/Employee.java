package ru.geekbrains.lesson_5.HomeWork;

public class Employee {
    private String name;
    private String position;
    private String eMail;
    private int salary;
    private int age;

    public Employee(String name,String position,String eMail,int salary,int age){
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.salary = salary;
        this.age = age;
    }
    public void employeeInfo(){
        System.out.printf(" Name: %s\n Position: %s\n eMail:%s\n Salary: %d\n Age: %d\n",this.name,this.position,this.eMail,this.salary,this.age);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String geteMail() {
        return eMail;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", eMail='" + eMail + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
