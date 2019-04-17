package com.xianjinxia.multiDatasource.aopTest;

import com.xianjinxia.multiDatasource.aop.aop_1.security.CurrentUserHolder;

import com.xianjinxia.multiDatasource.aop.aop_1.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Aop_1_Test {
    @Autowired
    ProductService productService;

    @Test(expected = Exception.class)
    public void annoInsertTest(){
        CurrentUserHolder.set("tom");
        productService.delete(1L);
    }

    @Test
    public void adminInsertTest(){
        CurrentUserHolder.set("admin22");
        productService.delete(1L);
    }

}
