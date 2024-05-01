 package com.infy.moviebooking.dto;

import java.time.LocalDate;


import com.infy.moviebooking.entity.Series;

public class SeriesDTO {

	private Integer SeriesId;
	private String SeriesName;
	
	
	
	private String SeriesType;
	


	public Integer getSeriesId() {
		return SeriesId;
	}
	public void setSeriesId(Integer seriesId) {
		SeriesId = seriesId;
	}
	public String getSeriesName() {
		return SeriesName;
	}
	public void setSeriesName(String seriesName) {
		SeriesName = seriesName;
	}
	public String getSeriesType() {
		return SeriesType;
	}
	public void setSeriesType(String seriesType) {
		SeriesType = seriesType;
	}
//	public static SeriesDTO prepareDTO(Series movieBooking)
//	{
//		SeriesDTO movieBookingDTO=new SeriesDTO();
//		movieBookingDTO.setBookingId(movieBooking.getBookingId());
//		movieBookingDTO.setMovieName(movieBooking.getMovieName());
//		movieBookingDTO.setScreenName(movieBooking.getScreenName());
//		movieBookingDTO.setShowDate(movieBooking.getShowDate());
//		movieBookingDTO.setNoOfSeats(movieBooking.getNoOfSeats());
//		movieBookingDTO.setBookingAmount(movieBooking.getBookingAmount());
//		movieBookingDTO.setPaymentType(movieBooking.getPaymentType());
//		movieBookingDTO.setCustomerPhoneNo(movieBooking.getCustomerPhoneNo());
//		return movieBookingDTO;
//		
//	}
//	public static Series prepareEntity(SeriesDTO movieBookingDTO)
//	{
//		Series movieBooking=new Series();
//		movieBooking.setMovieName(movieBooking.getMovieName());
//		movieBooking.setScreenName(movieBookingDTO.getScreenName());
//		movieBooking.setShowDate(movieBookingDTO.getShowDate());
//		movieBooking.setNoOfSeats(movieBookingDTO.getNoOfSeats());
//		movieBooking.setPaymentType(movieBookingDTO.getPaymentType());
//		movieBooking.setCustomerPhoneNo(movieBookingDTO.getCustomerPhoneNo());
//		return movieBooking;
//		
//	}
}
