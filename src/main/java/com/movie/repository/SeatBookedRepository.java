package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.model.SeatBooked;

public interface SeatBookedRepository extends JpaRepository<SeatBooked, Long> {
}
