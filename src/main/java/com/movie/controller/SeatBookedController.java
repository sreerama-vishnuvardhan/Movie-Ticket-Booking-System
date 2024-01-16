package com.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.SeatBooked;
import com.movie.service.SeatBookedService;

@RestController
public class SeatBookedController {
	private SeatBookedService seatBookedService;

	@Autowired
	public SeatBookedController(SeatBookedService seatBookedService) {
		this.seatBookedService = seatBookedService;
	}

	@GetMapping("/seatbooked")
	public List<SeatBooked> getAllSeatBooked() {
		return seatBookedService.getAllSeatBooked();
	}
}
