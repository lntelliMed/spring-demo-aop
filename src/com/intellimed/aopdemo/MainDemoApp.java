package com.intellimed.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intellimed.aopdemo.dao.AccountDao;
import com.intellimed.aopdemo.dao.MembershipDao;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
		MembershipDao membershipDao = context.getBean("membershipDao", MembershipDao.class);

		Account account = new Account();
		accountDao.addAccount(account, true);
		accountDao.doSomeWork();
		
		//membershipDao.addAccount();
		membershipDao.addMembershipAccount();
		membershipDao.goHome();
		
		//System.out.println("\n\nRunning addAccount method again!");
		//accountDao.addAccount();

		context.close();
		
		
	}

}
