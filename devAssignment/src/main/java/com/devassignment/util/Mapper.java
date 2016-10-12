package com.devassignment.util;

import com.devassignment.dto.MapCoordinates;
import com.devassignment.dto.Shop;
import com.devassignment.dto.ShopAddress;
import com.devassignment.dto.ShopCoordinates;
import com.devassignment.entity.ShopEntity;

/**
 * The entity mapper class to map data from DTO to entity type
 */
public class Mapper {

	/**
	 * The private constructor method
	 */
	private Mapper() {
		
	}
	
	/**
	 * The method maps the ShopCoordinates type DTO to ShopEntity type object
	 *  
	 * @param coordinates
	 * 		the shop coordinates
	 * 
	 * @return entity
	 * 		the shop entity type
	 */
	public static ShopEntity mapToShopEntiry(ShopCoordinates coordinates) {
		
		ShopEntity shopEntity = new ShopEntity();
		if(shopEntity != null) {
			
			shopEntity.setShopName(coordinates.getShop().getShopName());
			shopEntity.setShopNumber(coordinates.getShop().getAddress().getShopNumber());
			shopEntity.setShopPostCode(coordinates.getShop().getAddress().getShopPostCode());
			shopEntity.setLatitude(coordinates.getCoordinates().getLatitude());
			shopEntity.setLongitude(coordinates.getCoordinates().getLongitude());
		}
		return shopEntity;
	}
	
	/**
	 * The method returns the mapping object of {@link ShopCoordinates} type from {@link ShopEntity} object 
	 * 
	 * @param shopEntity
	 * 		the shop entity type
	 * @return shopCoordinates
	 * 		the shop coordinates
	 */
	public static ShopCoordinates mapToDto(ShopEntity shopEntity) {
		
		ShopCoordinates sc = new ShopCoordinates();
		if(shopEntity != null) {
			
			ShopAddress sa = new ShopAddress();
			sa.setShopNumber(shopEntity.getShopNumber());
			sa.setShopPostCode(shopEntity.getShopPostCode());
			
			MapCoordinates mc = new MapCoordinates();
			mc.setLatitude(shopEntity.getLatitude());
			mc.setLongitude(shopEntity.getLongitude());
			
			Shop shop = new Shop();
			shop.setShopName(shopEntity.getShopName());
			shop.setAddress(sa);
			
			sc.setShop(shop);
			sc.setCoordinates(mc);
		}
		return sc;
	}
}
