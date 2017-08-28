package com.example.demo.service.impl;

import com.example.demo.dao.CxsCustomerEmpMapper;
import com.example.demo.dto.CxsCustomerEmp;
import com.example.demo.dto.CxsCustomerEmpExample;
import com.example.demo.service.CxsCustomerEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created  at 2017/8/25.
 */
@Service
public class CxsCustomerEmpServiceImpl implements CxsCustomerEmpService {

    @Autowired
    private CxsCustomerEmpMapper cxsCustomerEmpMapper;

    @Override
    public List<CxsCustomerEmp> getByApplyCode(String applyCode) {
        CxsCustomerEmpExample example=new CxsCustomerEmpExample();
        example.createCriteria().andApplyCodeEqualTo(applyCode);
        return cxsCustomerEmpMapper.selectByExample(example);
    }

    public   List<CxsCustomerEmp> getByCompName(String compName){
        CxsCustomerEmpExample example=new CxsCustomerEmpExample();
        example.createCriteria().andCompNameEqualTo(compName);
        return cxsCustomerEmpMapper.selectByExample(example);

    }

}
