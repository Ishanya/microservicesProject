package com.ntl.ishanya.LimitService;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
public class Configuration {
	
	private int minimum;
	private int maximum;
	/**
	 * @param minimum
	 * @param maximum
	 */
	public Configuration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	/**
	 * 
	 */
	public Configuration() {
		super();
	}
	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}
	/**
	 * @param minimum the minimum to set
	 */
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	/**
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}
	/**
	 * @param maximum the maximum to set
	 */
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	

}

