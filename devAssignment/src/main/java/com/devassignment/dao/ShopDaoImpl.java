package com.devassignment.dao;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import com.devassignment.dto.MapCoordinates;
import com.devassignment.dto.Shop;
import com.devassignment.dto.ShopCoordinates;
import com.devassignment.entity.ShopEntity;
import com.devassignment.googleapi.GoogleMapCoordinate;
import com.devassignment.repository.ShopRepository;
import com.devassignment.util.Mapper;

/**
 * The Dao class for persisting shop data into data base
 */
@Service
public class ShopDaoImpl implements ShopDao {	

	/** the spring bean */
	@Autowired
	private ShopRepository shopRepository;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addShop(Shop shop) {

		ShopCoordinates shopCoordinates = new ShopCoordinates();
		shopCoordinates.setShop(shop);
		
		try {
			
			StringBuilder builder = new StringBuilder();
			builder.append(shop.getShopName());
			builder.append("+" + shop.getAddress().getShopNumber());
			builder.append("+" + shop.getAddress().getShopPostCode());
			shopCoordinates.setCoordinates(GoogleMapCoordinate.getMapCoordinates(builder.toString()));
			
		} catch (XPathExpressionException | IOException | ParserConfigurationException | SAXException e) {
			e.printStackTrace();
		}
		ShopEntity se = Mapper.mapToShopEntiry(shopCoordinates);
		shopRepository.save(se);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShopCoordinates findShop(MapCoordinates coordinates) {

		ShopEntity selectedCoordinates = null;
		Double distance = null;
		List<ShopEntity> seList =  shopRepository.findAll();
		for(ShopEntity se: seList){
			
			double earthRadius = 6371000; //meters
		    double dLat = Math.toRadians(se.getLatitude() - coordinates.getLatitude());
		    double dLng = Math.toRadians(se.getLongitude() - coordinates.getLongitude());
		    double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		               Math.cos(Math.toRadians(se.getLatitude())) * Math.cos(Math.toRadians(coordinates.getLatitude())) *
		               Math.sin(dLng/2) * Math.sin(dLng/2);
		    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		    double dist = (float) (earthRadius * c);
			
		    if(distance == null || distance > dist)  {
		    	distance = dist;
		    	selectedCoordinates = se;
		    }
		}
		
		if(selectedCoordinates == null) {
			selectedCoordinates = new ShopEntity();
		}
		return Mapper.mapToDto(selectedCoordinates);
	}
}
