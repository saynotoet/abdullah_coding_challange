package com.abdullah.coding.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah.coding.challenge.entities.Booking;
import com.abdullah.coding.challenge.entities.BookingRequest;
import com.abdullah.coding.challenge.enums.CabStatus;
import com.abdullah.coding.challenge.services.BookingService;
import com.abdullah.coding.challenge.services.CabService;

@RestController
@RequestMapping("booking")
public class BookingController {

	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	CabService cabService;

	@PostMapping("/bookRide")
	public void bookRide(@RequestBody BookingRequest bookingRequest) {
		
		
		 Booking booking = bookingService.bookRide(bookingRequest);
		 if(booking != null) {
			 booking.getCab().setStatus(CabStatus.NOT_AVAILABLE.toString());
			cabService.updateCabStatus(booking.getCab()); 
		 }
			
		
	}
}
