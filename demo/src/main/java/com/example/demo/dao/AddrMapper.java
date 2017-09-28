package com.example.demo.dao;

import com.example.demo.dto.Addr;
import com.example.demo.dto.AddrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddrMapper {
    int countByExample(AddrExample example);

    int deleteByExample(AddrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Addr record);

    int insertSelective(Addr record);

    List<Addr> selectByExample(AddrExample example);

    Addr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Addr record, @Param("example") AddrExample example);

    int updateByExample(@Param("record") Addr record, @Param("example") AddrExample example);

    int updateByPrimaryKeySelective(Addr record);

    int updateByPrimaryKey(Addr record);
}