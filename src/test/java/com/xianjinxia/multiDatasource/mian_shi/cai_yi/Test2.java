package com.xianjinxia.multiDatasource.mian_shi.cai_yi;

public class Test2 {
    public static void main(String[] args) {
        String foo = "blue";
        String bar = foo;
        foo = "green";
        System.out.println(bar);
    }
//    输出结果：
//    blue
}
