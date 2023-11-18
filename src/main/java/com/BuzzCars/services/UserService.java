package com.BuzzCars.services;

import java.util.List;

import com.BuzzCars.entity.User;

public interface UserService {

	public List<User> getAll();

	public User save(User user);

}
