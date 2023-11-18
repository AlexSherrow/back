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

import com.BuzzCars.entity.Vehicle;
import com.BuzzCars.services.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	// Production Credentials
	// final String url =
	// "https://cs6400team098frontend-74236d6b9cea.herokuapp.com/";

	// Local credentials
	final String url = "https://cs6400team098frontend-74236d6b9cea.herokuapp.com/";

	@Autowired
	private VehicleService vehicleService;

	@CrossOrigin(origins = url)
	@GetMapping("/getAll")
	public List<Vehicle> getAll() {
		return vehicleService.getAll();
	}

	@CrossOrigin(origins = url)
	@PostMapping("/save")
	public ResponseEntity<Map> add(@RequestBody HashMap input) {
		Map response = new HashMap<>();
		response.put("message", "input received");
		String modelName = (String) input.get("modelName");
		int modelYear = (int) input.get("modelYear");
		String description = (String) input.get("description");
		String vin = (String) input.get("vin");
		int mileage = (int) input.get("mileage");
		String manufacturer = (String) input.get("manufacturer");
		String chasisType = (String) input.get("chasisType");
		String fuelType = (String) input.get("fuelType");

		Vehicle vehicle = new Vehicle(modelName, modelYear, description, vin, mileage, manufacturer, chasisType,
				fuelType);
		vehicleService.save(vehicle);

		return new ResponseEntity<Map>(response, HttpStatus.OK);
	}

}
