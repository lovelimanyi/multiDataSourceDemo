package com.xianjinxia.multiDatasource;

import com.xianjinxia.multiDatasource.aop.service.ProductService;
import com.xianjinxia.multiDatasource.aop.service.sub.SubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopTest {
    @Autowired
    ProductService productService;

    @Autowired
    SubService subService;
    @Test
    public void contextLoads() {

    }

    @Test
    public void test1(){
        System.out.println("###begin test###");
        productService.findById(1L);
        productService.findByTwoArgs(1L,"hello");
        productService.getName();
        subService.demo();

        System.out.println("测试结束，，，，，，，");
    }

}
