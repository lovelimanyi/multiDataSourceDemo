package com.xianjinxia.multiDatasource.aop.aop_1.service;

import com.xianjinxia.multiDatasource.aop.aop_1.domain.Product;
import com.xianjinxia.multiDatasource.aop.aop_1.security.AdminOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    AuthService authService;


    @AdminOnly
    public void insert(Product product) {
//        authService.checkAccess();
        System.out.println("insert product");
    }

    @AdminOnly
    public void delete(long id) {
//        authService.checkAccess();
        System.out.println("delete product");
    }

}
