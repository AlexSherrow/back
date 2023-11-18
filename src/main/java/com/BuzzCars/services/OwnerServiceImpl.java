package com.BuzzCars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BuzzCars.dao.OwnerRepository;
import com.BuzzCars.entity.Owner;

@Service
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;

	@Override
	public List<Owner> getAll() {
		// TODO Auto-generated method stub
		return ownerRepository.findAll();
	}

	@Override
	public Owner save(Owner owner) {
		return ownerRepository.save(owner);
	}

}
