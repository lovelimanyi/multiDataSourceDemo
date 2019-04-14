package com.xianjinxia.multiDatasource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IsNumberTest {
    @Test
    public void contextLoads() {

    }

    @Test
    public void test3(){

        System.out.println("111111");

        String str = "545455";
        String str2 = "5645645sdfdsf";
        boolean re = isNumber(str);
        boolean re2 = isNumber(str2);

        System.out.println("222222");

    }


    public static boolean isNumber(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }

}
