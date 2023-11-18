package com.BuzzCars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Business {

	@Id
	@Column(name = "business_tax_id", nullable = false)
	String businessTaxId;

	@Column(nullable = false)
	String businessName;

	@Column(nullable = false)
	String contactTitle;

	@Column(nullable = false)
	String firstName;

	@Column(nullable = false)
	String lastName;

	public Business() {
		// TODO Auto-generated constructor stub
	}

	public Business(String businessTaxId, String businessName, String contactTitle, String firstName, String lastName) {
		super();
		this.businessTaxId = businessTaxId;
		this.businessName = businessName;
		this.contactTitle = contactTitle;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "business_tax_id")
	private Customer customer;

	public String getBusinessTaxId() {
		return businessTaxId;
	}

	public void setBusinessTaxId(String businessTaxId) {
		this.businessTaxId = businessTaxId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

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
