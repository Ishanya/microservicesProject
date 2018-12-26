package com.ntl.microservices.MicroSRSAdmin.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShipBean {

	@Id
	private String shipID;
	private String shipName;
	private int seatingCapacity;
	private int reservationCapacity;
	private String source;
	private String destination;
	private double price;
	
	public ShipBean() {
		super();
	}
	

	public ShipBean(String shipID, String shipName, int seatingCapacity, int reservationCapacity) {
		super();
		this.shipID = shipID;
		this.shipName = shipName;
		this.seatingCapacity = seatingCapacity;
		this.reservationCapacity = reservationCapacity;
	}



	public ShipBean(String shipName, int seatingCapacity, int reservationCapacity) {
		super();
		this.shipName = shipName;
		this.seatingCapacity = seatingCapacity;
		this.reservationCapacity = reservationCapacity;
	}

	

	/**
	 * @param shipName
	 * @param seatingCapacity
	 * @param reservationCapacity
	 * @param source
	 * @param destination
	 * @param price
	 */
	public ShipBean(String shipName, int seatingCapacity, int reservationCapacity, String source, String destination,
			double price) {
		super();
		this.shipName = shipName;
		this.seatingCapacity = seatingCapacity;
		this.reservationCapacity = reservationCapacity;
		this.source = source;
		this.destination = destination;
		this.price = price;
	}
	
	


	/**
	 * @param shipID
	 * @param shipName
	 * @param seatingCapacity
	 * @param reservationCapacity
	 * @param source
	 * @param destination
	 * @param price
	 */
	public ShipBean(String shipID,String destination, double price,int seatingCapacity,int reservationCapacity, String shipName, String source) {
		super();
		this.shipID = shipID;
		this.shipName = shipName;
		this.seatingCapacity = seatingCapacity;
		this.reservationCapacity = reservationCapacity;
		this.source = source;
		this.destination = destination;
		this.price = price;
	}


	public String getShipID() {
		return shipID;
	}
	public void setShipID(String shipID) {
		this.shipID = shipID;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public int getReservationCapacity() {
		return reservationCapacity;
	}
	public void setReservationCapacity(int reservationCapacity) {
		this.reservationCapacity = reservationCapacity;
	}
	
	


	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}


	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}


	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}


	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ShipBean [shipID=" + shipID + ", shipName=" + shipName + "]";
	}
	
	
	
}
