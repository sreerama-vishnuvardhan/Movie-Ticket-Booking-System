package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
