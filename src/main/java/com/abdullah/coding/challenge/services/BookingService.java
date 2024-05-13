package com.abdullah.coding.challenge.services;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah.coding.challenge.entities.Booking;
import com.abdullah.coding.challenge.entities.BookingRequest;
import com.abdullah.coding.challenge.entities.Cab;
import com.abdullah.coding.challenge.entities.Customer;
import com.abdullah.coding.challenge.enums.BookingStatus;
import com.abdullah.coding.challenge.repositories.BookingRepository;
import com.abdullah.coding.challenge.repositories.CabRepository;
import com.abdullah.coding.challenge.repositories.CustomerRepository;

@Service
public class BookingService {


	@Autowired 
	CustomerRepository customerRepository;
	
	@Autowired
	CabRepository cabRepository;

	@Autowired 
	BookingRepository bookingRepository;
	
	public Booking bookRide(BookingRequest bookingRequest) {
		boolean isCabAvailable=false;
		Customer customer = customerRepository.getCustomerById(bookingRequest.getCustomerId());
		
		if(!customer.getStatus().equalsIgnoreCase("ACTIVE")) {
			return null;
		}
		bookingRequest.setCustomerId(customer.getId());
		
		List<Cab> cabList=cabRepository.getByVehicleType(bookingRequest.getVehicalType());
		Cab cab=null;
		for(int i=0;i<cabList.size() && !isCabAvailable ;i++) {
			if(cabList.get(i).getStatus().equalsIgnoreCase("AVAILABLE")) {
				isCabAvailable=true;
				bookingRequest.setCabId(cabList.get(i).getId());
				cab=cabList.get(i);
			}
		}
		
		Booking booking =new Booking();
		
		booking.setCab(cab);
		booking.setCustomer(customer);
		booking.setStatus(BookingStatus.REQUESTED.toString());
		booking.setVehicalType(cab.getVehicleType());
		booking.setBookingCode(bookingRequest.getBookingCode());
		booking.setCreationTime(new Timestamp(System.currentTimeMillis()));
		booking.setRequestTime(bookingRequest.getRequestTime());
		
		
		return bookingRepository.save(booking);
		
	}

	
}
