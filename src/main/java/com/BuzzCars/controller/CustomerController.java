package com.BuzzCars.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BuzzCars.entity.Customer;
import com.BuzzCars.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	final String url = "http://localhost:3000";

	@Autowired
	private CustomerService customerService;

	@CrossOrigin(origins = url)
	@GetMapping("/getAll")
	public List<Customer> getAll() {
		return customerService.getAll();
	}

	@CrossOrigin(origins = url)
	@PostMapping("/save")
	public ResponseEntity<Map> add(@RequestBody HashMap input) {
		Map response = new HashMap<>();
		response.put("message", "input received");
		String state = (String) input.get("state");
		String city = (String) input.get("city");
		String street = (String) input.get("street");
		String postalCode = (String) input.get("postalCode");
		String phoneNumber = (String) input.get("phoneNumber");
		String email = (String) input.get("email");
		String businessTaxId = (String) input.get("businessTaxId");
		String driversLicenseNumber = (String) input.get("driversLicenseNumber");

		Customer customer = new Customer(businessTaxId, driversLicenseNumber, street, city, state, postalCode,
				phoneNumber, email);
		customerService.save(customer);

		return new ResponseEntity<Map>(response, HttpStatus.OK);
	}

}
