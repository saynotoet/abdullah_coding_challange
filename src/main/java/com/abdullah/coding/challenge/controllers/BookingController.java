package com.abdullah.coding.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah.coding.challenge.entities.BookingRequest;
import com.abdullah.coding.challenge.services.BookingService;

@RestController
@RequestMapping("booking")
public class BookingController {

	
	@Autowired
	BookingService bookingService;

	@PostMapping("/bookRide")
	public void bookRide(@RequestBody BookingRequest bookingRequest) {

		bookingService.bookRide(bookingRequest);
	}
}
