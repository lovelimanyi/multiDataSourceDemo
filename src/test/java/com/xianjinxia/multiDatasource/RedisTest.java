package com.xianjinxia.multiDatasource;

import com.alibaba.fastjson.JSONObject;
import com.xianjinxia.multiDatasource.redis.RedisService;
import com.xianjinxia.multiDatasource.utils.JedisDataClient;
import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    private static Logger logger = Logger.getLogger(RedisTest.class);
    @Autowired
    RedisService redisService;

    @Test
    public void contextLoads() {

    }


    @Test
    public void test1() throws Exception {
        System.out.println("11111");
        String redisKey = "cuishou";
        Integer length = JedisDataClient.llen(redisKey);
        JedisDataClient.rpush(redisKey, JSONObject.toJSONString("aaaaa"));
        JedisDataClient.rpush(redisKey, JSONObject.toJSONString("bbbbbb"));
        JedisDataClient.expire(redisKey, 20);


        String str = JedisDataClient.lpop("cuishou");


        System.out.println("222222");
    }

    @Test
    public void test2() {

        try {
            redisService.testRedis();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test33() {
        try {
            List<String> overdueValueList = JedisDataClient.getAllValuesByPattern("OVERDUE_" + "*");
            if (CollectionUtils.isNotEmpty(overdueValueList)) {
                logger.info("处理逾期数据");
//                dataForOverdue(overdueValueList);//处理逾期
            }

        } catch (Exception e) {
            logger.error("getRedisValue-exception", e);
            return;
        }
    }

    //单实例
    @Test
    public void test44() {
        JedisShardInfo shardInfo = new JedisShardInfo("redis://localhost:6379/7");//这里是连接的本地地址和端口
        shardInfo.setPassword("123456");//这里是密码
        Jedis jedis = new Jedis(shardInfo);
        jedis.connect();
//        Jedis jedis = new Jedis("127.0.0.1",6379,123456);
//        Jedis jedis = new Jedis();
        jedis.set("name","imooc");
        String name = jedis.get("name");
        System.out.println(name);
        jedis.close();
    }

    //单实例方法二
    //jedis.auth();
    @Test
    public void test1111(){
        Jedis jedis = new Jedis("127.0.0.1", 6379, 300000);
        jedis.auth("123456");
        jedis.set("name222","imooc222");
        String name = jedis.get("name222");
        System.out.println(name);
        jedis.close();
    }

    //连接池
    @Test
    public void test55() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(30);//设置最大连接数
        config.setMaxIdle(10);//设置最大空闲连接数
        JedisPool jedisPool = new JedisPool(config,"",6379);

        Jedis jedis = null;
        try{
            jedis = jedisPool.getResource();
            jedis.auth("123456");//授权密码
            jedis.set("name","张三");
            String name = jedis.get("name");
            System.out.println(name);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(jedis != null){
                jedis.close();
            }
            if(jedisPool != null){
                jedisPool.close();
            }
        }
    }

}
