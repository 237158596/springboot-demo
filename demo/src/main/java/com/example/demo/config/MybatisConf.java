package com.example.demo.config;

import com.example.demo.interceptor.MyBatisInterceptor;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created  at 2017/8/28.
 */
@Configuration
public class MybatisConf{
    private static final Logger logger = LoggerFactory.getLogger(MybatisConf.class);


    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }

    @Bean
    public Interceptor getInterceptor(){
        logger.info("init mybatis Interceptor .......");
        return  new MyBatisInterceptor();
    }
}
