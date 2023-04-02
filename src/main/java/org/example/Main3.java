package org.example;

import java.io.PrintWriter;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Hello world! We're in main3 thread");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(10);

        MyRunnable3 r = new MyRunnable3();
        Thread t = new Thread(r);
        t.setPriority(1);
        t.start();


        for(int i=0; i<10; i++){
            System.out.println("Main Thread-3");
        }
    }
}