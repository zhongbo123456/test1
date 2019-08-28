package com.example.demo.test;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class RedisTest {
    public static void main(String[] args) {
        String key="takeout:notice:temp:1051";
        Jedis jedis=new Jedis("redis01-dev.ibaimi.net",6379);
        jedis.auth("redis@123456");
        //jedis.hset(key,"11","kk");
        Set<String> hkeys = jedis.hkeys(key);
        System.out.println(hkeys.stream().findFirst());
        //hkeys.stream().findFirst().ifPresent(s -> jedis.hdel(key, s));
        System.out.println(hkeys);
        //[77, 99, 55, 44, 88, 66, 00, aa, 333, 10]
        //[99, 55, 44, 88, 66, 00, aa, 333, 10]
        //[44, 88, 66, 00, aa, 333, 10]


    }
}
