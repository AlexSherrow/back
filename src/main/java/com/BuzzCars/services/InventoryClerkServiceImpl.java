package com.BuzzCars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BuzzCars.dao.InventoryClerkRepository;
import com.BuzzCars.entity.InventoryClerk;

@Service
public class InventoryClerkServiceImpl implements InventoryClerkService {

	@Autowired
	private InventoryClerkRepository inventoryClerkRepository;

	@Override
	public List<InventoryClerk> getAll() {
		// TODO Auto-generated method stub
		return inventoryClerkRepository.findAll();
	}

	@Override
	public InventoryClerk save(InventoryClerk inventoryClerk) {
		return inventoryClerkRepository.save(inventoryClerk);
	}

}
