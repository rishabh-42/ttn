package Multithreading.One;

public class ImplementsRunnable implements  Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++) System.out.println(i);
    }

    public static void main(String[] args) {

        ImplementsRunnable implementsRunnable = new ImplementsRunnable();
        Thread t1 = new Thread(implementsRunnable);
        t1.start();
    }
}
