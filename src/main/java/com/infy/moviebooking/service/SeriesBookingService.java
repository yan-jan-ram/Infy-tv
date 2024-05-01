package com.infy.moviebooking.service;

import java.util.List;


import com.infy.moviebooking.dto.SeriesDTO;
import com.infy.moviebooking.dto.UserDTO;
import com.infy.moviebooking.exception.infyTvSeriesException;

public interface SeriesBookingService {
public Integer registerUser(SeriesDTO seriesDTO) throws infyTvSeriesException;
	 public List<UserDTO>getDeatailsByUserEmails(String email) throws infyTvSeriesException;

}
