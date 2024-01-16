package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
