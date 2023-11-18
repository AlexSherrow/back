package com.BuzzCars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BuzzCars.dao.SalespeopleRepository;
import com.BuzzCars.entity.Salespeople;

@Service
public class SalespeopleServiceImpl implements SalespeopleService {

	@Autowired
	private SalespeopleRepository salespeopleRepository;

	@Override
	public List<Salespeople> getAll() {
		// TODO Auto-generated method stub
		return salespeopleRepository.findAll();
	}

	@Override
	public Salespeople save(Salespeople salespeople) {
		return salespeopleRepository.save(salespeople);
	}

}
