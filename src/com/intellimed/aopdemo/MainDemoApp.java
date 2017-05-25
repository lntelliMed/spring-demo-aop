package com.intellimed.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intellimed.aopdemo.dao.AccountDao;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
		accountDao.addAccount();
		
		context.close();
		
		
	}

}
