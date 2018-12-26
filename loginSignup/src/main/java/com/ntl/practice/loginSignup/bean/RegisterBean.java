package com.ntl.practice.loginSignup.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegisterBean {

@Id
private String email;
private String password;
private String gender;
private String postalCode;
private String city;
private String state;


public RegisterBean(String email, String password, String gender, String postalCode, String city, String state) {
	super();
	this.email = email;
	this.password = password;
	this.gender = gender;
	this.postalCode = postalCode;
	this.city = city;
	this.state = state;
}

public RegisterBean() {
	super();
}




/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

/**
 * @return the password
 */
public String getPassword() {
	return password;
}


/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}


/**
 * @return the gender
 */
public String getGender() {
	return gender;
}


/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}


/**
 * @return the postalCode
 */
public String getPostalCode() {
	return postalCode;
}


/**
 * @param postalCode the postalCode to set
 */
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}


/**
 * @return the city
 */
public String getCity() {
	return city;
}


/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}


/**
 * @return the state
 */
public String getState() {
	return state;
}


/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}




}
