package com.movie.service;

import java.util.List;

import com.movie.model.Auditorium;

public interface AuditoriumService {
	List<Auditorium> getAllAuditoriums();

	Auditorium getAuditoriumById(Long auditorium_id);

	Auditorium addAuditorium(Auditorium newAuditorium);

	Auditorium updateAuditorium(Auditorium updatedAuditorium, Long auditorium_id);

	void deleteAuditoriumById(Long auditorium_id);
}
