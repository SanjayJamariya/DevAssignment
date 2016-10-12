package com.devassignment.dao;

import org.springframework.web.bind.annotation.RequestBody;

import com.devassignment.dto.MapCoordinates;
import com.devassignment.dto.Shop;
import com.devassignment.dto.ShopCoordinates;

public interface ShopDao {

	/** 
	 * The method persist the shop information
	 * 
	 * @param shop
	 * 		the shop information
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
