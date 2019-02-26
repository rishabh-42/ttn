package Multithreading;


public class Thirteen {
    public void worker1() {
        synchronized (this) {
            System.out.println("Worker1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker1 Done");
        }
    }
    public void worker4() {
        synchronized (this) {
            System.out.println("Worker 4 Started");
            System.out.println("Worker 4 Done");
            notify();
        }
    }
    public static void main(String[] args) {
        Thirteen thirteen = new Thirteen();
        new Thread(new Runnable() {
            @Override
            public void run() {
                thirteen.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                thirteen.worker4();
            }
        }).start();
    }
}


