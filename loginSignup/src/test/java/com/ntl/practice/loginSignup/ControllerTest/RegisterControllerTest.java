package com.ntl.practice.loginSignup.ControllerTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ntl.practice.loginSignup.bean.RegisterBean;
import com.ntl.practice.loginSignup.controller.RegisterController;

public class RegisterControllerTest {

	RegisterController regist=new RegisterController();
	
	RegisterBean bean=new RegisterBean("Gollo@gmail.com","Gollu@123","Male","123456","SGNR","Rajasthan");

	@Test
	public void testRegister() {
	//	RegisterController register=new RegisterController();
	
		String result=regist.register(bean);
		assertEquals(result,"success");
	}

	@Test
	public void testLogin() {
		regist.login("Gollo@gmail.com");
	}

}
