package com.ntl.microservices.MicroSRSLoginSignup.utilImpl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.ntl.microservices.MicroSRSLoginSignup.bean.CredentialsBean;
import com.ntl.microservices.MicroSRSLoginSignup.bean.ProfileBean;
import com.ntl.microservices.MicroSRSLoginSignup.daoImpl.CredentialsBeanDaoImpl;
import com.ntl.microservices.MicroSRSLoginSignup.daoImpl.ProfileBeanDaoImpl;
import com.ntl.microservices.MicroSRSLoginSignup.util.User;



@Service
public class SignedUp implements User{
LoggedIn log=new LoggedIn();


	@Override
	public String login(CredentialsBean credit) {
		System.out.println(credit.getUserID());
		if(log.authenticate(credit))
		{
			if(credit.getLoginStatus()==0) {
			String userType=log.authorize(credit.getUserID());
			 log.changeLoginStatus(credit,credit.getLoginStatus());
			 return userType;
			}
			else {
				
				return "fail";
			}
		}
		else {
			return "invalid";
		}
		
	}

	

	@Override
	public boolean logout(String userId) {
		System.out.println("welcome"+ userId);
		CredentialsBeanDaoImpl cb=new CredentialsBeanDaoImpl();
		CredentialsBean prof=new CredentialsBean();
		 prof=cb.findByID(userId);
		 System.out.println(prof.getUserID());
		LoggedIn log=new LoggedIn();
		
		
		if(log.changeLoginStatus(prof, prof.getLoginStatus()))
		{
			System.out.println("Successfully Logged Out! Happy to serve you");
		}
		else {
			System.out.println("Unable to log you out! Sorry");
		}
		
		return false;
	}


	
	@Override
	public String changePassword(CredentialsBean credentialsBean, String newPassword) {
		// TODO Auto-generated method stub
		
		
		CredentialsBeanDaoImpl cred = new CredentialsBeanDaoImpl();
		credentialsBean.setPassword(newPassword);
		if(cred.changingPassword(credentialsBean)) {
			return credentialsBean.getUserID();
		}
		else {
			return null;
		}
		
	
	}
	
	
	
	@Override
	public String register(ProfileBean profileBean) {
		// TODO Auto-generated method stub
		//System.out.println(profileBean.getFirstName()+"--in register");
		Random rand = new Random();
		profileBean.setUserID(profileBean.getFirstName().substring(0, 2)+String.format("%04d", rand.nextInt(10000)));
		System.out.println("please NOTE UR UNIQUE ID: "+profileBean.getUserID());
		
		ProfileBeanDaoImpl profile=new ProfileBeanDaoImpl();
		String uid=profile.createProfileBean(profileBean);
		if(uid!=null)
		{
			return profileBean.getUserID();
		}
		else {
			
			return null;
		}
		
	}
	
	public CredentialsBean userTypeA(String id)
	{
		CredentialsBeanDaoImpl cb=new CredentialsBeanDaoImpl();
		CredentialsBean cred=new CredentialsBean();
		cred=cb.findByID(id);
		return cred;
	}

}
