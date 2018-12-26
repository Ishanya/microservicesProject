package com.ntl.microservices.MicroSRSAdmin.serviceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.ntl.microservices.MicroSRSAdmin.bean.ShipBean;
import com.ntl.microservices.MicroSRSAdmin.daoImpl.ShipBeanDaoImpl;
import com.ntl.microservices.MicroSRSAdmin.service.Administrator;




@Service
public class AdministratorImpl implements Administrator{

	
	
	ShipBeanDaoImpl Shipsbean=new ShipBeanDaoImpl();

	
	
	@Override
	public String addShip(ShipBean shipbean) throws SQLException {
		
		Random rand = new Random();
		shipbean.setShipID(shipbean.getShipName().substring(0, 2)+String.format("%04d", rand.nextInt(10000)));
		System.out.println("please NOTE UR UNIQUE ID: "+shipbean.getShipID());
		
		String id=Shipsbean.createShipBean(shipbean);
		
		
		return "success";
	}

	@Override
	public boolean modifyShip(ShipBean Shipbean) throws SQLException {
		// TODO Auto-generated method stub
	
		if(Shipsbean.updateShipBean(Shipbean))
		{
			return true;
		}
		
		return false;
	}


	@Override
	public ShipBean viewByShipId(String ShipId) throws SQLException {
	//	System.out.println(ShipId+ " in");
		ShipBean sp=new ShipBean();
		sp=Shipsbean.findByID(ShipId);
		if(sp!=null)
		{
			//System.out.println(sp.getSource()+"in dao");
		return sp;
		}else {
			return null;
		}
	}



	@Override
	public ArrayList<ShipBean> viewByAllShips() throws SQLException {
		ArrayList<ShipBean> al=new ArrayList<ShipBean>();
		al=Shipsbean.findAll();
		if(al!=null)
		{
			return al;
		}
		return null;
	}


	

	public ArrayList<ShipBean> viewBySrc(String src, String dest) throws SQLException{
	
		return Shipsbean.viewByDest(src,dest);
	
	
	}


}
