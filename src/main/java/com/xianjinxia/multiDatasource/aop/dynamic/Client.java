package com.xianjinxia.multiDatasource.aop.dynamic;

import com.xianjinxia.multiDatasource.aop.pattern.Proxy;
import com.xianjinxia.multiDatasource.aop.pattern.RealSubject;
import com.xianjinxia.multiDatasource.aop.pattern.Subject;

public class Client {
    public static void main(String[] args) {
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Subject subject = (Subject) java.lang.reflect.Proxy.newProxyInstance(Client.class.getClassLoader(),new Class[]{Subject.class},new JdkProxySubject(new RealSubject()));
        subject.hello();
    }

//    public static void main(String[] args){
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//        Subject subject = (Subject) java.lang.reflect.Proxy.newProxyInstance(Client.class.getClassLoader(),new Class[]{Subject.class},new JdkProxySubject(new RealSubject()));
//        subject.hello();
//    }

}
