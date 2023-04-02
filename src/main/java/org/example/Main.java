package org.example;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! We're in main thread");

        MyThread t1 = new MyThread();
        t1.start();

        PrintWriter p = new PrintWriter(System.out); //Note : this is much slower compared to System.out.println
        for(int i=0; i<10; i++){
            p.println("Main Thread");
            p.flush(); //If nothing is getting printed to the screen,
            // it's possible that the output is being buffered and not
            // immediately flushed to the console. You can try manually
            // flushing the output by calling the flush() method on the PrintWriter object after writing to it.
        }
    }
}