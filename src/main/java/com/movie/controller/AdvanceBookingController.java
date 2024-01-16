package com.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.AdvanceBooking;
import com.movie.service.AdvanceBookingService;

@RestController
public class AdvanceBookingController {
	private AdvanceBookingService advanceBookingService;

	@Autowired
	public AdvanceBookingController(AdvanceBookingService advanceBookingService) {
		this.advanceBookingService = advanceBookingService;
	}

	@GetMapping("/advanceBookings")
	public List<AdvanceBooking> getAllAdvanceBookings() {
		return advanceBookingService.getAllBookings();
	}
}
