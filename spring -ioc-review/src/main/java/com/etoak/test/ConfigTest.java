package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.etoak.action.UserAction;
import com.etoak.bean.User;
import com.etoak.config.UserConfig;

public class ConfigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ioc = new AnnotationConfigApplicationContext(UserConfig.class);
		UserAction userAction = ioc.getBean(UserAction.class);
		User user = userAction.getById(200);
		System.out.println(user.getId()+":"+user.getName());

	}

}
