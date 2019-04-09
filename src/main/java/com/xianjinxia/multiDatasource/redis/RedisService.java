package com.xianjinxia.multiDatasource.redis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xianjinxia.multiDatasource.utils.JedisDataClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedisService {


    public void testRedis()  throws Exception {

        Student stu1 = new Student();
        stu1.setAge(1);
        stu1.setName("李满意");
        stu1.setHobby("唱歌");

        Student stu222 = new Student();
        stu222.setName("赵培");
        stu222.setAge(2);
        stu222.setHobby("跳舞");

        List<Student> studentList = new ArrayList<>();
        studentList.add(stu1);
        studentList.add(stu222);

        for(Student stu :studentList){
            try {
                JedisDataClient.rpush("student" , JSONObject.toJSONString(stu));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String student = JedisDataClient.lpop("student");
        JedisDataClient.rpush("student",student);//放到队尾
        JSONObject stu = JSON.parseObject(student);
        String name = stu.getString("name").toString();
        Integer age = stu.getInteger("age");
        String hobby = stu.getString("hobby").toString();


        String student2 = JedisDataClient.lpop("student");
        JedisDataClient.rpush("student",student2);//放到队尾
        JSONObject stu2 = JSON.parseObject(student);
        String name2 = stu.getString("name").toString();
        Integer age2 = stu.getInteger("age");
        String hobby2 = stu.getString("hobby").toString();



        String student3 = JedisDataClient.lpop("student");
        JedisDataClient.rpush("student",student3);//放到队尾
        JSONObject stu3 = JSON.parseObject(student);
        String name3 = stu.getString("name").toString();
        Integer age3 = stu.getInteger("age");
        String hobby3 = stu.getString("hobby").toString();


        JedisDataClient.del("student");//删除

        System.out.println("结束，，，，，，，，，，");

    }
}
