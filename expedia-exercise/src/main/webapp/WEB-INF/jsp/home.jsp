<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">

<script>
			$(function () {
				$("#minTripStartDate").datepicker({
					dateFormat: "yy-mm-dd"
				});
				$("#maxTripStartDate").datepicker({
					dateFormat: "yy-mm-dd"
				});
			});

		</script>
<title>Expedia Exercise</title>
</head>
<body>
	<div class="container">
	<div class="row">
		<div class="col-4">
			<div class="card my-2">
				<form class="card-body">
					<div class="mt-2">
						<label for="destination">Destination</label> <input
							placeholder="Destination, City, or Region ID" name="destination"
							type="text" class="form-control" id="destination"
							value="${destination}">
					</div>
					<div class="mt-2">
						<label for="minTripStartDate">Check in</label> <input
							name="minTripStartDate" type="text" class="form-control"
							id="minTripStartDate" value="${minTripStartDate}">
					</div>
					<div class="mt-2">
						<label for="maxTripStartDate">Check out</label> <input
							name="maxTripStartDate" type="text" class="form-control"
							id="maxTripStartDate" value="${maxTripStartDate}">
					</div>
					<div class="mt-2">
						<label for="lengthOfStay">Stay Length</label> <select
							name="lengthOfStay" class="form-control" id="lengthOfStay">
							<c:forEach var="n" items="${stayLengths}">
								<option ${n == lengthOfStay ? 'selected' : ''}>${n == 0 ? '' : n}</option>
							</c:forEach>
						</select>
					</div>
					<div class="mt-2">
						<label id="minTotalRate">Min. Total Rate</label> <input
							name="minTotalRate" type="text" class="form-control"
							id="minTotalRate" value="${minTotalRate}">
					</div>
					<div class="mt-2">
						<label id="maxTotalRate">Max. Total Rate</label> <input
							name="maxTotalRate" type="text" class="form-control"
							id="maxTotalRate" value="${maxTotalRate}">
					</div>
					<div class="mt-2">
						<label id="starRating">Star Rating</label>
						<div class="row">
							<div class="col">
								<select name="minStarRating" class="form-control" id="minStarRating">
										<option value=""></option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
								</select>
							
							</div>
							_
							<div class="col">
								<select name="maxStarRating" class="form-control" id="maxStarRating">
										<option value=""></option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
								</select>
							</div>
						</div>
					</div>
					<div class="mt-2">
						<label id="guestRating">Guest Rating</label>
						<div class="row">
							<div class="col">
								<select name="minGuestRating" class="form-control" id="minGuestRating">
										<option value=""></option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
								</select>
							
							</div>
							_
							<div class="col">
								<select name="maxGuestRating" class="form-control" id="maxGuestRating">
										<option value=""></option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
								</select>
							</div>
						</div>
						<!--<input
							name="minGuestRating" hidden type="text" id="minGuestRating">
						<input name="maxGuestRating" hidden type="text"
							id="maxGuestRating">
						<div id="guestRatingSlider"></div> -->
					</div>
					<div class="mt-5">
						<button type="submit" class="btn btn-primary">
							<span class="glyphicon glyphicon-search"></span> Search
						</button>
					</div>
				</form>
			</div>
		</div>
		<div class="col">
			<c:forEach var="hotel" items="${hotels}">
				<div class="card my-2">
					<div class="card-body">
						<div class="row">
							<div class="col-auto">
								<img src="${hotel.hotelInfo.hotelImageUrl}"
									alt="${hotel.hotelInfo.hotelName}" class="media-object"
									style="width: 80px">
							</div>
							<div class="col">
								<h5>${hotel.hotelInfo.hotelName} <small><i class="fas fa-star text-warning"></i> ${hotel.hotelInfo.hotelStarRating} </small></h5>
									<div class="row">
										<div class="col">
											<p><i class="fas fa-map-marker-alt"></i> ${hotel.hotelInfo.hotelCity}</p>
										</div>
										<c:if test="${hotel.hotelPricingInfo.drr}">
											<div class="col1">
												<p><i class="fas fa-dollar-sign text-warning"></i>${hotel.hotelPricingInfo.originalPricePerNight}</p>
											</div>
										</c:if>
										<div class="col1">
											<p class="font-weight-bold"><i class="fas fa-dollar-sign"></i>${hotel.hotelPricingInfo.averagePriceValue}</p>
										</div>
										<div class="col-md-${hotel.hotelPricingInfo.drr ? 10 : 11}">${hotel.hotelInfo.description}</div>
									</div>
									<hr>
									<div>
										<span style="font-weight: bold"><i class="fas fa-users"></i><i class="fas fa-star" style="font-size: 10px"></i> </span>${hotel.hotelInfo.hotelGuestReviewRating}</div>
									<div>
										<span style="font-weight: bold"><i class="fas fa-bed"></i> </span>${hotel.offerDateRange.lengthOfStay}
										Days
									</div>
									<div>
										<span style="font-weight: bold"><i class="fas fa-calendar-alt"></i> </span>${fn:join(hotel.offerDateRange.travelStartDate, '-')} - ${fn:join(hotel.offerDateRange.travelEndDate, '-')}</div>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	</div>
</body>
</html>
