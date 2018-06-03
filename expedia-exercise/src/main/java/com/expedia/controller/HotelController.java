package com.expedia.controller;

import com.expedia.model.Hotel;
import com.expedia.service.HotelOffersService;
import com.expedia.service.SearchService;

import static com.expedia.util.Utils.toStringArray;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Asma'a Taijoon
 */
@Controller
public class HotelController {

	@RequestMapping("/")
	public ModelAndView homeView(WebRequest request) {

		Map<String, String[]> mainParams = new HashMap<>();

		String destination = request.getParameter("destination");
		mainParams.put("scenario", toStringArray("deal-finder"));
		mainParams.put("page", toStringArray("1"));
		mainParams.put("uid", toStringArray("foo"));
		mainParams.put("productType", toStringArray("Hotel"));
		mainParams.putAll(request.getParameterMap());

		SearchService searchService = SearchService.parseParams(mainParams);

		if (destination != null && !"".equals(destination)) {
			if (destination.matches("(\\d*,?)+")) {
				searchService.regionIds(destination.split(","));
			} else {
				searchService.destinationName(destination);
			}
		}

		Hotel[] hotels = hotelOffersService.getHotelOfferBySearch(searchService).getOffers().getHotels();

		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		model.addObject("hotels", hotels);
		model.addObject("stayLengths", stayLengths);
		request.getParameterNames().forEachRemaining(p -> model.addObject(p, request.getParameter(p)));
		return model;
	}

	@Autowired
	private HotelOffersService hotelOffersService;

	private static final int[] stayLengths = IntStream.range(0, 15).toArray();
}
