package com.xianjinxia.multiDatasource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArrayList_Remove_Test {


    @Test
    public void arrayListTest(){
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王二");
        list.add("李四");
        list.add("麻子");

        list.remove("李四");

        System.out.println("");
    }



    @Test
    public void contextLoads() {

    }

}
