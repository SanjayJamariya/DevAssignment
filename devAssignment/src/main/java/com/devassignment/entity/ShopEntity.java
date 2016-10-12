package com.devassignment.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The entity class for shop detail
 */
@Entity
public class ShopEntity implements Serializable {

	/** the unique serial version id */
	private static final long serialVersionUID = -7641456882738423650L;

	/** the shop id */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer shopId;
	
	/** the shop name */
	private String shopName;
	
	/** the shop number */
	private Integer shopNumber;
	
	/** the shop postal code */
	private String shopPostCode;
	
	/** the shop location in latitude */
	private Double latitude;
	
	/** the shop location in longitude */
	private Double longitude;

	/**
	 * The method returns shop unique id
	 * 
	 * @return shopId
	 * 		the shop id
	 */
	public Integer getShopId() {
		return shopId;
	}
	
	/**
	 * The setter method for shop id 
	 * 
	 * @param shopId
	 * 		the shop id
	 */
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	
	/**
	 * The method returns shop name 
	 * 
	 * @return shopName
	 * 		the shop name
	 */
	public String getShopName() {
		return shopName;
	}
	
	/**
	 * The setter method for shop name
	 * 
	 * @param shopName
	 * 		the shop name
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	/**
	 * The method returns shop number
	 * 
	 * @return shopNumber
	 * 		the shop number
	 */
	public Integer getShopNumber() {
		return shopNumber;
	}
	
	/**
	 * The setter method for shop number
	 * 
	 * @param shopNumber
	 * 		the shop number
	 */
	public void setShopNumber(Integer shopNumber) {
		this.shopNumber = shopNumber;
	}
	
	/**
	 * The method returns shop post code
	 * 
	 * @return shopPostCode
	 * 		the shop post code
	 */
	public String getShopPostCode() {
		return shopPostCode;
	}
	
	/**
	 * The setter method shop post code
	 * 
	 * @param shopPostCode
	 * 		the shop post code
	 */
	public void setShopPostCode(String shopPostCode) {
		this.shopPostCode = shopPostCode;
	}
	
	/**
	 * The method returns latitude
	 * 
	 * @return latitude
	 * 		the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}
	
	/**
	 * The setter method for latitude
	 * 
	 * @param latitude
	 * 		the latitude
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * The method returns longitude
	 * 
	 * @return longitude
	 * 		the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}
	
	/**
	 * The setter method for longitude
	 * 
	 * @param longitude
	 * 		the longitude
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
}
