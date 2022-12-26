package ru.geekbrains.lesson_12.ClassWork;

public class WaitNotify {
    private static final Object mon = new Object();
    private static int flag = 0;

    public static void main(String[] args) {
        new Thread(WaitNotify::printHello).start();
        new Thread(WaitNotify::printWorld).start();
    }
    private static void printHello(){
        synchronized (mon){
            try{
                for (int i = 0; i < 5; i++) {
                    while (flag != 0) {
                        mon.wait();
                    }
                    System.out.print("Hello ");
                    Thread.sleep(500);
                    flag = 1;
                    mon.notifyAll();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    private static void printWorld(){
        synchronized (mon){
            try{
                for (int i = 0; i < 5; i++) {
                    while (flag != 1){
                        mon.wait();
                    }
                    System.out.println("world!");
                    Thread.sleep(500);
                    flag = 0;
                    mon.notifyAll();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
