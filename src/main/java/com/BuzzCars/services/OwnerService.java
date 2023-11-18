package com.BuzzCars.services;

import java.util.List;

import com.BuzzCars.entity.Owner;

public interface OwnerService {

	public List<Owner> getAll();

	public Owner save(Owner owner);

}
