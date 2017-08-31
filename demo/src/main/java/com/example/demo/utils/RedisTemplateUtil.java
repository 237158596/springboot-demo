package com.example.demo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created  at 2017/8/29.
 */
@Component("redisUtil")
public class RedisTemplateUtil {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private  RedisTemplate<String, String> redisTemplate;



    public RedisTemplateUtil() {
    }


    public boolean setValue(String k, String v, long time) {
        String key = k;
        try {
            ValueOperations<String, String> valueOps = redisTemplate.opsForValue();
            valueOps.set(key, v);
            if (time > 0) redisTemplate.expire(key, time, TimeUnit.SECONDS);
            return true;
        } catch (Throwable t) {
            logger.error("缓存[" + key + "]失败, value[" + v + "]", t);
        }
        return false;
    }

    public String getValue(String k) {
        try {

            ValueOperations<String, String> valueOps = redisTemplate.opsForValue();
            return valueOps.get(k);
        } catch (Throwable t) {
            logger.error("获取缓存失败key[" +  k + ", Codeor[" + t + "]");
        }
        return null;
    }

    public  double decr(String key, double by){
        return redisTemplate.opsForValue().increment(key, -by);
    }


    public  long  incr(String key, long by){
        return redisTemplate.opsForValue().increment(key, by);
    }


}
