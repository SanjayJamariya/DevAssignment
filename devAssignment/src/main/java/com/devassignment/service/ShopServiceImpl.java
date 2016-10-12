package com.devassignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devassignment.dao.ShopDao;
import com.devassignment.dto.MapCoordinates;
import com.devassignment.dto.Shop;
import com.devassignment.dto.ShopCoordinates;

/**
 * The shop service implementation class for adding shop detail
 */
@Service
public class ShopServiceImpl implements ShopService{

	/** The shop DAO bean */
	@Autowired
	private ShopDao shopdao;
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addShop(Shop shop) {
		shopdao.addShop(shop);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShopCoordinates findShop(MapCoordinates coordinates) {
		return shopdao.findShop(coordinates);
	}
}
