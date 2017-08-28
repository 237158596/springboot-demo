package com.example.demo.dao;

import com.example.demo.dto.CxsCustomerEmp;
import com.example.demo.dto.CxsCustomerEmpExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CxsCustomerEmpMapper {
    int countByExample(CxsCustomerEmpExample example);

    int deleteByExample(CxsCustomerEmpExample example);

    int insert(CxsCustomerEmp record);

    int insertSelective(CxsCustomerEmp record);

    List<CxsCustomerEmp> selectByExample(CxsCustomerEmpExample example);

    int updateByExampleSelective(@Param("record") CxsCustomerEmp record, @Param("example") CxsCustomerEmpExample example);

    int updateByExample(@Param("record") CxsCustomerEmp record, @Param("example") CxsCustomerEmpExample example);
}