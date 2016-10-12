package com.devassignment.dto;

import java.io.Serializable;

/**
 * The shop coordinates details
 */
public class ShopCoordinates implements Serializable {

	/** The unique serial version id */
	private static final long serialVersionUID = -3878665146359068312L;

	/** The shop detail */
	private Shop shop;

	/** The shop coordinates detail */
	private MapCoordinates coordinates;

	/**
	 * The method returns shop details
	 * 
	 * @return shop 
	 * 		the shop detail
	 */
	public Shop getShop() {
		return shop;
	}

	/**
	 * The setter method for shop detail
	 * 
	 * @param shop
	 *            the shop detail
	 */
	public void setShop(Shop shop) {
		this.shop = shop;
	}

	/**
	 * The method returns shop coordinates
	 * 
	 * @return coordinates 
	 * 		the shop coordinates
	 */
	public MapCoordinates getCoordinates() {
		return coordinates;
	}

	/**
	 * The setter method for shop coordinates
	 * 
	 * @param coordinates
	 *            the shop coordinates
	 */
	public void setCoordinates(MapCoordinates coordinates) {
		this.coordinates = coordinates;
	}
}
