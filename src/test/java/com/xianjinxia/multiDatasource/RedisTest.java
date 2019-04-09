package com.xianjinxia.multiDatasource;

import com.alibaba.fastjson.JSONObject;
import com.xianjinxia.multiDatasource.redis.RedisService;
import com.xianjinxia.multiDatasource.utils.JedisDataClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    RedisService redisService;

    @Test
    public void contextLoads() {

    }


    @Test
    public void test1() throws Exception{
        System.out.println("11111");
        String redisKey = "cuishou";
        Integer length = JedisDataClient.llen(redisKey);
        JedisDataClient.rpush(redisKey , JSONObject.toJSONString("aaaaa"));
        JedisDataClient.rpush(redisKey , JSONObject.toJSONString("bbbbbb"));
        JedisDataClient.expire(redisKey,20);


        String str = JedisDataClient.lpop("cuishou");



        System.out.println("222222");
    }

    @Test
    public void test2(){

        try {
            redisService.testRedis();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
