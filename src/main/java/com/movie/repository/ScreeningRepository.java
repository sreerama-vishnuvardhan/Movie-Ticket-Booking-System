package com.movie.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.model.Screening;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {}
