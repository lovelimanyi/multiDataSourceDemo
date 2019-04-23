package com.xianjinxia.multiDatasource.synchronize;


public class SynchronizedObjectCodeBlock2_1 implements Runnable {
    static SynchronizedObjectCodeBlock2_1 instance = new SynchronizedObjectCodeBlock2_1();


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
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();

        while(t1.isAlive() || t2.isAlive()){

        }
        System.out.println("finished");

    }

}
