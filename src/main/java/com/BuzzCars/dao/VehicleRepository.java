package com.BuzzCars.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BuzzCars.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

//	@Query("SELECT u from User u")
//	List<Vehicle> findAllQuery();

//	@Query("SELECT s from Song s where s.artist = :artistName")
//	List<Song> findAllByArtist(@Param("artistName") String artistName);

}
