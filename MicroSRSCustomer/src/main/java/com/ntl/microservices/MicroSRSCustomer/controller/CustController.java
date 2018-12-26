package com.ntl.microservices.MicroSRSCustomer.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntl.microservices.MicroSRSCustomer.bean.ReservationBean;
import com.ntl.microservices.MicroSRSCustomer.serviceImpl.CustomerImpl;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class CustController {
	@Autowired
	CustomerImpl cust;
	
	@PostMapping("/customer/registerAdd")
	public String shipAdd(@RequestBody ReservationBean reservebean) throws SQLException
	{
		return cust.addRegister(reservebean);
		
	}
	
	
	
}
