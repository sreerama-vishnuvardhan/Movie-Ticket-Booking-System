package com.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Auditorium;
import com.movie.service.AuditoriumService;

@RestController
public class AuditoriumController {
	private AuditoriumService auditoriumService;

	@Autowired
	public AuditoriumController(AuditoriumService auditoriumService) {
		this.auditoriumService = auditoriumService;
	}

	@GetMapping("/auditoriums")
	public List<Auditorium> getAllTheatres() {
		return auditoriumService.getAllAuditoriums();
	}
}
