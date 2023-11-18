package com.BuzzCars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BuzzCars.dao.ManagerRepository;
import com.BuzzCars.entity.Manager;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerRepository managerRepository;

	@Override
	public List<Manager> getAll() {
		// TODO Auto-generated method stub
		return managerRepository.findAll();
	}

	@Override
	public Manager save(Manager manager) {
		return managerRepository.save(manager);
	}

}
