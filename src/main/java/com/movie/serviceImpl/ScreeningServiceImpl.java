package com.movie.serviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.movie.exception.ScreeningNotFoundException;
import com.movie.model.Screening;
import com.movie.model.Seat;
import com.movie.repository.ScreeningRepository;
import com.movie.service.ScreeningService;

@Service
@Primary
public class ScreeningServiceImpl implements ScreeningService {
	private ScreeningRepository screeningRepository;

	@Autowired
	public ScreeningServiceImpl(ScreeningRepository screeningRepository) {
		this.screeningRepository = screeningRepository;
	}

	@Override
	public List<Screening> getAllScreenings() {
		return screeningRepository.findAll();
	}

	@Override
	public List<Screening> getAllScreenings(LocalDate startDate, LocalDate endDate) {
		return screeningRepository.findAll().stream()
				.filter(screening -> screening.getDate().isAfter(startDate) && screening.getDate().isBefore(endDate))
				.collect(Collectors.toList());
	}

	@Override
	public Screening getScreeningById(Long screening_id) {
		return screeningRepository.findById(screening_id).orElseThrow(ScreeningNotFoundException::new);
	}

	@Override
	public Screening addScreening(Screening newScreening) {
		return null;
	}

	@Override
	public Screening updateScreening(Screening updatedScreening, Long screening_id) {
		return null;
	}

	@Override
	public List<Seat> getSeatsByScreeningId(Long screening_id) {
		Screening screening = getScreeningById(screening_id);
		if (screening.getIsFull()) {
			return new ArrayList<>();
		}
		return new ArrayList<>(screening.getAuditorium().getSeats());
	}
}
