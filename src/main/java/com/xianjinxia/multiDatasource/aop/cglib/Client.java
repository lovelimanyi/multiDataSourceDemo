package com.xianjinxia.multiDatasource.aop.cglib;

import com.xianjinxia.multiDatasource.aop.pattern.RealSubject;
import com.xianjinxia.multiDatasource.aop.pattern.Subject;
import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new DemoMethodInterceptor());
        Subject subject = (Subject) enhancer.create();
        subject.hello();
    }
}
