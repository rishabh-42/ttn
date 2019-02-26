package Multithreading;

public class Two implements Runnable {


    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Name is : " + Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Two t1 = new Two();
        Two t2 = new Two();

        Thread first = new Thread(t1);
        Thread second = new Thread(t2);


        first.start();
        try {
            first.join(1500);
        }
        catch (Exception e){


        }
        second.start();
    }
}
