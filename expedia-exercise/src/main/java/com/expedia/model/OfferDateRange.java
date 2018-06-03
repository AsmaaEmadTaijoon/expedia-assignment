package com.expedia.model;

/**
 *
 * @author Asma'a Taijoon
 */
public class OfferDateRange {

	private String[] travelStartDate;
	private String[] travelEndDate;
	private int lengthOfStay;

	public String[] getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(String[] travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public String[] getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(String[] travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public int getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
}