package com.BuzzCars.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BuzzCars.entity.Business;

public interface BusinessRepository extends JpaRepository<Business, String> {

}
