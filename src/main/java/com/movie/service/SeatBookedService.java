package com.movie.service;

import java.util.List;

import com.movie.model.SeatBooked;

public interface SeatBookedService {
	List<SeatBooked> getAllSeatBooked();

	SeatBooked getSeatBookedById(Long seat_booked_id);

	SeatBooked addSeatBooked(SeatBooked newSeatBooked);

	SeatBooked updateSeatBooked(SeatBooked updatedSeatBooked, Long seat_booked_id);

	void deleteSeatBookedById(Long seat_booked_id);
}
