package com.ntl.microservices.MicroSRSCustomer.utilImpl;

import java.sql.Connection;
import java.sql.DriverManager;

import com.ntl.microservices.MicroSRSCustomer.util.DBUtil;



public class DBUtilImpl implements DBUtil{

	public static Connection getDBConnection(String driverType) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/project", "root","root");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		
	}
	
	
}
