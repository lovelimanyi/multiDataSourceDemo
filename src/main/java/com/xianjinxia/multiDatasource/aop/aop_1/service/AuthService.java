package com.xianjinxia.multiDatasource.aop.aop_1.service;

import com.xianjinxia.multiDatasource.aop.aop_1.security.CurrentUserHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public void checkAccess(){
        String user = CurrentUserHolder.get();
        if (!"admin".equals(user)){
            throw new RuntimeException("operation not allow");
        }
    }
}
