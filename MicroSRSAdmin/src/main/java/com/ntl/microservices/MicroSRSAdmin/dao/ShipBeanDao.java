package com.ntl.microservices.MicroSRSAdmin.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ntl.microservices.MicroSRSAdmin.bean.ShipBean;



public interface ShipBeanDao {
	
	String createShipBean(ShipBean shipBean) throws SQLException;
	int deleteShipBean(ArrayList<String> al );
	boolean updateShipBean(ShipBean shipBean) throws SQLException ;
	ShipBean findByID(String id) throws SQLException;
	ArrayList<ShipBean> findAll() throws SQLException;
	
}
