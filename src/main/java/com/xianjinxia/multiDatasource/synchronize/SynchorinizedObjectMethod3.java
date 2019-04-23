package com.xianjinxia.multiDatasource.synchronize;

public class SynchorinizedObjectMethod3 implements Runnable{
    static SynchorinizedObjectMethod3 instance = new SynchorinizedObjectMethod3();

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();

        while(t1.isAlive() || t2.isAlive()){

        }
        System.out.println("finished");
    }

    @Override
    public void run() {
        method();
    }

    public synchronized void method(){
        System.out.println("我的对象锁的方法修饰符形式，我叫"+Thread.currentThread().getName());
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"运行结束");
    }
}
