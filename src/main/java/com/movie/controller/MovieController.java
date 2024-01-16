package com.movie.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Movie;
import com.movie.model.Screening;
import com.movie.service.MovieService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MovieController {
    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<?> getAllMovies(@RequestParam Map<String, String> dates) {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.status(HttpStatus.OK).body(movies);
    }

    @GetMapping("/movies/{movie_id}")
    public ResponseEntity<?> getMovieById(@PathVariable Long movie_id) {
        Movie movie = movieService.getMovieById(movie_id);
        return ResponseEntity.status(HttpStatus.OK).body(movie);
    }

    @GetMapping("/movies/{movie_id}/screenings")
    public ResponseEntity<?> getAllScreeningByMovieId(@PathVariable Long movie_id) {
        List<Screening> screenings = movieService.getAllScreeningByMovieId(movie_id);
        return ResponseEntity.status(HttpStatus.OK).body(screenings);
    }

    @DeleteMapping("/movies/{movie_id}")
    public ResponseEntity<?> deleteMovieById(@PathVariable Long movie_id) {
        movieService.deleteMovie(movie_id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/movies")
    public ResponseEntity<?> addMovies( @RequestBody Movie movie) {
        movieService.addMovie(movie);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}