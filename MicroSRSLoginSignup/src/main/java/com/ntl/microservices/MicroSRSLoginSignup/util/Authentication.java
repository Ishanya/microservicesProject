package com.ntl.microservices.MicroSRSLoginSignup.util;

import com.ntl.microservices.MicroSRSLoginSignup.bean.CredentialsBean;

public interface Authentication {
	boolean authenticate(CredentialsBean credentialsBean);
	String authorize(String Userid);
	boolean changeLoginStatus(CredentialsBean credentialsBean, int loginStatus) ;
}
