package com.ntl.microservices.MicroSRSLoginSignup.util;

import com.ntl.microservices.MicroSRSLoginSignup.bean.CredentialsBean;
import com.ntl.microservices.MicroSRSLoginSignup.bean.ProfileBean;

public interface User {
	String login(CredentialsBean credentialsBean);
	boolean logout(String userId) ;
	String changePassword(CredentialsBean credentialsBean, String newPassword) ;
	String register(ProfileBean profileBean);
}
