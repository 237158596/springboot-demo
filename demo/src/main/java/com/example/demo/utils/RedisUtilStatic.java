package com.example.demo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * Created  at 2017/8/31.
 */
public class RedisUtilStatic {

    private static Logger logger = LoggerFactory.getLogger(RedisUtilStatic.class);


    private static RedisTemplate  redisTemplate = (RedisTemplate)SpringContextUtil.getBean("redisTemplate");

    private static StringRedisTemplate stringRedisTemplate=(StringRedisTemplate)SpringContextUtil.getBean("stringRedisTemplate");
    public RedisUtilStatic(){

    }

//    public static boolean setValue(String k, String v, long time) {
//        String key = k;
//        try {
//            ValueOperations<String,String> valueOps = redisTemplate.opsForValue();
//            valueOps.set(key, v);
//            if (time > 0) redisTemplate.expire(key, time, TimeUnit.SECONDS);
//            return true;
//        } catch (Throwable t) {
//            logger.error("缓存[" + key + "]失败, value[" + v + "]", t);
//        }
//        return false;
//    }

    public static String getValue(String k) {
        try {

            ValueOperations<String,String> valueOps = stringRedisTemplate.opsForValue();
            return valueOps.get(k);
        } catch (Throwable t) {
            logger.error("获取缓存失败key[" +  k + ", Codeor[" + t + "]");
        }
        return null;
    }

    public  static double decr(String key, double by){
        return stringRedisTemplate.opsForValue().increment(key, -by);
    }


    public  static long  incr(String key, long by){
        return stringRedisTemplate.opsForValue().increment(key, by);
    }



}
