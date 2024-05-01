package com.infy.moviebooking.entity;

import java.time.LocalDate;

public class Series {
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
}
