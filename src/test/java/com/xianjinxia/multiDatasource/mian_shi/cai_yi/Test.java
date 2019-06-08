package com.xianjinxia.multiDatasource.mian_shi.cai_yi;

public class Test {
    public static void replace(String text) {
        text.replace('j', 'i');
    }

    public static void main(String[] args) {
        String text = new String("java");
        replace(text);
        System.out.println(text);
    }

//    运行结果：
//    java
}
