package com.devassignment.dto;

import java.io.Serializable;

public class MapCoordinates implements Serializable {

	/** The unique serial version id */
	private static final long serialVersionUID = 5059891235941410443L;

	/** The latitude value */
	private Double latitude;
	
	/** The latitude value */
	private Double longitude;

	
	/**
	 * The setter method for latitude value
	 * 
	 * @param latitude
	 * 		the latitude value
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * The setter method for longitude
	 * 
	 * @param longitude
	 * 		the longitude value
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * The method returns map latitude value
	 * 
	 * @return latitude
	 * 		the latitude value
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * The method returns longitude value
	 * 
	 * @return longitude
	 * 		the longitude value
	 */
	public Double getLongitude() {
		return longitude;
	}
}
