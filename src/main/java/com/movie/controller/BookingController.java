package com.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Booking;
import com.movie.service.BookingService;

@RestController
public class BookingController {
	private BookingService bookingService;

	@Autowired
	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}

	@GetMapping("/bookings")
	public List<Booking> getAllBookings() {
		return bookingService.getAllBookings();
	}
}
