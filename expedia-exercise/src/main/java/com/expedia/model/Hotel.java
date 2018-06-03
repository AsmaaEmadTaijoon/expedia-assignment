package com.expedia.model;

/**
 *
 * @author Asma'a Taijoon
 */
public class Hotel {
	private OfferDateRange offerDateRange;
	private Destination destination;
	private Info hotelInfo;
	private UrgencyInfo hotelUrgencyInfo;
	private PricingInfo hotelPricingInfo;
	private Urls urls;
	private Scores scores;

	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public Info getHotelInfo() {
		return hotelInfo;
	}

	public void setHotelInfo(Info hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	public UrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}

	public void setHotelUrgencyInfo(UrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}

	public PricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	public void setHotelPricingInfo(PricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	public Urls getUrls() {
		return urls;
	}

	public void setUrls(Urls urls) {
		this.urls = urls;
	}

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

}
