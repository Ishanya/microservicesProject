package com.ntl.microservices.MicroSRSCustomer.serviceImpl;

import java.sql.SQLException;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.ntl.microservices.MicroSRSCustomer.bean.ReservationBean;
import com.ntl.microservices.MicroSRSCustomer.daoImpl.ReservationBeanDaoImpl;
import com.ntl.microservices.MicroSRSCustomer.service.Customer;



@Service
public class CustomerImpl implements Customer{

	@Override
	public String addRegister(ReservationBean registerbean) throws SQLException {
		ReservationBeanDaoImpl reser=new ReservationBeanDaoImpl();

		Random rand = new Random();
		registerbean.setReservationID(registerbean.getSource().substring(0, 2)+registerbean.getDestination().substring(0, 2)+String.format("%04d", rand.nextInt(10000)));
		System.out.println("please NOTE UR UNIQUE ID: "+registerbean.getReservationID());
	
		String id=reser.createReservationBean(registerbean);
		if(id!=null)
		{
			return "success";
		}
		return null;
	}

}
