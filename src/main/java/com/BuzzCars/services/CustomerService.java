package com.BuzzCars.services;

import java.util.List;

import com.BuzzCars.entity.Customer;

public interface CustomerService {

	public List<Customer> getAll();

	public Customer save(Customer customer);

}
