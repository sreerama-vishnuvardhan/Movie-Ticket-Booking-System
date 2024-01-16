package com.movie.serviceImpl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.movie.model.Theatre;
import com.movie.repository.TheatreRepository;
import com.movie.service.TheatreService;

@Service
@Primary
public class TheatreServiceImpl implements TheatreService {
	private TheatreRepository theatreRepository;

	public TheatreServiceImpl(TheatreRepository theatreRepository) {
		this.theatreRepository = theatreRepository;
	}

	@Override
	public List<Theatre> getAllTheatres() {
		return theatreRepository.findAll();
	}

	@Override
	public Theatre getTheatreById(Long theatre_id) {
		return null;
	}

	@Override
	public Theatre addTheatre(Theatre newTheatre) {
		return null;
	}

	@Override
	public Theatre updateTheatre(Theatre updatedTheatre, Long theatre_id) {
		return null;
	}

	@Override
	public void deleteTheatreById(Long theatre_id) {

	}
}
