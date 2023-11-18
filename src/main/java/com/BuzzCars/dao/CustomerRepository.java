package com.BuzzCars.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BuzzCars.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
