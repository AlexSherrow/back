package com.BuzzCars.services;

import java.util.List;

import com.BuzzCars.entity.Manager;

public interface ManagerService {

	public List<Manager> getAll();

	public Manager save(Manager manager);

}
