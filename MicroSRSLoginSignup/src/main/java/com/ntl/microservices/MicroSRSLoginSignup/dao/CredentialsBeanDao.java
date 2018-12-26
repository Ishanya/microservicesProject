package com.ntl.microservices.MicroSRSLoginSignup.dao;


import java.util.ArrayList;

import com.ntl.microservices.MicroSRSLoginSignup.bean.CredentialsBean;


public interface CredentialsBeanDao {
		
	String createCredentialsBean(CredentialsBean credentialsBean) ;
	int deleteCredentialsBean(ArrayList<String> al );
	boolean updateCredentialsBean(CredentialsBean credentialsBean);
	CredentialsBean findByID(String id);
	ArrayList<CredentialsBean> findAll();
	
	}

	

