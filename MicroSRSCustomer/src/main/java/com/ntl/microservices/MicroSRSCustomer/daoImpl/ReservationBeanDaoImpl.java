package com.ntl.microservices.MicroSRSCustomer.daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;

import com.ntl.microservices.MicroSRSCustomer.bean.ReservationBean;
import com.ntl.microservices.MicroSRSCustomer.dao.ReservationBeanDao;
import com.ntl.microservices.MicroSRSCustomer.utilImpl.DBUtilImpl;


public class ReservationBeanDaoImpl implements ReservationBeanDao{

	Connection con=DBUtilImpl.getDBConnection("jdbc");
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	
	@Override
	public String createReservationBean(ReservationBean reservationBean) throws SQLException {
		
		ps=con.prepareStatement("insert into reservation_bean values(?,?,?,?,?,?,?)");
		ps.setString(1, reservationBean.getReservationID());
		ps.setString(2, reservationBean.getDestination());
		ps.setInt(3, reservationBean.getNoOfSeats());
		ps.setString(4, reservationBean.getShipId());
		ps.setString(5,reservationBean.getSource());
		ps.setDouble(6, reservationBean.getTotalFare());
		ps.setString(7, reservationBean.getUserId());
		
		int show=ps.executeUpdate();
		
		
		
		
		if(show>0)
		{
			return reservationBean.getReservationID();
		}
		return null;
	}


	

	@Override
	public ReservationBean findByID(String id) throws SQLException {
		ps=con.prepareStatement("select * from reservation_bean where ReservationId='"+id+"'");
		rs=ps.executeQuery();
		while(rs.next())
		{
		
		ReservationBean rebean=new ReservationBean(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getString(7));
		
			return rebean;
		}
		return null;
	}

	@Override
	public ArrayList<ReservationBean> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
