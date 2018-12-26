package com.ntl.microservices.MicroSRSCustomer.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReservationBean {

	@Id
	private String reservationID;
	private String destination;
	private int noOfSeats;

	private String source;

	private String shipId;
	private double totalFare;

	
	private String userId;

	/**
	 * 
	 */
	public ReservationBean() {
		super();
	}


	
	
	/**
	 * @param destination
	 * @param noOfSeats
	 * @param source
	 * @param shipId
	 * @param totalFare
	 * @param userId
	 */
	public ReservationBean(String destination, int noOfSeats, String source, String shipId, double totalFare,
			String userId) {
		super();
		this.destination = destination;
		this.noOfSeats = noOfSeats;
		this.source = source;
		this.shipId = shipId;
		this.totalFare = totalFare;
		this.userId = userId;
	}




	/**
	 * @param reservationID
	 * @param destination
	 * @param noOfSeats
	 * @param source
	 * @param shipId
	 * @param totalFare
	 * @param userId
	 */
	public ReservationBean(String reservationID, String destination, int noOfSeats, String source, String shipId,
			double totalFare, String userId) {
		super();
		this.reservationID = reservationID;
		this.destination = destination;
		this.noOfSeats = noOfSeats;
		this.source = source;
		this.shipId = shipId;
		this.totalFare = totalFare;
		this.userId = userId;
	}




	/**
	 * @return the reservationID
	 */
	public String getReservationID() {
		return reservationID;
	}

	/**
	 * @param reservationID the reservationID to set
	 */
	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}

	/**
	 * @return the totalFare
	 */
	public double getTotalFare() {
		return totalFare;
	}

	/**
	 * @param totalFare the totalFare to set
	 */
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	/**
	 * @return the noOfSeats
	 */
	public int getNoOfSeats() {
		return noOfSeats;
	}

	/**
	 * @param noOfSeats the noOfSeats to set
	 */
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
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
	 * @return the shipId
	 */
	public String getShipId() {
		return shipId;
	}

	/**
	 * @param shipId the shipId to set
	 */
	public void setShipId(String shipId) {
		this.shipId = shipId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	
	
	
	
}
