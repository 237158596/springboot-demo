package com.example.demo.controller;

import com.example.demo.dto.CxsCustomerEmp;
import com.example.demo.services.CxsCustomerEmpService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created  at 2017/8/25.
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private CxsCustomerEmpService cxsCustomerEmpService;

    @RequestMapping("/getUser")
    public  String getUser(){

        logger.info("info ....哈哈");
        logger.warn("warn ....哈哈");
        logger.error("error ....哈哈");
        return  "getUser...哈哈";
    }


    @RequestMapping("/getUserList")
    public  List<CxsCustomerEmp>  getUserList(){
        PageHelper.startPage(1,2);
        List<CxsCustomerEmp> ls= cxsCustomerEmpService.getByCompName("一号店");
        logger.info(ls.toString());
        return  ls;
    }

}
