package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.model.Auditorium;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Long> {
}
