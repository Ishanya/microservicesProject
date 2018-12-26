package com.ntl.practice.loginSignup.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.ntl.practice.loginSignup.bean.RegisterBean;
import com.ntl.practice.loginSignup.service.RegisterService;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class RegisterController {

	@Autowired
	RegisterService service;

	@PostMapping("/signup")
	public String register(@RequestBody RegisterBean user)
	{
		String result=service.addUser(user);
		return result;
	}
	
	@GetMapping("/login/{email}")
	public Optional<RegisterBean> login(@PathVariable("email") String email)
	{
		//System.out.println("new varri");
		Optional<RegisterBean> result=service.checkUser(email);
		if(result!=null)
		{
			System.out.println("logged in");
		}
		return result;
	}
	
}
