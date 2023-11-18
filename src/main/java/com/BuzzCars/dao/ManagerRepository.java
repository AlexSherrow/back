package com.BuzzCars.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BuzzCars.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, String> {

}
