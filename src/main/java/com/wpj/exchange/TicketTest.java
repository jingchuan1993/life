package com.wpj.exchange;

import jdk.nashorn.internal.ir.CallNode;

import java.util.concurrent.locks.ReentrantLock;

public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket , "窗口一");
        Thread t2 = new Thread(ticket , "窗口二");

        t1.start();
        t2.start();

    }
}

class Ticket implements Runnable {
    private   int ticket = 100;


    @Override
    public void run() {


            while (ticket > 0) {
                synchronized (this) {
                    notify();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket--;
                System.out.println(Thread.currentThread().getName() + "取票一张" + "剩余 " + ticket + "张");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

        }







        }


    }

class Dog{}

