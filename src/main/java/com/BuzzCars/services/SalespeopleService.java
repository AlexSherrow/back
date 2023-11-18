package com.BuzzCars.services;

import java.util.List;

import com.BuzzCars.entity.Salespeople;

public interface SalespeopleService {

	public List<Salespeople> getAll();

	public Salespeople save(Salespeople salespeople);

}
