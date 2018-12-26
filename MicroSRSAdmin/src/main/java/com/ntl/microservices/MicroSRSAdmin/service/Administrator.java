package com.ntl.microservices.MicroSRSAdmin.service;



import java.sql.SQLException;
import java.util.ArrayList;

import com.ntl.microservices.MicroSRSAdmin.bean.ShipBean;



public interface Administrator {


		String  addShip(ShipBean shipbean) throws SQLException;
		boolean modifyShip(ShipBean Shipbean) throws SQLException;
		ShipBean  viewByShipId(String ShipId) throws SQLException ;
		ArrayList<ShipBean>  viewByAllShips() throws SQLException;
	

	}

	

