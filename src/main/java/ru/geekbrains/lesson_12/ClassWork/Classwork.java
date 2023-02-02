package ru.geekbrains.lesson_12.ClassWork;


import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;

public class Classwork {

    static int a = 0;
    static int b = 0;
    static int c = 0;
    private static final Object mon1 = new Object();
    private static final Object mon2 = new Object();


    public static void main(String[] args) throws InterruptedException {
//    Thread.getAllStackTraces().forEach((k,v) -> System.out.println(k+ ": " + v));
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        threadsStart();
//        callableExample();
//        interrupt();
//        raceExample();
//        new Thread(Classwork::doA).start();
//        new Thread(Classwork::doB).start();
//        List<String > list = List.of("One","Two","Three");
//        list.forEach(System.out::println);


    }

    private synchronized static void doA() {
        synchronized (mon1) {
            try {
                System.out.println("Start A...");
                Thread.sleep(3000);
                System.out.println("Finish A...");
            } catch (InterruptedException e) {
                e.printStackTrace();
                doB();
            }
        }
    }

    private synchronized static void doB() {
        synchronized (mon2) {
            try {
                System.out.println("Start B...");
                Thread.sleep(3000);
                System.out.println("Finish B...");
                doA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private static void raceExample() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });


        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.printf("a = %d, b=%d, c = %d\n", a, b, c);
    }

    private synchronized static void increment() {
        a += 1;
        b += 1;
        c += 1;
    }

    private static void interrupt() throws InterruptedException {
        Thread t = new Thread(() -> {
            int i = 0;
            try {
                while (!Thread.currentThread().isInterrupted()) {

                    System.out.println("tick " + i);
                    Thread.sleep(500);
                    System.out.println("tack " + i++);
                    if (i >= 10) {
                        break;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
//                   Thread.currentThread().interrupt();
//                   break;
//                   return;
            }
//               System.out.println("tack");

        });
//        t.setDaemon(true);
        t.start();
//        Thread.sleep(3000);
        t.join();
        System.out.println("Main off");
//        t.interrupt();
//        t.stop();
//        t.suspend();
//        t.resume();
    }

    private static void callableExample() throws InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(4000);
                return "Hello from callable!";
            }
        });
        new Thread(futureTask).start();

        try {
            System.out.println(futureTask.get(2, TimeUnit.SECONDS));
        } catch (ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("After");
    }

    private static void threadsStart() throws InterruptedException {
        System.out.println("Hello from main!!! Thread name is : " + Thread.currentThread().getName());

        Thread t1 = new MyThread("MyThread");
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous #1!!! Thread name is : " + Thread.currentThread().getName());
            }
        });
        Thread t4 = new Thread(() -> System.out.println("Hello from anonymous #2!!! Thread name is : " + Thread.currentThread().getName()));
        //t1.run();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        Thread.sleep(2000);

//        t2.start();
    }

    static class MyThread extends Thread {

        public MyThread() {
        }

        public MyThread( String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Hello from MyThread!!! Thread name is : " + Thread.currentThread().getName());
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello from MyRunnable!!! Thread name is : " + Thread.currentThread().getName());
        }
    }
}
