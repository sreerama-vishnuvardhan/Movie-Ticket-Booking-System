package com.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Theatre;
import com.movie.service.TheatreService;

@RestController
public class TheatreController {
	private TheatreService theatreService;

	@Autowired
	public TheatreController(TheatreService theatreService) {
		this.theatreService = theatreService;
	}

	@GetMapping("/theatres")
	public List<Theatre> getAllTheatres() {
		return theatreService.getAllTheatres();
	}
}
