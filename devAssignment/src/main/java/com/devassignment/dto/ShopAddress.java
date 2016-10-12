package com.devassignment.dto;

import java.io.Serializable;

/**
 * The entity class for storing address
 */
public class ShopAddress implements Serializable {

	/** The unique serial version id */
	private static final long serialVersionUID = 3768666178581309983L;

	/** The shop number */
	private Integer shopNumber;
	/** The shop area post code */
	
	private String shopPostCode;

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
	 * The method returns shop postal area code
	 * 
	 * @return shopPostCode
	 * 		the shop post code
	 */
	public String getShopPostCode() {
		return shopPostCode;
	}

	/**
	 * The setter method for shop postal area code
	 * 
	 * @param shopPostCode
	 * 		the shop post code
	 */
	public void setShopPostCode(String shopPostCode) {
		this.shopPostCode = shopPostCode;
	}
}
