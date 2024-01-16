package com.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Seat;
import com.movie.service.SeatService;

@RestController
public class SeatController {
	private SeatService seatService;

	@Autowired
	public SeatController(SeatService seatService) {
		this.seatService = seatService;
	}

	@GetMapping("/seats")
	public List<Seat> getAllSeats() {
		return this.seatService.getAllSeats();
	}
}
