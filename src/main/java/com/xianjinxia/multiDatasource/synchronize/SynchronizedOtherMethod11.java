package com.xianjinxia.multiDatasource.synchronize;

public class SynchronizedOtherMethod11 {
    public synchronized void method1(){
        System.out.println("我是method1");
        method2();
    }

    private synchronized void method2() {
        System.out.println("我是method2");
    }

    public static void main(String[] args) {
        SynchronizedOtherMethod11 s = new SynchronizedOtherMethod11();
        s.method1();
    }
}
