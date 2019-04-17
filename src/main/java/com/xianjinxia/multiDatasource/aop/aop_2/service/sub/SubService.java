package com.xianjinxia.multiDatasource.aop.aop_2.service.sub;

import com.xianjinxia.multiDatasource.aop.aop_2.service.Product2Service;
import org.springframework.stereotype.Component;

@Component
public class SubService extends Product2Service {
    public void demo(){
        System.out.println("execute sub service method");
    }
}
