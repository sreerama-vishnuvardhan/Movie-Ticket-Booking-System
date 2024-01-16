package com.movie.service;

import java.util.List;

import com.movie.model.Booking;

public interface BookingService {
	List<Booking> getAllBookings();

	Booking getBookingById(Long booking_id);

	Booking newBoking(Booking newBooking);

	Booking updateBooking(Booking updatedBooking, Long booking_id);

	void deleteBookingById(Long booking_id);
}
