package com.ntl.microservices.MicroSRSAdmin.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntl.microservices.MicroSRSAdmin.bean.ShipBean;
import com.ntl.microservices.MicroSRSAdmin.serviceImpl.AdministratorImpl;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AdminController {
	
	@Autowired
	AdministratorImpl admin;
	
	@PostMapping("/admin/shipAdd")
	public String shipAdd(@RequestBody ShipBean shipbean) throws SQLException
	{
		return admin.addShip(shipbean);
		
	}
	
	@PutMapping("/admin/shipModify")
	public boolean shipModify(@RequestBody ShipBean shipbean) throws SQLException
	{
		return admin.modifyShip(shipbean);
	}
	
	@GetMapping("/admin/{id}")
	public ShipBean byId(@PathVariable("id") String id) throws SQLException
	{
		//System.out.println(id);
		//System.out.println("fininf id");
		
		return admin.viewByShipId(id);
	}
	
	@GetMapping("/admin/all")
	public ArrayList<ShipBean> viewAll() throws SQLException
	{
		return admin.viewByAllShips();
	}
	
	@GetMapping("/customer/{src}/{dest}")
	public ArrayList<ShipBean> viewDetail(@PathVariable("src") String src,@PathVariable("dest") String dest) throws SQLException{
		
		return admin.viewBySrc(src,dest);
	
		
	}
	
}
