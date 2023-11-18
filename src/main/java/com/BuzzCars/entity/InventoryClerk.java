package com.BuzzCars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inventoryClerk")
public class InventoryClerk {
	@Id
	@Column(name = "username")
	String username;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "username")
	private User user;

	public InventoryClerk() {
	}

	public InventoryClerk(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}