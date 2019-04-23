package com.xianjinxia.multiDatasource.synchronize;


public class SynchronizedObjectCodeBlock2_2 implements Runnable {
    static SynchronizedObjectCodeBlock2_2 instance1 = new SynchronizedObjectCodeBlock2_2();
    static SynchronizedObjectCodeBlock2_2 instance2 = new SynchronizedObjectCodeBlock2_2();


    @Override
    public void run() {
        synchronized (this) {
            System.out.println("我是对象锁的代码块形式。我叫：" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行结束。");
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();

        while(t1.isAlive() || t2.isAlive()){

        }
        System.out.println("finished");

    }

}
