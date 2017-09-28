package com.example.demo.dao;

import com.example.demo.dto.User;
import com.example.demo.dto.UserExample;
import com.example.demo.dto.UserWithAddress;
import com.example.demo.dto.UserWithAddress2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<UserWithAddress> selectUserAndAddress();

    List<UserWithAddress2> selectUserAndAddress2();
}