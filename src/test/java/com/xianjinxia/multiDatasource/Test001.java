package com.xianjinxia.multiDatasource;

public class Test001 {

    public static void main(String[] args) {
        int i=0;
        while (i++<5){
            System.out.println("while内部：" + i);
//            i+=i;
        }
        System.out.println("while外部：" + i);
    }


//    说明：
//    while内部：1
//    while内部：2
//    while内部：3
//    while内部：4
//    while内部：5
//    while外部：6
//
//    1、第一个输出是  1
//    2、最后一个输出是  while外部：6
}
