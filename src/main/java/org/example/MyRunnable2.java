package org.example;

import java.io.PrintWriter;

public class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        PrintWriter p = new PrintWriter(System.out);
        for(int i=0; i<10; i++){
            p.println("Child Thread-2");
            p.flush();
        }
    }
}
