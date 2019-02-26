package Multithreading;

public class Tenth {

    int count;
    synchronized public void incrementCount() {
        count++;
    }

    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }
    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Eleven eleven = new Eleven();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                eleven.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                eleven.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(eleven.count);
    }
}


