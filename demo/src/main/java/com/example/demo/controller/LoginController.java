package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.config.jedis.support.util.JedisUtil;
import com.example.demo.config.thread.ThreadPoolConfig;
import com.example.demo.dto.CxsCustomerEmp;
import com.example.demo.services.CxsCustomerEmpService;
import com.example.demo.testActions.BuyService;
import com.example.demo.utils.RedisTemplateUtil;
import com.example.demo.utils.RedisUtilStatic;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created  at 2017/8/25.
 */
@Api(tags = "LoginController 接口")
@RestController
@RequestMapping("/login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private CxsCustomerEmpService cxsCustomerEmpService;

    @Autowired
    private RedisTemplateUtil redisTemplateUtil;

    @Autowired
    private ThreadPoolConfig threadPoolConfig;



    @ApiOperation(value="get 操作")
    @RequestMapping(value = "/get",method= RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public  String get(){
        logger.info("info ....哈哈");
        int a=1;
        int b=1;
        a=a/b;
        return JSON.toJSONString("get...哈哈");
    }

    @RequestMapping("/getUser")
    public  String getUser(){

        logger.info("info ....哈哈");
        logger.warn("warn ....哈哈");
        logger.error("error ....哈哈");
        CxsCustomerEmp cxsCustomerEmp= cxsCustomerEmpService.getByApplyCode("AP20170815192552201");
        return  "getUser...哈哈";
    }

    @ApiOperation(value = "获取用户列表",httpMethod = "GET")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "获取一号店用户列表", response = CxsCustomerEmp.class)})
    @RequestMapping(value = "/getUserList",method= RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public  List<CxsCustomerEmp>  getUserList(){
        PageHelper.startPage(1,2);
        List<CxsCustomerEmp> ls= cxsCustomerEmpService.getByCompName("一号店");
        logger.info(ls.toString());
        return  ls;
    }


    @ApiOperation(value="redis 操作")
    @RequestMapping(value = "/redis",method= RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public  String redis(){
        logger.info("redis ....哈哈");

        JedisUtil.getInstance().getJedis().set("test12","111");

        JedisUtil.getInstance().getJedis().get("test12");
        redisTemplateUtil.getValue("test12");

        return "";
    }



    @ApiOperation(value="reredisConcurrentdis 并发测试")
    @RequestMapping(value = "/redisConcurrent",method= RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public  String redisConcurrent(String sku) throws ExecutionException, InterruptedException {

        logger.info("redisConcurrent.......sku="+sku);

        BuyService buyService=  new BuyService(threadPoolConfig.jobExecutor(),redisTemplateUtil);
        buyService.wannaBuy(sku);

        return  buyService.getBuyResult();
    }


    @ApiOperation(value="reredisConcurrentdis 并发测试")
    @RequestMapping(value = "/redisConcurrent2",method= RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public  String redisConcurrent2(String sku) throws ExecutionException, InterruptedException {

        logger.info("redisConcurrent.......sku="+sku);
        BuyService buyService=  new BuyService(threadPoolConfig.jobExecutor());
        buyService.wannaBuy(sku);
        String result=buyService.getBuyResult();
        System.out.println(RedisUtilStatic.getValue(sku));
        return result;
    }

}
