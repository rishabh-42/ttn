package Multithreading;

public class Eleven {

    int count;
    synchronized public void incrementCount() {
        synchronized (this) {
            count++;
        }
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
        Thread thread = new Thread(new Runnable() {
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
        thread.start();
        thread2.start();
        System.out.println(eleven.count);
    }
}


