package com.xianjinxia.multiDatasource.aop.aop_2.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PkgTypeAspectConfig {

    //拦截within某个包下
//    @Pointcut("within(com.xianjinxia.multiDatasource.aop.aop_2.service.*)")
//    public void matchType(){}
//
//    @Before("matchType()")
//    public void before(){
//        System.out.println("");
//        System.out.println("###before");
//    }

}
