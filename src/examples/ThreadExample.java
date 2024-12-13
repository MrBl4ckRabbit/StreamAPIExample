package examples;

import java.util.concurrent.Semaphore;


public class ThreadExample {
    public static final Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting for the semaphore...");
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " has acquired the semaphore.");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " is releasing the semaphore.");
                semaphore.release();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        
    }
}

