package com.BuzzCars.services;

import java.util.List;

import com.BuzzCars.entity.InventoryClerk;

public interface InventoryClerkService {

	public List<InventoryClerk> getAll();

	public InventoryClerk save(InventoryClerk inventoryClerk);

}
