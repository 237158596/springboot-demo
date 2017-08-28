package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.dao.CxsCustomerEmpMapper;
import com.example.demo.dto.CxsCustomerEmp;
import com.example.demo.dto.CxsCustomerEmpExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Autowired
	private CxsCustomerEmpMapper dao;


	@Test
	public void contextLoads() {
		PageHelper.startPage(1,2);
		CxsCustomerEmpExample example=new CxsCustomerEmpExample();
		example.createCriteria().andCompNameEqualTo("一号店");
		List<CxsCustomerEmp> ls=dao.selectByExample(example);
		PageInfo page = new PageInfo(ls);
		System.out.println("输出结果：" + JSON.toJSONString(ls.get(0)));
		CxsCustomerEmp CxsCustomerEmp=ls.get(0);
	}

	@Test
	@Transactional
	@Rollback(false)
	public void update() {

		CxsCustomerEmpExample example=new CxsCustomerEmpExample();
		example.createCriteria().andApplyCodeEqualTo("AP20170815192552201");

		CxsCustomerEmp record=new CxsCustomerEmp();
		record.setRemarks("11111");
		dao.updateByExampleSelective(record,example);
	}

}
