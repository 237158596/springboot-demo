package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created  at 2017/8/25.
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/getUser")
    public  String getUser(){

        LOG.info("info ....哈哈");
        LOG.warn("warn ....哈哈");
        LOG.error("error ....哈哈");
        return  "getUser...哈哈";
    }

}
