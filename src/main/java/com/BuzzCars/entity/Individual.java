package com.BuzzCars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Individual {

	@Id
	@Column(name = "drivers_license_number", nullable = false)
	String driversLicenseNumber;

	@Column(nullable = false)
	String firstName;

	@Column(nullable = false)
	String lastName;

	public Individual() {
		// TODO Auto-generated constructor stub
	}

	public Individual(String driversLicenseNumber, String businessName, String contactTitle, String firstName,
			String lastName) {
		super();
		this.driversLicenseNumber = driversLicenseNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "drivers_license_number")
	private Customer customer;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
