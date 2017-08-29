package com.example.demo.services.impl;

import com.example.demo.dao.CxsCustomerEmpMapper;
import com.example.demo.dto.CxsCustomerEmp;
import com.example.demo.dto.CxsCustomerEmpExample;
import com.example.demo.interceptor.testOperation;
import com.example.demo.services.CxsCustomerEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created  at 2017/8/28.
 */
@Service
public class CxsCustomerEmpServiceImpl implements CxsCustomerEmpService {

    @Autowired
    private CxsCustomerEmpMapper cxsCustomerEmpMapper;

    @testOperation(code = "1111")
    @Override
    public CxsCustomerEmp getByApplyCode(String applyCode) {
        CxsCustomerEmpExample example=new CxsCustomerEmpExample();
        example.createCriteria().andApplyCodeEqualTo(applyCode);
        return cxsCustomerEmpMapper.selectByExample(example).get(0);
    }

    @testOperation(code = "2222")
    @Transactional(rollbackFor = Exception.class)
    public   List<CxsCustomerEmp> getByCompName(String compName){
        CxsCustomerEmpExample example=new CxsCustomerEmpExample();
        example.createCriteria().andCompNameEqualTo(compName);

        CxsCustomerEmpExample example2=new CxsCustomerEmpExample();
        example2.createCriteria().andApplyCodeEqualTo("AP20170815192552201");
//
//        CxsCustomerEmp record=new CxsCustomerEmp();
//        record.setRemarks("11111");
//        cxsCustomerEmpMapper.updateByExampleSelective(record,example2);

        return cxsCustomerEmpMapper.selectByExample(example);

    }
}
