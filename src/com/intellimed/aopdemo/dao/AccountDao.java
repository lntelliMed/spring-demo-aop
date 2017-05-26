package com.intellimed.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.intellimed.aopdemo.Account;

@Component
public class AccountDao {

	public void addAccount(Account account, boolean vipFlag ){
		System.out.println(getClass() + ": Doing my DB work - Adding a new account!");
	}
	
	public boolean doSomeWork(){
		System.out.println(getClass() + ": Doing some work");
		return false;
	}
}
