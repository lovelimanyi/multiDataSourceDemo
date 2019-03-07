package com.xianjinxia.multiDatasource.lmy.controller;

import com.xianjinxia.multiDatasource.lmy.dao.Table1Mapper;
import com.xianjinxia.multiDatasource.lmy.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping("lmyTest/")
@Controller
public class Test001 {
    @Autowired
    Table1Mapper table1Mapper;

    @RequestMapping("test1")
    public void test1(){
        System.out.println("111111");
        List<Map<String,Object>> list = table1Mapper.selectAll();
        System.out.println("222222");
    }

    @RequestMapping("test2")
    public void test2(){
        System.out.println("111111");
        Integer id = 2;
        Student list = table1Mapper.selectAllStudentById(id);
        System.out.println("222222");
    }

}
