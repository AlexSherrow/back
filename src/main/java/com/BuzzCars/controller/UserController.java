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

import com.BuzzCars.entity.InventoryClerk;
import com.BuzzCars.entity.Manager;
import com.BuzzCars.entity.Owner;
import com.BuzzCars.entity.Salespeople;
import com.BuzzCars.entity.User;
import com.BuzzCars.services.InventoryClerkService;
import com.BuzzCars.services.ManagerService;
import com.BuzzCars.services.OwnerService;
import com.BuzzCars.services.SalespeopleService;
import com.BuzzCars.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	final String url = "http://localhost:3000";

	@Autowired
	private UserService userService;
	@Autowired
	private ManagerService managerService;
	@Autowired
	private InventoryClerkService inventoryClerkService;
	@Autowired
	private OwnerService ownerService;
	@Autowired
	private SalespeopleService salespeopleService;

	@CrossOrigin(origins = url)
	@GetMapping("/getAll")
	public List<User> getAll() {
		return userService.getAll();
	}

	@CrossOrigin(origins = url)
	@PostMapping("/save")
	public ResponseEntity<Map> add(@RequestBody HashMap input) {
		Map response = new HashMap<>();
		response.put("message", "input received");
		String username = (String) input.get("userName");
		String password = (String) input.get("password");
		String firstname = (String) input.get("firstName");
		String lastname = (String) input.get("lastName");
		String type = (String) input.get("type");

		User user = new User(username, password, firstname, lastname);
		userService.save(user);

		switch (type) {
		case "Owner":
			Owner owner = new Owner(username);
			ownerService.save(owner);
			break;

		case "Salespeople":
			Salespeople salespoeple = new Salespeople(username);
			salespeopleService.save(salespoeple);
			break;

		case "InventoryClerk":
			InventoryClerk inventoryClerk = new InventoryClerk(username);
			inventoryClerkService.save(inventoryClerk);
			break;

		case "Manager":
			Manager manager = new Manager(username);
			managerService.save(manager);
			break;
		}

		return new ResponseEntity<Map>(response, HttpStatus.OK);
	}

}
