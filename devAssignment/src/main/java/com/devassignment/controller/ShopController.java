package com.devassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devassignment.dto.MapCoordinates;
import com.devassignment.dto.Shop;
import com.devassignment.dto.ShopCoordinates;
import com.devassignment.service.ShopService;

/** 
 * The shop controller for handling servlet requests
 */

@RestController
public class ShopController {

	/** The shop service bean */
	@Autowired
	private ShopService  shopService;
	
	@RequestMapping(value = "/addShop", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addShop(@RequestBody Shop shop){
	
		shopService.addShop(shop);
	}
	
	@RequestMapping(value = "/findShop", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ShopCoordinates findShop(@RequestBody  MapCoordinates coordinates) {
		
		return shopService.findShop(coordinates);
	}
}
