package com.expedia.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Info {
	private String hotelId;
	private String hotelName;
	private String hotelDestination;
	private String hotelDestinationRegionID;
	private String hotelLongDestination;
	private String hotelStreetAddress;
	private String hotelCity;
	private String hotelProvince;
	private String hotelCountryCode;
	private String hotelLocation;
	private double hotelLatitude;
	private double hotelLongitude;
	private String hotelStarRating;
	private double hotelGuestReviewRating;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date travelStartDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date travelEndDate;
	private String hotelImageUrl;
	private double carPackageScore;
	private String description;
	private double distanceFromUser;
	private String language;
	private double movingAverageScore;
	private double promotionAmount;
	private String promotionDescription;
	private String promotionTag;
	private double rawAppealScore;
	private double relevanceScore;
	private String statusCode;
	private String statusDescription;
	private boolean carPackage;
	private boolean allInclusive;

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelDestination() {
		return hotelDestination;
	}

	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	public String getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelProvince() {
		return hotelProvince;
	}

	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public double getHotelLatitude() {
		return hotelLatitude;
	}

	public void setHotelLatitude(double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	public double getHotelLongitude() {
		return hotelLongitude;
	}

	public void setHotelLongitude(double hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	public String getHotelStarRating() {
		return hotelStarRating;
	}

	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	public double getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	public void setHotelGuestReviewRating(double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	public Date getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(Date travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public Date getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(Date travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	public double getCarPackageScore() {
		return carPackageScore;
	}

	public void setCarPackageScore(double carPackageScore) {
		this.carPackageScore = carPackageScore;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDistanceFromUser() {
		return distanceFromUser;
	}

	public void setDistanceFromUser(double distanceFromUser) {
		this.distanceFromUser = distanceFromUser;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getMovingAverageScore() {
		return movingAverageScore;
	}

	public void setMovingAverageScore(double movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}

	public double getPromotionAmount() {
		return promotionAmount;
	}

	public void setPromotionAmount(double promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	public String getPromotionDescription() {
		return promotionDescription;
	}

	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}

	public String getPromotionTag() {
		return promotionTag;
	}

	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}

	public double getRawAppealScore() {
		return rawAppealScore;
	}

	public void setRawAppealScore(double rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

	public double getRelevanceScore() {
		return relevanceScore;
	}

	public void setRelevanceScore(double relevanceScore) {
		this.relevanceScore = relevanceScore;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public boolean isCarPackage() {
		return carPackage;
	}

	public void setCarPackage(boolean carPackage) {
		this.carPackage = carPackage;
	}

	public boolean isAllInclusive() {
		return allInclusive;
	}

	public void setAllInclusive(boolean allInclusive) {
		this.allInclusive = allInclusive;
	}
}
