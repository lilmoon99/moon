package ru.geekbrains.lesson_11.ClassWork;

    public class BoxGen<T>{
//public class BoxGen<T,K>
    private T item;
//    private K item1;
//Can't create generic static field;

    public BoxGen(T item) {
//        T[] arr = new T[10];
//        T[] arr =(T[]) new Object[10];
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
