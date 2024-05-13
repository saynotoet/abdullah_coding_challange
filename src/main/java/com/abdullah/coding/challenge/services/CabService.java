package com.abdullah.coding.challenge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah.coding.challenge.entities.Cab;
import com.abdullah.coding.challenge.repositories.CabRepository;

@Service
public class CabService {
	
	@Autowired
	CabRepository cabRepository;
	
	public void updateCabStatus(Cab cab) {
		cabRepository.save(cab);
	}
	
}
