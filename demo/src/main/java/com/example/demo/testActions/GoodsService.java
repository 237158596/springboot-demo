package com.example.demo.testActions;

import com.example.demo.config.jedis.support.util.JedisUtil;
import com.example.demo.utils.RedisTemplateUtil;
import com.example.demo.utils.RedisUtilStatic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.UUID;

/**
 * Created  at 2017/8/30.
 */
@Service
public class GoodsService {

    private static final Logger logger = LoggerFactory.getLogger(GoodsService.class);

    private int goodsCount = 10;


    static {
        System.out.println("CommonService   init...");
    }


    public int getGoodsCount() {
        return goodsCount;
    }


    public String buy(String sku, int buyCount) {
        String msg = "";
        Jedis jedis = JedisUtil.getInstance().getJedis();
        msg+=sku +" 尝试消耗库存buyCount= "+buyCount+"  目前redis 数据 "+ jedis.get(sku)+" -----";
        long count = jedis.incrBy(sku, buyCount);
        if (count > goodsCount) {
            jedis.decrBy(sku, buyCount);
            msg += " 库存不够，归还数据 :"+String.valueOf(buyCount)+"   库存剩余："+jedis.get(sku);
        } else {
            msg += " >>>>>>>成功消耗库存：  " + String.valueOf(buyCount) + "  订单号 " + UUID.randomUUID().toString()+"   库存剩余："+jedis.get(sku);
        }

        JedisUtil.getInstance().returnJedis(jedis);
        return msg;
    }


    public String buy2(String sku, int buyCount,RedisTemplateUtil redisTemplateUtil) {
        String msg = ""+ System.currentTimeMillis()+"--";
        msg+=sku +" 尝试消耗库存buyCount= "+buyCount+"  目前redis 购买数据 "+ redisTemplateUtil.getValue(sku)+" -----";
        long count = redisTemplateUtil.incr(sku, buyCount);
        if (count > goodsCount) {
            redisTemplateUtil.decr(sku, buyCount);
            msg += " 库存不够，归还数据 :"+String.valueOf(buyCount);
        } else {
            msg += " >>>>>>>成功消耗库存：  " + String.valueOf(buyCount) + "  订单号 " + UUID.randomUUID().toString();
        }

        return msg;
    }


    public String buy3(String sku, int buyCount) {
        String msg = ""+ System.currentTimeMillis()+"--";
        msg+=sku +" 尝试消耗库存buyCount= "+buyCount+"  目前redis 购买数据 "+ RedisUtilStatic.getValue(sku)+" -----";
        long count = RedisUtilStatic.incr(sku, buyCount);
        if (count > goodsCount) {
            RedisUtilStatic.decr(sku, buyCount);
            msg += " 库存不够，归还数据 :"+String.valueOf(buyCount);
        } else {
            msg += " >>>>>>>成功消耗库存：  " + String.valueOf(buyCount) + "  订单号 " + UUID.randomUUID().toString();
        }
            logger.info(msg);
        return msg;
    }


}
