package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.model.Theatre;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
}
