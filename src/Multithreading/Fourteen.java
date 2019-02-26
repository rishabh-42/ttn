package Multithreading;



    public class Fourteen {
        public void worker1(){
            synchronized (this) {
                System.out.println("Worker1 Started");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Worker1 Done working");
            }
        }
        public void worker2(){
            synchronized (this) {
                System.out.println("Worker 2 Started");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Worker 2 Done");
            }
        }
        public void worker3(){
            synchronized (this) {
                System.out.println("Worker 3 Started");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Worker 3 Done");
            }
        }
        public void worker4(){
            synchronized (this) {
                System.out.println("Worker 4 Started");
                System.out.println("Worker 4 Done");
                System.out.println("Notifying all threads now");
                notifyAll();
            }
        }

        public static void main(String[] args) {
            Fourteen fourteen = new Fourteen();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    fourteen.worker1();
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    fourteen.worker2();
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    fourteen.worker3();
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    fourteen.worker4();
                }
            }).start();
        }
    }

