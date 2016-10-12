package com.devassignment.googleapi;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.devassignment.dto.MapCoordinates;

/**
 * The java class for generating google coordinates based on given address
 */
public class GoogleMapCoordinate {

	/**
	 * The constructor method for google map coordinates
	 */
	private GoogleMapCoordinate() {

	}

	/**
	 * The method returns the google map coordinates based on given address
	 * 
	 * @param address
	 *            the address area address
	 * @throws IOException
	 *             the IO exception
	 * @throws ParserConfigurationException
	 *             the parser configuration exception
	 * @throws SAXException
	 *             the SAX exception
	 * @throws XPathExpressionException
	 *             the xpath expression exception
	 */
	public static MapCoordinates getMapCoordinates(String address) throws IOException, ParserConfigurationException, SAXException,
			XPathExpressionException {
		String resetUrl = "http://maps.googleapis.com/maps/api/geocode/xml?address=" + URLEncoder.encode(address, "UTF-8") + "&sensor=true";
		URL url = new URL(resetUrl);
		HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
		httpConnection.connect();
		int responseCode = httpConnection.getResponseCode();
		MapCoordinates coordinates = null;
		if (responseCode == 200) {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = builder.parse(httpConnection.getInputStream());
			XPathFactory xPathfactory = XPathFactory.newInstance();
			XPath xpath = xPathfactory.newXPath();
			XPathExpression expr = xpath.compile("/GeocodeResponse/status");
			String status = (String) expr.evaluate(document, XPathConstants.STRING);
			if (status.equals("OK")) {
				expr = xpath.compile("//geometry/location/lat");
				String latitude = (String) expr.evaluate(document, XPathConstants.STRING);
				expr = xpath.compile("//geometry/location/lng");
				String longitude = (String) expr.evaluate(document, XPathConstants.STRING);
				coordinates = new MapCoordinates();
				coordinates.setLatitude(Double.parseDouble(latitude));
				coordinates.setLongitude(Double.parseDouble(longitude));
			}
		}
		
		return coordinates;
	}
}

