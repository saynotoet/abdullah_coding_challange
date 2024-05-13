package com.abdullah.coding.challenge.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah.coding.challenge.entities.Cab;

public interface CabRepository extends JpaRepository<Cab, Integer> {

		public List<Cab> getByVehicleType(String vehicleType);
		public Cab save(Cab cab);
}
