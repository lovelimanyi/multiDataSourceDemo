package com.xianjinxia.multiDatasource.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PkgTypeAspectConfig {
    @Pointcut("within(com.xianjinxia.multiDatasource.aop.service.sub.*)")
    public void matchType(){}
    @Before("matchType()")
    public void before(){
        System.out.println("");
        System.out.println("###before");
    }

}
