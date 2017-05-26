package com.intellimed.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

	public boolean addMembershipAccount(){
		System.out.println(getClass() + ": Doing my DB work - Adding a new membership account!");
		return true;
	}
	
	public void goHome(){
		System.out.println(getClass() + ": Going home");
	}
}
