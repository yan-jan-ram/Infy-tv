package com.infy.moviebooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.infy.moviebooking.dto.SeriesDTO;
import com.infy.moviebooking.dto.UserDTO;
import com.infy.moviebooking.exception.infyTvSeriesException;
import com.infy.moviebooking.repository.SeriesRepository;
import com.infy.moviebooking.repository.UserRepository;

public class SeriesBookingServiceImpl implements SeriesBookingService{
@Autowired
private SeriesRepository seriesRepository;
@Autowired
private UserRepository userRepository;
	@Override
	public Integer registerUser(SeriesDTO seriesDTO) throws infyTvSeriesException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> getDeatailsByUserEmails(String email) throws infyTvSeriesException {
		// TODO Auto-generated method stub
		return null;
	}



}
