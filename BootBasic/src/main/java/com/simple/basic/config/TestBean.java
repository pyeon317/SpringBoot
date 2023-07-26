package com.simple.basic.config;

import org.springframework.context.annotation.Bean;

public class TestBean {

	@Bean 
	public void test() {
		System.out.println(1);
	}
	
	
}
