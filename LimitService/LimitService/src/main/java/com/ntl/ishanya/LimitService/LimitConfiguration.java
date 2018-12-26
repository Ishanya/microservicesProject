package com.ntl.ishanya.LimitService;

public class LimitConfiguration {
	
	private int minimum;
	private int maximum;
	/**
	 * @param minimum
	 * @param maximum
	 */
	public LimitConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	/**
	 * 
	 */
	public LimitConfiguration() {
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
