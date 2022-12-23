package ru.geekbrains.lesson_11.ClassWork;

public class Box {
    private Object obj;

    public Box(Object obj){
        this.obj = obj;
    }
    public Object getObj(){
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
