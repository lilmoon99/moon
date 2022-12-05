package ru.geekbrains.lesson_6.ClassWork.animal;

public class Snake extends Animal {

    public Snake(String name, String color) {
        super("Snake");
        this.name = name;
        this.color = color;
    }
    @Override
    public void voice(){
        System.out.printf("%s %s SSHSHSHSHSHSHSH bandarlogs!\n",TYPE, name);
    }

    @Override
    public void run(){
            System.out.printf("%s %s crawls st0mach!\n",TYPE, name);
    }

    public void parentRun(){
        super.run();
    }
//
//    public void run(int length){
//        System.out.printf("%s %s crawls for %d meters\n",TYPE, name,length);
//    }

}
