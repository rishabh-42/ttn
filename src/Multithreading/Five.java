package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Five {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("First tast !!");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {

                    System.out.println("Second tast !!");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Third tast !!");
                }
            });

        } finally {

            executorService.shutdown();
            System.out.println("Calling isShutdown : " + executorService.isShutdown());
            System.out.println("Calling isTerminate : " + executorService.isTerminated());
        }

    }
}
