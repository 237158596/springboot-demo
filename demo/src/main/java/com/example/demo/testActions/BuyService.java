package com.example.demo.testActions;

import com.example.demo.utils.RedisTemplateUtil;

import java.util.Random;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;

/**
 * Created  at 2017/8/31.
 */

public class BuyService {

    private CompletionService<String> cs;
    private RedisTemplateUtil redisTemplateUtil;
    private int buyPeopleCount=30;

    public  BuyService(ExecutorService executor,RedisTemplateUtil redisTemplateUtil){
        this.cs=new ExecutorCompletionService<String>(executor);
        this.redisTemplateUtil=redisTemplateUtil;
    }


    public  void wannaBuy(String sku){
        for(int i=0;i<buyPeopleCount;i++) {
            cs.submit(new BuyGoodsWorker(sku, Count.getNextInt(),redisTemplateUtil));
        }
    }

    public  String getBuyResult() throws InterruptedException, ExecutionException {
        StringBuilder sb=new StringBuilder();
       for(int i=0;i<buyPeopleCount;i++) {
           String result = cs.take().get();
           sb.append(result+"\n");
       }
       return  sb.toString();
    }


    private static class Count{

        static  Random random=new  Random();
        public  static int getNextInt() {
            return random.nextInt(2)+1;
        }


    }

}
