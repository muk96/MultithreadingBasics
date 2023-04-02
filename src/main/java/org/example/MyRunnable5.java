package org.example;

public class MyRunnable5 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Child Thread-5");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println("Interrupted Exception in Thread.sleep()");
            }
        }
    }
}
