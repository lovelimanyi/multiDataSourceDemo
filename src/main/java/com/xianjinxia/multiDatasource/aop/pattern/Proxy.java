package com.xianjinxia.multiDatasource.aop.pattern;

import com.xianjinxia.multiDatasource.aop.aop_1.domain.Product;

public class Proxy implements Subject{

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }
    @Override
    public void request() {
        System.out.println("before");
        try{
            realSubject.request();
        }catch (Exception e){
            System.out.println("ex:"+ e.getMessage());
        }finally {
            System.out.println("after");
        }
    }

    @Override
    public void hello() {
        realSubject.hello();
    }
}
