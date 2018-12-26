package com.ntl.microservices.MicroSRSLoginSignup.utilImpl;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;

import com.ntl.microservices.MicroSRSLoginSignup.bean.CredentialsBean;
import com.ntl.microservices.MicroSRSLoginSignup.daoImpl.CredentialsBeanDaoImpl;
import com.ntl.microservices.MicroSRSLoginSignup.util.Authentication;





public class LoggedIn implements Authentication {


	CredentialsBeanDaoImpl guc=new CredentialsBeanDaoImpl();
	//String UserType[]=new String[2];
	static CredentialsBean credit=new CredentialsBean();
	
	@Override
	public boolean authenticate(CredentialsBean credentialsBean) {
		
		
		System.out.println(credentialsBean.getUserID()+" in");
	
		credit=guc.findByID(credentialsBean.getUserID());
		int flag=0;
	
				
				if(credit!=null ) {
					if(credit.getPassword().equals(credentialsBean.getPassword()))
						{
			//	guc.changeStatus(credentialsBean);
					flag=1;
					return true;
				
						}
					else {
						System.out.println("fail");
						return false;
					}
				}
			else {
				System.out.println("invalid");
				return false;
			}
			
	
		
	}

		
		
	

	@Override
	public String authorize(String Userid) {
		// TODO Auto-generated method stub
		
		//CredentialsBeanDaoImpl credImpl=new CredentialsBeanDaoImpl();
		
		if(credit.getUserID().equals(Userid))
		{
			return credit.getUserType();
			
		}
		
		return null;
	}

	@Override
	public boolean changeLoginStatus(CredentialsBean credentialsBean, int loginStatus) {
		// TODO Auto-generated method stub
		
		CredentialsBean credit=new CredentialsBean();
		
		credit=guc.findByID(credentialsBean.getUserID());
	
		if(credit!=null)
		{
			
			if(guc.updateCredentialsBean(credentialsBean))
			{
				System.out.println("Status changed");
				return true;
			}
			else {
				System.out.println("status not changed");
			}
			
			
			
		}
		return false;
	}

}
