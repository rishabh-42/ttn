package Multithreading.One;

public class ThreadClass extends Thread {

    public void run(){

        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadClass t = new ThreadClass();
        t.start();
    }


}
