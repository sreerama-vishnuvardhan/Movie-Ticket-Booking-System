package com.movie.serviceImpl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.movie.model.AdvanceBooking;
import com.movie.service.AdvanceBookingService;

@Service
@Primary
public class AdvanceBookingServiceImpl implements AdvanceBookingService {

	@Override
	public List<AdvanceBooking> getAllBookings() {
		return null;
	}

	@Override
	public AdvanceBooking getAdvanceBookingById(Long booking_id) {
		return null;
	}

	@Override
	public AdvanceBooking newAdvanceBoking(AdvanceBooking newBooking) {
		return null;
	}

	@Override
	public AdvanceBooking updateAdvanceBooking(AdvanceBooking updatedBooking, Long booking_id) {
		return null;
	}

	@Override
	public void deleteAdvanceBookingById(Long booking_id) {

	}

}
