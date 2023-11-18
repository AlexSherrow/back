package com.BuzzCars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BuzzCars.dao.BusinessRepository;
import com.BuzzCars.entity.Business;

@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private BusinessRepository businessRepository;

	@Override
	public List<Business> getAll() {
		// TODO Auto-generated method stub
		return businessRepository.findAll();
	}

	@Override
	public Business save(Business business) {
		// TODO Auto-generated method stub
		return businessRepository.save(business);
	}

}
