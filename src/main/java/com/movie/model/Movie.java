package com.movie.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movie_id")
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "poster")
	private String poster;

	@Column(name = "genre")
	private String genre;

	@Column(name = "duration")
	private Integer duration;

	@Column(name = "language")
	private String language;

	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonIgnore
	private Set<Screening> screenings;
}