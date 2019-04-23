package com.xianjinxia.multiDatasource.synchronize;

public class SynchronizedSupperClass12 {
    public synchronized void doSomething(){
        System.out.println("我是父类方法");
    }
}

class TestClass extends SynchronizedSupperClass12{
    public synchronized void doSomething(){
        System.out.println("我是子类方法");
        super.doSomething();
    }

    public static void main(String[] args) {
        TestClass s = new TestClass();
        s.doSomething();
    }
}