package com.infy.moviebooking.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.moviebooking.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
