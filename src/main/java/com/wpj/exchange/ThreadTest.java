package com.wpj.exchange;

public class ThreadTest {


    public static void main(String[] args) {

        MyThread myThread = new MyThread("o");
        myThread.start();
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + i);
            }
            if (i == 20) {
                try {
                    myThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(myThread.isAlive());


    }

}

class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + i);
            }

        }
    }
}

class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}

