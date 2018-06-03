/**
 * 
 */
package com.expedia.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Asma'a Taijoon
 *
 */
public class Offers {
	@JsonProperty(value = "Hotel")
	private Hotel[] hotels;

	public Hotel[] getHotels() {
		return hotels;
	}

	public void setHotels(Hotel[] hotels) {
		this.hotels = hotels;
	}
}
