package com.example.demo.config;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created  at 2017/9/20.
 * redis 缓存的时间控制
 */
@Configuration
public class CacheConfig {

    @Bean
    public CacheManager cacheManager(RedisTemplate redisTemplate) {
        RedisCacheManager cacheManager= new RedisCacheManager(redisTemplate);
        cacheManager.setDefaultExpiration(60);
        Map<String,Long> expiresMap=new HashMap<>();
        expiresMap.put("CxsCustomerEmp",5L);
        cacheManager.setExpires(expiresMap);
        return cacheManager;
    }


}
