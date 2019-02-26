package Multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Eight {


    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService
                .schedule(new Runnable() {
                              @Override
                              public void run() {
                                  System.out.println("Task executed after 1 second using Schedule");
                              }
                          },
                        1,
                        TimeUnit.SECONDS);

        executorService
                .scheduleWithFixedDelay(new Runnable() {
                                            @Override
                                            public void run() {
                                                try {
                                                    Thread.sleep(2000L);
                                                    System.out.println("ScheduleWithFixedDelay " +
                                                            "Scheduled Task to executed after fixed interval");
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                            }
                                        }
                        ,
                        0,
                        5,
                        TimeUnit.SECONDS);

        executorService
                .scheduleAtFixedRate(new Runnable() {
                                         @Override
                                         public void run() {
                                             try {
                                                 Thread.sleep(2000L);
                                                 System.out.println("ScheduleAtFixedRate Scheduled " +
                                                         "Task to executed after fixed interval");
                                             } catch (InterruptedException e) {
                                                 e.printStackTrace();
                                             }
                                         }
                                     }
                        ,
                        0,
                        1,
                        TimeUnit.SECONDS);


    }
}


