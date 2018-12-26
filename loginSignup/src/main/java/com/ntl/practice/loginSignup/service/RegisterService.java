 package com.ntl.practice.loginSignup.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntl.practice.loginSignup.bean.RegisterBean;
import com.ntl.practice.loginSignup.dao.RegisterDao;


@Service
public class RegisterService {
	
	
	@Autowired
	RegisterDao dao;

	public String addUser(RegisterBean user)
	{
		dao.save(user);

		return "success";
	}
	
	public Optional<RegisterBean> checkUser(String email) {
		System.out.println("in/out");
		Optional<RegisterBean> cust=dao.findById(email);
		System.out.println("in");
		return cust;
	}
	
}
