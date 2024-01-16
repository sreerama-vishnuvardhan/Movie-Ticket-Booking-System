package com.movie.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.movie.model.Seat;
import com.movie.repository.SeatRepository;
import com.movie.service.SeatService;

@Service
@Primary
public class SeatServiceImpl implements SeatService {
	private SeatRepository seatRepository;

	@Autowired
	public SeatServiceImpl(SeatRepository seatRepository) {
		this.seatRepository = seatRepository;
	}

	@Override
	public List<Seat> getAllSeats() {
		return seatRepository.findAll();
	}

	@Override
	public Seat getSeatById(Long seat_id) {
		return null;
	}

	@Override
	public Seat addSeat(Seat newSeat) {
		return null;
	}

	@Override
	public Seat updateSeat(Seat updatedSeat, Long seat_id) {
		return null;
	}

	@Override
	public void deleteSeatById(Long seat_id) {

	}
}
