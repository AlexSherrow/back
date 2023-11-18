package com.BuzzCars.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BuzzCars.entity.Individual;

public interface IndividualRepository extends JpaRepository<Individual, String> {

}
