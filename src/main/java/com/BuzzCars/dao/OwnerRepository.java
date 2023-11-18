package com.BuzzCars.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BuzzCars.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, String> {

}
