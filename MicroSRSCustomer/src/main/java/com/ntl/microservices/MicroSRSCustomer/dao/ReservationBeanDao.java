package com.ntl.microservices.MicroSRSCustomer.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ntl.microservices.MicroSRSCustomer.bean.ReservationBean;



public interface ReservationBeanDao {


	String createReservationBean(ReservationBean reservationBean) throws SQLException ;
	
	ReservationBean findByID(String id) throws SQLException;
	ArrayList<ReservationBean> findAll();
	
}
