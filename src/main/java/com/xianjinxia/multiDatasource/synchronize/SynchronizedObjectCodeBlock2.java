package com.xianjinxia.multiDatasource.synchronize;


public class SynchronizedObjectCodeBlock2 implements Runnable {
    static SynchronizedObjectCodeBlock2 instance = new SynchronizedObjectCodeBlock2();
    Object lock1 = new Object();
    Object lock2 = new Object();


    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println("我是Lock1。我叫：" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "Lock1运行结束。");
        }

        synchronized (lock2) {
            System.out.println("我是Lock2。我叫：" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "Lock2运行结束。");
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();

        while(t1.isAlive() || t2.isAlive()){

        }
        System.out.println("finished");

    }

}
