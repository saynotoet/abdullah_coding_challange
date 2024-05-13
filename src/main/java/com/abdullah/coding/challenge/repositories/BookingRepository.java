package com.abdullah.coding.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah.coding.challenge.entities.Booking;
 
public interface BookingRepository extends JpaRepository<Booking,Integer> {
	
	public Booking save(Booking booking);
}
