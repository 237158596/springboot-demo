package com.example.demo.testActions;

import com.example.demo.config.thread.ThreadPoolConfig;
import com.example.demo.utils.RedisTemplateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * Created  at 2017/8/31.
 */
@Configuration
public class CommonConfig {

    @Autowired
    private RedisTemplateUtil redisTemplateUtil;

    @Autowired
    private ThreadPoolConfig threadPoolConfig;





}
