package org.example;

import java.io.PrintWriter;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello world! We're in main2 thread");

        MyRunnable2 r = new MyRunnable2();
        Thread t = new Thread(r);
        t.start();

        PrintWriter p = new PrintWriter(System.out);
        for(int i=0; i<10; i++){
            p.println("Main Thread-2");
            p.flush(); //If nothing is getting printed to the screen,
            // it's possible that the output is being buffered and not
            // immediately flushed to the console. You can try manually
            // flushing the output by calling the flush() method on the PrintWriter object after writing to it.
        }
    }
}