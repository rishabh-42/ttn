package Multithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Nine implements Runnable {
    int id;
    public Nine(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread name::" + Thread.currentThread().getName() + " Start :" + id);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name::" + Thread.currentThread().getName() + " End :" + id);
    }
}
class ExecuterServiceDemo {
    public static void main(String[] args) {

//        ExecutorService executorService= Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newCachedThreadPool();

        System.out.println("Cached Thread Pool");
        for (int i = 0; i <= 30; i++) {
            executorService.submit(new Nine(i));
        }
        executorService.shutdown();
        ExecutorService fixedExecutor = Executors.newFixedThreadPool(20);
        System.out.println("Fixed Thread Pool");
        for (int i = 0; i <= 30; i++) {

            fixedExecutor.submit(new Nine(i));
        }
        fixedExecutor.shutdown();
    }
}


