package com.xianjinxia.multiDatasource.aop.service.sub;


import com.xianjinxia.multiDatasource.aop.service.ProductService;
import org.springframework.stereotype.Component;

/**
 * Created by cat on 2017-02-19.
 */
@Component
public class SubService extends ProductService {

    public void demo(){
        System.out.println("execute sub service method");
    }
}
