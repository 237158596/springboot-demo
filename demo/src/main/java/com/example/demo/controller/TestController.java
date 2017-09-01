package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created  at 2017/9/1.
 */

@RestController
public class TestController {

    @RequestMapping(value = "/first/test",method= RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public  String get(){


        return JSON.toJSONString("get...");
    }

}
