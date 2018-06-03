
package com.expedia.service;

import org.springframework.web.client.RestTemplate;

import com.expedia.model.HotelOffer;

/**
 *
 * @author Asma'a Taijoon
 */
public class HotelOffersService {

	private final String URL;
	private final RestTemplate restTemplate;

	public HotelOffersService(String apiUrl) {
		this.URL = apiUrl;
		this.restTemplate = new RestTemplate();
	}

	public HotelOffer getHotelOfferBySearch(SearchService search) {
		StringBuilder apiUrl = new StringBuilder(URL + "/offers/v2/getOffers?scenario=deal-finder&page=1&uid=foo&productType=Hotel");
		if (search != null) {
			String str = search.buildParam();

			if (!"".equals(str)) {
				apiUrl.append("&");
				apiUrl.append(str);
			}
		}

		return restTemplate.getForObject(apiUrl.toString(), HotelOffer.class);
	}
}
