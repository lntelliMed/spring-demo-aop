package com.intellimed.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

	public void addMembershipAccount(){
		System.out.println(getClass() + ": Doing my DB work - Adding a new account!");
	}
}
