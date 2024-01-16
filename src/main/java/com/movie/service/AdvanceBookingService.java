package com.movie.service;

import java.util.List;

import com.movie.model.AdvanceBooking;

public interface AdvanceBookingService {
	List<AdvanceBooking> getAllBookings();

	AdvanceBooking getAdvanceBookingById(Long booking_id);

	AdvanceBooking newAdvanceBoking(AdvanceBooking newBooking);

	AdvanceBooking updateAdvanceBooking(AdvanceBooking updatedBooking, Long booking_id);

	void deleteAdvanceBookingById(Long booking_id);

}
