package com.BuzzCars.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BuzzCars.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	@Query("SELECT u from User u")
	List<User> findAllQuery();

//	@Query("SELECT s from Song s where s.artist = :artistName")
//	List<Song> findAllByArtist(@Param("artistName") String artistName);

}
