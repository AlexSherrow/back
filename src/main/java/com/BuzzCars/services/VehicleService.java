package com.BuzzCars.services;

import java.util.List;

import com.BuzzCars.entity.Vehicle;

public interface VehicleService {

	public List<Vehicle> getAll();

	public Vehicle save(Vehicle vehicle);

}
