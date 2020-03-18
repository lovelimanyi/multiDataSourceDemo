package com.xianjinxia.multiDatasource.test202003.redis;

import redis.clients.jedis.Jedis;

public class RedisStringJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
//        Jedis jedis = new Jedis("localhost");
        Jedis jedis = new Jedis("111.229.32.185");
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.set("runoobkey", "www.runoob.com");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: " + jedis.get("runoobkey"));
    }
}
