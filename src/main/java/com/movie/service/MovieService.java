package com.movie.service;

import java.time.LocalDate;
import java.util.List;

import com.movie.model.Movie;
import com.movie.model.Screening;

public interface MovieService {
	List<Movie> getAllMovies();

	Movie getMovieById(Long movie_id);

	Movie addMovie(Movie newMovie);

	Movie updateMovie(Movie updatedMovie, Long movie_id);

	void deleteMovie(Long movie_id);

	List<Screening> getAllScreeningByMovieId(Long movie_id);

	List<Screening> getAllScreeningByMovieIdAndDate(Long movie_id, LocalDate localDate);
}
