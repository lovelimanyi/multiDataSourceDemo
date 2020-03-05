package com.xianjinxia.multiDatasource.test202003.static_constructFunction;

public class A {
    static {
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }
}
