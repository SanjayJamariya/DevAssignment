package com.devassignment.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.devassignment.dto.MapCoordinates;
import com.devassignment.dto.Shop;
import com.devassignment.dto.ShopCoordinates;

/**
 * The shop service interface reference type for shop
 */
public interface ShopService {

	/**
	 * The method add the shop details
	 * 
	 * @param shop
	 * 		the shop detail
	 */
	void addShop(Shop shop);
	
	/**
	 * The method finds the shop information which is nearest to given coordinates
	 * 
	 * @param coordinates
	 * 		the coordinates 
	 * @return shopCoordinates
	 * 		the shop coordinates
	 */
	ShopCoordinates findShop(@RequestBody  MapCoordinates coordinates); 
}
