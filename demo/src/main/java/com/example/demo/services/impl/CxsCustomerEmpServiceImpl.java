//package com.example.demo.services.impl;
//
//import com.example.demo.interceptor.testOperation;
//import com.example.demo.services.CxsCustomerEmpService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.CacheConfig;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
///**
// * Created  at 2017/8/28.
// */
//@Service
//@CacheConfig(cacheNames = "CxsCustomerEmp")
//public class CxsCustomerEmpServiceImpl implements CxsCustomerEmpService {
//    private static final Logger logger = LoggerFactory.getLogger(CxsCustomerEmpServiceImpl.class);
//
//    @Autowired
//    private CxsCustomerEmpMapper cxsCustomerEmpMapper;
//
//    @testOperation(code = "1111")
//    @Override
//    public CxsCustomerEmp getByApplyCode(String applyCode) {
//        logger.info("applyCode:{}",applyCode);
//        CxsCustomerEmpExample example=new CxsCustomerEmpExample();
//        example.createCriteria().andApplyCodeEqualTo(applyCode);
//        return cxsCustomerEmpMapper.selectByExample(example).get(0);
//    }
//
//
//    //cache 相关 文章 http://www.cnblogs.com/rollenholt/p/4202631.html
//    @testOperation(code = "2222")
//    @Transactional(rollbackFor = Exception.class)
//    @Cacheable(key = "#p0")
//    public   List<CxsCustomerEmp> getByCompName(String compName){
//
//        logger.info("compName:{}",compName);
//        CxsCustomerEmpExample example=new CxsCustomerEmpExample();
//        example.createCriteria().andCompNameEqualTo(compName);
//
//        CxsCustomerEmpExample example2=new CxsCustomerEmpExample();
//        example2.createCriteria().andApplyCodeEqualTo("AP20170815192552201");
//
//        return cxsCustomerEmpMapper.selectByExample(example);
//
//    }
//
//    @Transactional(rollbackFor = Exception.class)
//    public   void transactionalTest(){
//        CxsCustomerEmpExample example2=new CxsCustomerEmpExample();
//        example2.createCriteria().andApplyCodeEqualTo("AP20170815192552201");
//
//        CxsCustomerEmp record=new CxsCustomerEmp();
//        record.setRemarks("333");
//        cxsCustomerEmpMapper.updateByExampleSelective(record,example2);
//
//        CxsCustomerEmpExample example3=new CxsCustomerEmpExample();
//        example3.createCriteria().andApplyCodeEqualTo("AP20170815192552202");
//        int a=1;int b=0;
//        a=a/b;
//        CxsCustomerEmp record2=new CxsCustomerEmp();
//        record.setRemarks("444");
//        cxsCustomerEmpMapper.updateByExampleSelective(record2,example3);
//
//
//    }
//}
