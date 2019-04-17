package com.xianjinxia.multiDatasource.aopTest;


import com.xianjinxia.multiDatasource.aop.aop_2.service.Product2Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Aop_2_Test {
    @Autowired
    Product2Service product2Service;

    @Test
    public void test(){
        System.out.println("###begin test###");
        product2Service.findById(1L);
        product2Service.findByTwoArgs(1L,"hello");
        product2Service.getName();
    }



}
