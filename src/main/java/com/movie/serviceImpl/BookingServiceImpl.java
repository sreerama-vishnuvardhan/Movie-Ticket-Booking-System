package com.movie.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.movie.model.Booking;
import com.movie.repository.BookingRepository;
import com.movie.service.BookingService;

@Service
@Primary
public class BookingServiceImpl implements BookingService {
	private BookingRepository bookingRepository;

	@Autowired
	public BookingServiceImpl(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}

	@Override
	public List<Booking> getAllBookings() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking getBookingById(Long booking_id) {
		return null;
	}

	@Override
	public Booking newBoking(Booking newBooking) {
		return null;
	}

	@Override
	public Booking updateBooking(Booking updatedBooking, Long booking_id) {
		return null;
	}

	@Override
	public void deleteBookingById(Long booking_id) {

	}
}
