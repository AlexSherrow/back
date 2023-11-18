package com.BuzzCars.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BuzzCars.entity.Salespeople;

public interface SalespeopleRepository extends JpaRepository<Salespeople, String> {

}
