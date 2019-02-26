package Multithreading;
import java.util.concurrent.atomic.AtomicInteger;


public class Twelve {
        AtomicInteger count= new AtomicInteger();
        public void incrementCount() {
            synchronized (this) {
                count.incrementAndGet();
            }
        }
        public void worker1() {
            for (int i = 1; i <= 1000; i++) {
                count.incrementAndGet();
            }
        }
        public void worker2() {
            for (int i = 1; i <= 1000; i++) {
                count.incrementAndGet();
            }
        }
        public static void main(String[] args) throws InterruptedException {

            Twelve twelve = new Twelve();
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    twelve.worker1();
                }
            });
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    twelve.worker2();
                }
            });
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            System.out.println(twelve.count);
        }

    }


