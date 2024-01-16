package com.movie.exception;

public class MovieNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3210978310119874667L;

	public MovieNotFoundException(Long movie_id) {
	}
}