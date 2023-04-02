package org.example;

public class Main5 {
    public static void main(String[] args) throws InterruptedException{
        MyRunnable5 r = new MyRunnable5();
        Thread t = new Thread(r);
        t.start();
        t.join();

        for(int i=0; i<10; i++){
            System.out.println("Main Thread - 5");
        }
    }
}
