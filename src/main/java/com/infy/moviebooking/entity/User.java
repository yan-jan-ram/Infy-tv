package com.infy.moviebooking.entity;

import com.infy.moviebooking.dto.SeriesDTO;

public class User {
	private Integer registrationId;
	 private String userName;
	 private SeriesDTO series;
	public Integer getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public SeriesDTO getSeries() {
		return series;
	}
	public void setSeries(SeriesDTO series) {
		this.series = series;
	}
}
