package com.xianjinxia.multiDatasource;
/*
说明：
1、未使用sleep，输出
ping
pong
2、使用sleep，输出：
pong
ping

*/

public class Test002 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println("pong");
            }
        };
        t.start();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ping");
    }
}
