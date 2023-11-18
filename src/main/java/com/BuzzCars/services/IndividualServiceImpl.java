package com.BuzzCars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BuzzCars.dao.IndividualRepository;
import com.BuzzCars.entity.Individual;

@Service
public class IndividualServiceImpl implements IndividualService {

	@Autowired
	private IndividualRepository individualRepository;

	@Override
	public List<Individual> getAll() {
		// TODO Auto-generated method stub
		return individualRepository.findAll();
	}

	@Override
	public Individual save(Individual individual) {
		// TODO Auto-generated method stub
		return individualRepository.save(individual);
	}

}
