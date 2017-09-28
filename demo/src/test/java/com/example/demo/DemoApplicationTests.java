package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.AddrMapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.dto.Addr;
import com.example.demo.dto.UserWithAddress2;
import com.example.demo.utils.HttpUtil;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Before;
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


	@Before
	public void configHttpClient() {
		Unirest.setObjectMapper(new ObjectMapper() {
			@Override
			public <T> T readValue(String value, Class<T> valueType) {
				return JSONObject.parseObject(value, valueType);
			}

			@Override
			public String writeValue(Object value) {
				return JSON.toJSONString(value);
			}
		});
		Unirest.setDefaultHeader("Content-Type", "application/json");
	}

//	@Autowired
//	private CxsCustomerEmpMapper dao;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private AddrMapper addrMapper;


//	@Test
//	public void contextLoads() {
//		PageHelper.startPage(1,2);
//		CxsCustomerEmpExample example=new CxsCustomerEmpExample();
//		example.createCriteria().andCompNameEqualTo("一号店");
//		List<CxsCustomerEmp> ls=dao.selectByExample(example);
//		PageInfo page = new PageInfo(ls);
//		System.out.println("输出结果：" + JSON.toJSONString(ls.get(0)));
//		CxsCustomerEmp CxsCustomerEmp=ls.get(0);
//	}
//
//	@Test
//	@Transactional
//	@Rollback(false)
//	public void update() {
//
//		CxsCustomerEmpExample example=new CxsCustomerEmpExample();
//		example.createCriteria().andApplyCodeEqualTo("AP20170815192552201");
//
//		CxsCustomerEmp record=new CxsCustomerEmp();
//		record.setRemarks("11111");
//		dao.updateByExampleSelective(record,example);
//	}


	@Test
	public  void get() throws UnirestException {
		HttpUtil.getUrl("http://www.weather.com.cn/data/sk/101110101.html");

	}


	@Test
	@Transactional
	@Rollback(false)
	public void userInsert() {
//		User user=new User();
//		user.setAge(11);
//		user.setName("user1");
//		userMapper.insert(user);
		List<UserWithAddress2> users=userMapper.selectUserAndAddress2();
		System.out.println(users.size());

	}


	@Test
	@Transactional
	@Rollback(false)
	public void addressInsert() {
		Addr addr=new Addr();
		addr.setAddress("四川北路");
		addr.setUserid(3);
		addrMapper.insert(addr);

	}




}
