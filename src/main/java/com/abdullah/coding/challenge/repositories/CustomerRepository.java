package com.abdullah.coding.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah.coding.challenge.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>  {

	public Customer getCustomerById(int id);
	
}
