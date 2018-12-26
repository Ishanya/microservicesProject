package com.ntl.microservices.MicroSRSAdmin.daoImpl;

import java.util.ArrayList;

import com.ntl.microservices.MicroSRSAdmin.bean.ShipBean;
import com.ntl.microservices.MicroSRSAdmin.dao.ShipBeanDao;
import com.ntl.microservices.MicroSRSAdmin.utilImpl.DBUtilImpl;

import java.sql.*;

public class ShipBeanDaoImpl implements ShipBeanDao{

	Connection con=DBUtilImpl.getDBConnection("jdbc");
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	@Override
	public String createShipBean(ShipBean shipBean) throws SQLException {
		
		ps=con.prepareStatement("insert into Ship_bean values(?,?,?,?,?,?,?)");
		ps.setString(1, shipBean.getShipID());
		ps.setString(2, shipBean.getDestination());
		ps.setDouble(3, shipBean.getPrice());
		ps.setInt(4, shipBean.getReservationCapacity());
		ps.setInt(5,shipBean.getSeatingCapacity());
		ps.setString(6, shipBean.getShipName());
		ps.setString(7, shipBean.getSource());
		int add=ps.executeUpdate();
		if(add>0)
		return shipBean.getShipID();
		else {
			return null;
		}
	}

	@Override
	public int deleteShipBean(ArrayList<String> al) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean updateShipBean(ShipBean shipBean) throws SQLException   {
		// TODO Auto-generated method stub
			
			ps=con.prepareStatement("update Ship_bean set Ship_name='"+shipBean.getShipName()+"', Seating_Capacity='"+shipBean.getSeatingCapacity()+"',Reservation_Capacity='"+shipBean.getReservationCapacity()+"', source='"+shipBean.getSource()+"',destination='"+shipBean.getDestination()+"',price='"+shipBean.getPrice()+"' where shipid='"+shipBean.getShipID()+"'");
			int modify=ps.executeUpdate();
			if(modify>0)
				return true;
			else {
				return false;
			}
		}

		
	

	@Override
	public ShipBean findByID(String id) throws SQLException {
		// TODO Auto-generated method stub
		
		ps=con.prepareStatement("select * from ship_bean where shipId='"+id+"'");
		rs=ps.executeQuery();
		while(rs.next())
		{
		ShipBean sbean=new ShipBean(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getString(7));
		
			return sbean;
		}
		return null;
	}

	@Override
	public ArrayList<ShipBean> findAll() throws SQLException {
		ArrayList<ShipBean> ship=new ArrayList<ShipBean>();
		ps=con.prepareStatement("select * from ship_bean ");
		rs=ps.executeQuery();
		while(rs.next())
		{
			ShipBean sp=new ShipBean(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getString(7));
			ship.add(sp);
		}
		if(rs.first())
		{
			return ship;
		}
		return null;
	}

	
	public ArrayList<ShipBean> viewByDest(String src,String dest) throws SQLException{
		
		ArrayList<ShipBean> ship=new ArrayList<ShipBean>();
		ps=con.prepareStatement("select * from ship_bean where source='"+src+"' and destination='"+dest+"'");
		rs=ps.executeQuery();
		while(rs.next()) {
			ShipBean sp=new ShipBean(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getString(7));
			ship.add(sp);
		
		}
		return ship;
	}
	
}
