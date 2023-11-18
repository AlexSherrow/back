package com.BuzzCars.services;

import java.util.List;

import com.BuzzCars.entity.Individual;

public interface IndividualService {

	public List<Individual> getAll();

	public Individual save(Individual individual);

}
