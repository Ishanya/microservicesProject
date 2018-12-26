package com.ntl.microservices.MicroSRSLoginSignup.Client;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntl.microservices.MicroSRSLoginSignup.bean.CredentialsBean;
import com.ntl.microservices.MicroSRSLoginSignup.bean.ProfileBean;
import com.ntl.microservices.MicroSRSLoginSignup.utilImpl.LoggedIn;
import com.ntl.microservices.MicroSRSLoginSignup.utilImpl.SignedUp;






@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class Shiping {
	static String reserveId;
	static Scanner sc=new Scanner(System.in);
	LoggedIn log=new LoggedIn();
	static double tfare=0.0;
	CredentialsBean sign=new CredentialsBean();
	ProfileBean profile=new ProfileBean();
	//SignedUp signup=new SignedUp();
	
	static CredentialsBean credit=null;

	@Autowired
	SignedUp signup;
	
	
//	@GetMapping("/")
//	public boolean getData() throws IOException, ClassNotFoundException, SQLException
//	{
		
	//List<CredentialsBean> listCredit=new ArrayList<CredentialsBean>();
	
	@PostMapping("/logIn")
	public boolean getLogin(@RequestBody CredentialsBean customer) throws ClassNotFoundException, IOException, SQLException
	{
		//System.out.println(customer.getUserID()+" "+customer.getPassword());
		credit=new CredentialsBean(customer.getUserID(),customer.getPassword());
		//System.out.println(" signup Object "+signup);
		String result=signup.login(credit);
		//System.out.println(result);
		if(result.equals("A"))
		{
			System.out.println("hello admin");
			
		}
		else if(result.equals("C"))
		{
			System.out.println("hello customer");
			}
		else if(result.equals("fail"))
		{
			System.out.println(" Already logged in!");
		}
		else {
			System.out.println("no such user exists");
		}
		return true;
		
	}
	
	@PostMapping("/signUp")
	public boolean getSignup(@RequestBody ProfileBean profile) throws IOException, ClassNotFoundException
	{
	
		
//		String dobirth=sc.nextLine();
//		String dateOfBirth[]=dobirth.split("/");
//		LocalDate dob=LocalDate.of(Integer.parseInt(dateOfBirth[2]),Integer.parseInt(dateOfBirth[1]), Integer.parseInt(dateOfBirth[0]));
//		//profile.setDateOfBirth(dob);
		
	
		System.out.println("in "+profile.getFirstName());
		ProfileBean profileBean=new ProfileBean(profile.getFirstName(),profile.getLastName(),profile.getDateOfBirth(),profile.getGender(),profile.getStreet(),profile.getLocation(),profile.getCity(),profile.getState(),profile.getPincode(),profile.getMobileNo(),profile.getEmailID(),profile.getPassword());
		
		System.out.println(profileBean);
		String registration=signup.register(profileBean) ;
		if(registration!=null)
		{
			System.out.println("registration Successfull");
		}
		else {
			System.out.println("something is wrong");
		}
			
	return true;
	
	}
	
	public boolean changingPassword(CredentialsBean cb) throws IOException, ClassNotFoundException
	{
		System.out.println("enter old password");
		String passwd=sc.nextLine();
		//profile.setGender(gender);
		
		System.out.println("enter new password");
		String pass=sc.nextLine();
	//	profile.setStreet(street);
		
		System.out.println("confirm password");
		String cnfpass=sc.nextLine();
//		profile.setLocation(location);
		
		if(cb.getPassword().equals(passwd) && pass.equals(cnfpass))
		{
			String str=signup.changePassword(cb,pass);
			
			if(str!=null)
			{
				System.out.println("password changed for user"+str);
			}
			else {
				System.out.println("Unsuccessful");
			}
		}
		else {
			System.out.println("something is not correct");
		}
		return true;
	}
	
	@GetMapping("/type/{id}")
	public CredentialsBean userType(@PathVariable("id") String id)
	{
		System.out.println("typing"+id);
		return signup.userTypeA(id);
	}
	
	@PutMapping("/logout/{id}")
	public boolean logout(@PathVariable("id") String id)
	{
		return signup.logout(id);
	}
}


