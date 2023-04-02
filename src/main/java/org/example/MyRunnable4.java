package org.example;

public class MyRunnable4 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Child Thread-4");
            if (i == 2) {
                Thread.yield(); //Pauses the current thread - i.e. the current thread goes to ready/runnable state from running state
            }
        }
    }
}
