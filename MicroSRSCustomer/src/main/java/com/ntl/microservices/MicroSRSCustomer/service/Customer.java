package com.ntl.microservices.MicroSRSCustomer.service;

import java.sql.SQLException;

import com.ntl.microservices.MicroSRSCustomer.bean.ReservationBean;



public interface Customer {

	String  addRegister(ReservationBean registerbean) throws SQLException;
	
}
