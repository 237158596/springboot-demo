package com.example.demo.config.thread;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created  at 2017/8/31.
 */
@Configuration
public class ThreadPoolConfig {


    @Bean
    public ExecutorService jobExecutor() {
        return new ThreadPoolExecutor(8, 16, 1, TimeUnit.MINUTES,
                new LinkedBlockingQueue<Runnable>());
    }

    @Bean
    public ExecutorService singleJobExecutor() {
        return new ThreadPoolExecutor(1, 1, 1, TimeUnit.MINUTES,
                new LinkedBlockingQueue<Runnable>());
    }

}
