package com.intellimed.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//@Before("execution(public void addAccount())")
	@Before("execution(public void com.intellimed.aopdemo.dao.AccountDao.addAccount())")
	public void beforeAddAccountAdvice(){
		System.out.println("\n===> Running an @Before advice on methode: public void addAccount()");
	}
}
