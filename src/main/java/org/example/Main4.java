package org.example;

public class Main4 {
    public static void main(String[] args){
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r); //we target the run method of r

        t.start();

        for(int i=0; i<10; i++){
            System.out.println("Main Thread - 4");
        }
    }
}
