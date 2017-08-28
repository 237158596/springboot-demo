package com.example.demo.services;

import com.example.demo.dto.CxsCustomerEmp;

import java.util.List;

/**
 * Created  at 2017/8/28.
 */
public interface CxsCustomerEmpService {
    List<CxsCustomerEmp> getByApplyCode(String applyCode);

    List<CxsCustomerEmp> getByCompName(String compName);

}
