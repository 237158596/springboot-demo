package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.example.demo.dao")
@EnableTransactionManagement
public class DemoApplication {

	public static void main(String[] args) {

		configHttpClient();
		SpringApplication.run(DemoApplication.class, args);
	}



	private static void configHttpClient() {
		Unirest.setObjectMapper(new ObjectMapper() {
			@Override
			public <T> T readValue(String value, Class<T> valueType) {
				return JSON.parseObject(value, valueType);
			}

			@Override
			public String writeValue(Object value) {
				return JSON.toJSONString(value);
			}
		});
		Unirest.setDefaultHeader("Content-Type", "application/json");
		Unirest.setDefaultHeader("Accept", "application/json");
		Unirest.setTimeouts(10 * 1000, 60 * 1000);
	}
}
