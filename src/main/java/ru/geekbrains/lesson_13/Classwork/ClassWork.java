package ru.geekbrains.lesson_13.Classwork;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ClassWork {
    static int flag = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException, BrokenBarrierException {
//        executors();
//        simpleLock();
//        rrwl();
//        cdlSimple();
//        cslEx();
//        cyclicBarrierEx();
//        cyclicEX();
//        semaphore();

//        List
        List<String> l1 = new ArrayList<>();
        List<String> strings = new Vector<>();
        List<String> l2 = new CopyOnWriteArrayList<>();
        List<String> l3 = Collections.synchronizedList(l1);
//        Set
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new CopyOnWriteArraySet<>();
        Set<String> s3 = Collections.synchronizedSet(s1);
//        Map
        Map<String,String> m1 = new HashMap<>();
        Map<String,String> m2 = new Hashtable<>();
        Map<String,String> m3 = new ConcurrentHashMap<>();
    }

    private static void semaphore() {
        Semaphore semaphore = new Semaphore(3, true);
        for (int i = 0; i < 10; i++) {
            int j = i;
            new Thread(() -> {

                try {
                    System.out.println("Car #" + j + " before semaphore!");
                    semaphore.acquire();
                    System.out.println("Car #" + j + " riding!");
                    Thread.sleep((long) (200 + 500 * Math.random()));
                    System.out.println("Car #" + j + " finished semaphore!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }).start();
        }
    }

    private static void cyclicEX() throws InterruptedException, BrokenBarrierException {
        final int threadsCount = 20;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(threadsCount, () -> {
            if (flag == 0) {
                System.out.println("Race started!");
            } else System.out.println("Race finished!");
            flag++;
        });
        System.out.println("Starting");
        for (int i = 0; i < threadsCount; i++) {
            int j = i;
            new Thread(() -> {

                try {
                    System.out.println("Car #" + j + " preparing!");
                    Thread.sleep((long) (200 + 500 * Math.random()));
                    System.out.println("Car #" + j + " ready!");
                    cyclicBarrier.await();
                    System.out.println("Car #" + j + " Go!");
                    Thread.sleep((long) (200 + 500 * Math.random()));
                    System.out.println("Car #" + j + " finished!");
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        while (cyclicBarrier.getNumberWaiting() != 20) {
            Thread.sleep(50);
        }
//        System.out.println("Race start!");
        cyclicBarrier.await();
        cyclicBarrier.await();
//        System.out.println("Race finished!");
    }

    private static void cyclicBarrierEx() throws InterruptedException, BrokenBarrierException {
        final int threadsCount = 20;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(threadsCount + 1);
        System.out.println("Starting");
        for (int i = 0; i < threadsCount; i++) {
            int j = i;
            new Thread(() -> {

                try {
                    System.out.println("Car #" + j + " preparing!");
                    Thread.sleep((long) (200 + 500 * Math.random()));
                    System.out.println("Car #" + j + " ready!");
                    cyclicBarrier.await();
                    System.out.println("Car #" + j + " Go!");
                    Thread.sleep((long) (200 + 500 * Math.random()));
                    System.out.println("Car #" + j + " finished!");
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        while (cyclicBarrier.getNumberWaiting() != 20) {
            Thread.sleep(50);
        }
        System.out.println("Race start!");
        cyclicBarrier.await();
        cyclicBarrier.await();
        System.out.println("Race finished!");
    }

    private static void cslEx() throws InterruptedException {
        int threadsCount = 20;
        CountDownLatch cdl = new CountDownLatch(threadsCount + 1);
        System.out.println("Starting");
        for (int i = 0; i < threadsCount; i++) {
            int j = i;
            new Thread(() -> {

                try {
                    System.out.println("Car #" + j + " preparing!");
                    Thread.sleep((long) (200 + 500 * Math.random()));
                    System.out.println("Car #" + j + " ready!");
                    cdl.countDown();
                    cdl.await();
                    System.out.println("Car #" + j + " Go!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        while (cdl.getCount() > 1) {
            Thread.sleep(50);
        }
//        cdl.await();
        System.out.println("Race started!");
        Thread.sleep(5000);
        cdl.countDown();
    }

    private static void cdlSimple() throws InterruptedException {
        int threadsCount = 20;
        CountDownLatch cdl = new CountDownLatch(threadsCount);
        System.out.println("Starting");
        for (int i = 0; i < threadsCount; i++) {
            int j = i;
            new Thread(() -> {

                try {
                    System.out.println("Car #" + j + " preparing!");
                    Thread.sleep((long) (200 + 500 * Math.random()));
                    System.out.println("Car #" + j + " ready!");
                    cdl.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        cdl.await();
        System.out.println("Race started!");
    }

    private static void rrwl() {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        new Thread(() -> {
            try {
                lock.readLock().lock();
                System.out.println("Read start lock 1");
                Thread.sleep(3000);
                System.out.println("Read end lock 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.readLock().unlock();
            }
        }).start();
        new Thread(() -> {
            try {
                lock.readLock().lock();
                System.out.println("Read start lock 2");
                Thread.sleep(3000);
                System.out.println("Read end lock 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.readLock().unlock();
            }
        }).start();
        new Thread(() -> {
            try {
                lock.readLock().lock();
                System.out.println("Read start lock 3");
                Thread.sleep(3000);
                System.out.println("Read end lock 3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.readLock().unlock();
            }
        }).start();

        new Thread(() -> {
            try {
                lock.writeLock().lock();
                System.out.println("Write start lock 1");
                Thread.sleep(3000);
                System.out.println("Write end lock 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.writeLock().unlock();
            }
        }).start();

        new Thread(() -> {
            try {
                lock.writeLock().lock();
                System.out.println("Write start lock 2");
                Thread.sleep(3000);
                System.out.println("Write end lock 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.writeLock().unlock();
            }
        }).start();
    }

    private static void simpleLock() {
        Lock lock = new ReentrantLock();

        new Thread(() -> {
            System.out.println("Before lock 1");
            try {
                lock.lock();
                System.out.println("Got lock 1");
                Thread.sleep(3000);
                System.out.println("End lock 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            System.out.println("Before lock 2");
            try {
                lock.lock();
                System.out.println("Got lock 2");
                Thread.sleep(3000);
                System.out.println("End lock 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            System.out.println("Before lock 3");
            try {
                if (lock.tryLock(5, TimeUnit.SECONDS)) {
                    try {
                        System.out.println("Got lock 3");
                        Thread.sleep(3000);
                        System.out.println("End lock 3");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                } else System.out.println("Ok...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    private static void executors() throws InterruptedException, ExecutionException {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newFixedThreadPool(4, new ThreadFactory() {
//            @Override
//            public Thread newThread(@NotNull Runnable r) {
//                Thread t = new Thread(r);
//                t.setName("Executor task");
//                return t;
//            }
//        });
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int j = i;
            executorService.execute(() -> {
                try {
                    System.out.println("Start task # " + j);
                    Thread.sleep((long) (200 + 500 * Math.random()));
                    System.out.println("Finish task # " + j + " " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        Future<String> future = executorService.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "Hello";
            }
        });
        System.out.println(future.get());
        executorService.shutdown();
//        executorService.shutdownNow();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Main thread finish!");
    }
}