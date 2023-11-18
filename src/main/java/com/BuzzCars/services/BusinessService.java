package com.BuzzCars.services;

import java.util.List;

import com.BuzzCars.entity.Business;

public interface BusinessService {

	public List<Business> getAll();

	public Business save(Business business);

}
