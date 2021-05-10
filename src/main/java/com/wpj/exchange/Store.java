package com.wpj.exchange;


public class Store {


    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        new Thread(new Producer(clerk), "生产者").start();
        new Thread(new Consumer(clerk),"消费者").start();


    }
}

class Clerk {
  private  int goods = 0;

    public synchronized void addGoods() {
        if (goods < 20) {
            goods++;
            System.out.println(Thread.currentThread().getName()+ "生产了" + goods + "个商品");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void minusGoods() {
        if (goods > 0) {

            System.out.println(Thread.currentThread().getName()+ "消费了" + goods + "个商品");
            goods--;
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable {
    Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产产品");
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addGoods();
        }
    }
}
class Consumer implements Runnable {
    Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费产品");
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusGoods();
        }
    }
}




