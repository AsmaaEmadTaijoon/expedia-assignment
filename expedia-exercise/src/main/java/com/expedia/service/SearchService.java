package com.expedia.service;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.expedia.util.Utils;

/**
 *
 * @author Asma'a Taijoon
 */
public class SearchService {

	private String destinationName;
	private String destinationCity;
	private String[] regionIds;
	private Date minTripStartDate;
	private Date maxTripStartDate;
	private Integer lengthOfStay;
	private Double minStarRating;
	private Double maxStarRating;
	private Integer minTotalRate;
	private Integer maxTotalRate;
	private Double minGuestRating;
	private Double maxGuestRating;

	public static SearchService parseParams(Map<String, String[]> params) {
		if (params == null) {
			return null;
		}

		SearchService searchService = new SearchService();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		Field[] fields = searchService.getClass().getDeclaredFields();

		for (Field field : fields) {
			String name = field.getName();
			if (params.containsKey(name)) {

				String[] v = params.get(name);

				if (v != null && v.length != 0) {
					Class fieldClz = field.getType();
					if (v.length == 1 && "".equals(v[0].trim())) {
						continue;
					}
					try {
						if (fieldClz == Double.class) {
							field.set(searchService, Double.parseDouble(v[0]));
						} else if (fieldClz == Integer.class) {
							field.set(searchService, Integer.parseInt(v[0]));
						} else if (fieldClz == Date.class) {
							field.set(searchService, formatter.parse(v[0]));
						} else if (fieldClz == String.class) {
							field.set(searchService, v[0]);
						} else if (fieldClz == String[].class) {
							field.set(searchService, v);
						}
					} catch (IllegalAccessException | ParseException e) {
					}
				}
			}
		}

		return searchService;
	}

	public String buildParam() {
		Field[] fields = this.getClass().getDeclaredFields();
		StringBuilder str = new StringBuilder();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		boolean firstElement = true;
		for (Field field : fields) {
			try {
				String name = field.getName();
				Object value = field.get(this);

				if (value == null) {
					continue;
				}

				if (!firstElement) {
					str.append("&");
				}
				str.append(name);
				str.append("=");

				if (value instanceof Date) {
					value = formatter.format((Date) value);
				} else if (value instanceof String[]) {
					value = Utils.toString((String[]) value, ",");
				}
				str.append(value);
				firstElement = false;

			} catch (IllegalAccessException e) {

			}
		}

		return str.toString();
	}


	public String destinationName() {
		return destinationName;
	}

	public SearchService destinationName(String destinationName) {
		this.destinationName = destinationName;
		return this;
	}

	public String destinationCity() {
		return destinationCity;
	}

	public SearchService destinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
		return this;
	}

	public String[] regionIds() {
		return regionIds;
	}

	public SearchService regionIds(String... regionIds) {
		this.regionIds = regionIds;
		return this;
	}

	public Date minTripStartDate() {
		return minTripStartDate;
	}

	public SearchService minTripStartDate(Date minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
		return this;
	}

	public Date maxTripStartDate() {
		return maxTripStartDate;
	}

	public SearchService maxTripStartDate(Date maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
		return this;
	}

	public Integer lengthOfStay() {
		return lengthOfStay;
	}

	public SearchService lengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
		return this;
	}

	public Double minStarRating() {
		return minStarRating;
	}

	public SearchService minStarRating(Double minStarRating) {
		this.minStarRating = minStarRating;
		return this;
	}

	public Double maxStarRating() {
		return maxStarRating;
	}

	public SearchService maxStarRating(Double maxStarRating) {
		this.maxStarRating = maxStarRating;
		return this;
	}

	public Integer minTotalRate() {
		return minTotalRate;
	}

	public SearchService minTotalRate(Integer minTotalRate) {
		this.minTotalRate = minTotalRate;
		return this;
	}

	public Integer maxTotalRate() {
		return maxTotalRate;
	}

	public SearchService maxTotalRate(Integer maxTotalRate) {
		this.maxTotalRate = maxTotalRate;
		return this;
	}

	public Double minGuestRating() {
		return minGuestRating;
	}

	public SearchService minGuestRating(Double minGuestRating) {
		this.minGuestRating = minGuestRating;
		return this;
	}

	public Double maxGuestRating() {
		return maxGuestRating;
	}

	public SearchService maxGuestRating(Double maxGuestRating) {
		this.maxGuestRating = maxGuestRating;
		return this;
	}

}
