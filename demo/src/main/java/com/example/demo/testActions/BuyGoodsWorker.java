package com.example.demo.testActions;

import com.example.demo.utils.RedisTemplateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

/**
 * Created  at 2017/8/31.
 */
public class BuyGoodsWorker implements Callable<String> {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuyGoodsWorker.class);

    private String sku;
    private int buyCount;
    private  RedisTemplateUtil redisTemplateUtil;

    public BuyGoodsWorker(String sku, int buyCount,RedisTemplateUtil redisTemplateUtil) {
        this.buyCount = buyCount;
        this.sku = sku;
        this.redisTemplateUtil=redisTemplateUtil;
    }


    @Override
    public String call() throws Exception {
        return new GoodsService().buy2(sku,buyCount,redisTemplateUtil);
    }
}
