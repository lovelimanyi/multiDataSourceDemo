package com.xianjinxia.multiDatasource.test202003.static_constructFunction;

public class B extends A {
    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}
