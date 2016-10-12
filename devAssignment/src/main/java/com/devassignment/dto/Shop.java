package com.devassignment.dto;

import java.io.Serializable;

/**
 * The entity class for shop detail
 */
public class Shop implements Serializable {

	/** The unique serial version id */
	private static final long serialVersionUID = -5936925841104092585L;

	/** The shop name */
	private String shopName;
	
	/** The shop address */
	private ShopAddress address;

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
	 * The method returns shop address
	 * 
	 * @return address
	 * 		the shop address
	 */
	public ShopAddress getAddress() {
		return address;
	}
	
	/**
	 * The setter method for shop address
	 * 
	 * @param address
	 * 		the address
	 */
	public void setAddress(ShopAddress address) {
		this.address = address;
	}
}
